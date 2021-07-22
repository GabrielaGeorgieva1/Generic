package com.telerikacademy;

import java.time.LocalDate;

public class BoardItem {

    public String title;
    public LocalDate dueDate;
    public Status status;

    public BoardItem(String title, LocalDate dueDate) {
        this(title, dueDate, Status.OPEN);
    }

    public BoardItem(String title, LocalDate dueDate, Status status) {
        if (title == null || title.length() < 5 || title.length() > 30) {
            throw new IllegalArgumentException();
        }
        this.title = title;
        if (dueDate == null || dueDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException();
        }
        this.dueDate = dueDate;
        this.status = status;
    }

    public void advanceStatus() {
        switch (status) {
            case OPEN: status = Status.TODO;
                break;
            case TODO: status = Status.INPROGRESS;
                break;
            case INPROGRESS: status = Status.DONE;
                break;
            case DONE: status = Status.VERIFIED;
                break;
            case VERIFIED: break;
        }
    }

    public void revertStatus() {
        if (status != Status.OPEN) {
            status = Status.values()[status.ordinal() - 1];
        }
    }

    public String viewInfo() {
        return String.format("'%s', [%s | %s]", title, status.format(), dueDate);
    }
}
