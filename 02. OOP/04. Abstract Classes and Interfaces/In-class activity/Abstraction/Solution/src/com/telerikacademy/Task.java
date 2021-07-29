package com.telerikacademy;

import java.time.LocalDate;

public class Task extends BoardItem {
    // todo use constants in all projects
    private String assignee;

    public Task(String title, String assignee, LocalDate dueDate) {
        super(title, dueDate, Status.TODO);

        ensureValidAssignee(assignee);
        this.assignee = assignee;

        logEvent(String.format("Task created: %s", viewInfo()));
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
        if (assignee.length() < 5 || assignee.length() > 30) {
            throw new IllegalArgumentException("The assignee's name must be between 5 and 30 characters.");
        }
    }

    @Override
    public String viewInfo() {
        String baseInfo = super.viewInfo();

        return String.format("Task: %s, Assignee: %s", baseInfo, getAssignee());
    }

    @Override
    public void revertStatus() {
        if (getStatus() != initialStatus) {
            Status newStatus = Status.values()[getStatus().ordinal() - 1];
            logEvent(String.format("Task status changed from %s to %s", getStatus(), newStatus));

            setStatus(newStatus);
        } else {
            logEvent(String.format("Can't revert, already at %s", getStatus()));
        }
    }

    @Override
    public void advanceStatus() {
        if (getStatus() != finalStatus) {
            Status newStatus = Status.values()[getStatus().ordinal() + 1];
            logEvent(String.format("Task status changed from %s to %s", getStatus(), newStatus));

            setStatus(newStatus);
        } else {
            logEvent(String.format("Can't advance, already at %s", getStatus()));
        }
    }

}
