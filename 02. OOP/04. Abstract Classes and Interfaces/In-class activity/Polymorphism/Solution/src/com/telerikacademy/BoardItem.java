package com.telerikacademy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class BoardItem {

    protected static final Status initialStatus = Status.OPEN;
    protected static final Status ITEM_FINAL_STATUS = Status.VERIFIED;

    private String title;
    private LocalDate dueDate;
    private Status status;
    private final List<EventLog> history = new ArrayList<>();

    public BoardItem(String title, LocalDate dueDate) {
        this(title, dueDate, initialStatus);
    }

    public BoardItem(String title, LocalDate dueDate, Status status) {
        validateDueDate(dueDate);
        validateTitle(title);

        this.title = title;
        this.status = status;
        this.dueDate = dueDate;

        logEvent(String.format("Item created: %s", viewInfo()));
    }

    public Status getStatus() {
        return status;
    }

    public String getTitle() {
        return title == null ? "" : title;
    }

    private void setTitle(String title) {
        validateTitle(title);

        logEvent(String.format("Title changed from %s to %s", getTitle(), title));

        this.title = title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        validateDueDate(dueDate);

        logEvent(String.format("DueDate changed from %s to %s", getDueDate(), dueDate));

        this.dueDate = dueDate;
    }

    protected void setStatus(Status status) {
        this.status = status;
    }

    public abstract void revertStatus();

    public abstract void advanceStatus();

    public String viewInfo() {
        return String.format("'%s', [%s | %s]", title, status, dueDate);
    }

    public void displayHistory() {
        for (EventLog log : history) {
            System.out.println(log.viewInfo());
        }
    }

    protected void logEvent(String event) {
        history.add(new EventLog(event));
    }

    private void validateTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("Please provide a non-empty title");
        }
        if (title.length() < 5 || title.length() > 30) {
            throw new IllegalArgumentException("Please provide a title with length between 5 and 30 chars");
        }
    }

    private void validateDueDate(LocalDate dueDate) {
        if (dueDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("DueDate can't be in the past");
        }
    }

}
