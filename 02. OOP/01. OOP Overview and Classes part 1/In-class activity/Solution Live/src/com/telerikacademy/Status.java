package com.telerikacademy;

public enum Status {
    OPEN,
    TODO,
    INPROGRESS,
    DONE,
    VERIFIED;

    public String format() {
        switch (this) {
            case OPEN:
                return "Open";
            case TODO:
                return "To do";
            case INPROGRESS:
                return "In progress";
            case DONE:
                return "Done";
            case VERIFIED:
                return "Verified";
            default:
                throw new IllegalArgumentException();
        }
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
