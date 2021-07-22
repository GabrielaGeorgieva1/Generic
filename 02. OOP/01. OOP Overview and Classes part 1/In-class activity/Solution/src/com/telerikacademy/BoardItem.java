package com.telerikacademy;

import java.time.LocalDate;

public class BoardItem {

    private final Status initialStatus = Status.OPEN;
    private final Status finalStatus = Status.VERIFIED;

    public String title;
    public LocalDate dueDate;
    public Status status;

    public BoardItem(String title, LocalDate dueDate) {
        if (title == null) {
            throw new IllegalArgumentException("Please provide a non-empty name");
        }

        if (title.length() < 5 || title.length() > 30) {
            throw new IllegalArgumentException("Please provide a name with length between 5 and 30 chars");
        }

        if (dueDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("DueDate can't be in the past");
        }

        this.title = title;
        this.dueDate = dueDate;
        this.status = initialStatus;
    }

    public void revertStatus() {
        if (this.status != initialStatus) {
            status = Status.values()[status.ordinal() - 1];
        }
    }

    public void advanceStatus() {
        if (this.status != finalStatus) {
            status = Status.values()[status.ordinal() + 1];
        }
    }

    public String viewInfo() {
        return String.format("'%s', [%s | %s]", title, status, dueDate);
    }

}
