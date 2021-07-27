package com.telerikacademy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BoardItem {

    private static final Status initialStatus = Status.OPEN;
    private static final Status finalStatus = Status.VERIFIED;

    private String title;
    private LocalDate dueDate;
    private Status status;
    private final List<EventLog> history = new ArrayList<>();

    protected BoardItem(String title, LocalDate dueDate) {
        this(title, dueDate, initialStatus);
    }

    protected BoardItem(String title, LocalDate dueDate, Status status) {
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

    private void setStatus(Status status) {
        logEvent(String.format("Status changed from %s to %s", getStatus(), status));

        this.status = status;
    }

    public void revertStatus() {
        if (this.status != initialStatus) {
            setStatus(Status.values()[status.ordinal() - 1]);
        } else {
            logEvent(String.format("Can't revert, already at %s", getStatus()));
        }
    }

    public void advanceStatus() {
        if (this.status != finalStatus) {
            setStatus(Status.values()[status.ordinal() + 1]);
        } else {
            logEvent(String.format("Can't advance, already at %s", getStatus()));
        }
    }

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
