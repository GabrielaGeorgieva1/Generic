package com.telerikacademy;

import java.time.LocalDate;

public class Issue extends BoardItem {

    private final String description;

    public Issue(String title, String description, LocalDate dueDate) {
        super(title, dueDate, Status.OPEN);

        if (description == null) {
            this.description = "No description";
        } else {
            this.description = description;
        }
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void revertStatus() {
        if (getStatus() != Status.OPEN) {
            setStatus(Status.OPEN);
            logEvent("Issue status set to Open");
        } else {
            logEvent("Issue status already Open");
        }
    }

    @Override
    public void advanceStatus() {
        if (getStatus() != Status.VERIFIED) {
            setStatus(Status.VERIFIED);
            logEvent("Issue status set to Verified");
        } else {
            logEvent("Issue status already Verified");
        }
    }

}
