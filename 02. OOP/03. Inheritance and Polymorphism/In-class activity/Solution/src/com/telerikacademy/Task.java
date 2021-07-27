package com.telerikacademy;

import java.time.LocalDate;

public class Task extends BoardItem {

    private String assignee;

    public Task(String title, String assignee, LocalDate dueDate) {
        super(title, dueDate, Status.TODO);

        ensureValidAssignee(assignee);
        this.assignee = assignee;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        ensureValidAssignee(assignee);

        logEvent(String.format("Assignee changed from %s to %s", this.getAssignee(), assignee));

        this.assignee = assignee;
    }

    private void ensureValidAssignee(String assignee) {
        if (assignee.length() < 5 || assignee.length() > 30) {
            throw new IllegalArgumentException("The assignee's name must be between 5 and 30 characters.");
        }
    }

}
