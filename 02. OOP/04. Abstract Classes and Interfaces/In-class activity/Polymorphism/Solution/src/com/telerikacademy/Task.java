package com.telerikacademy;

import java.time.LocalDate;

public class Task extends BoardItem {

    private static final Status TASK_STARTING_STATUS = Status.TODO;
    private static final int ASSIGNEE_MIN_LENGTH = 5;
    private static final int ASSIGNEE_MAX_LENGTH = 30;
    private String assignee;

    public Task(String title, String assignee, LocalDate dueDate) {
        super(title, dueDate, TASK_STARTING_STATUS);

        ensureValidAssignee(assignee);
        this.assignee = assignee;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        ensureValidAssignee(assignee);

        logEvent(String.format("Assignee changed from %s to %s", getAssignee(), assignee));

        this.assignee = assignee;
    }

    private void ensureValidAssignee(String assignee) {
        if (assignee.length() < ASSIGNEE_MIN_LENGTH || assignee.length() > ASSIGNEE_MAX_LENGTH) {
            throw new IllegalArgumentException(String.format(
                    "The assignee's name must be between %d and %d characters.",ASSIGNEE_MIN_LENGTH, ASSIGNEE_MAX_LENGTH));
        }
    }

    @Override
    public void revertStatus() {
        if (getStatus() != TASK_STARTING_STATUS) {
            Status newStatus = Status.values()[getStatus().ordinal() - 1];
            logEvent(String.format("Task status changed from %s to %s", getStatus(), newStatus));

            setStatus(newStatus);
        } else {
            logEvent(String.format("Can't revert, already at %s", getStatus()));
        }
    }

    @Override
    public void advanceStatus() {
        if (getStatus() != ITEM_FINAL_STATUS) {
            Status newStatus = Status.values()[getStatus().ordinal() + 1];
            logEvent(String.format("Task status changed from %s to %s", getStatus(), newStatus));

            setStatus(newStatus);
        } else {
            logEvent(String.format("Can't advance, already at %s", getStatus()));
        }
    }

}
