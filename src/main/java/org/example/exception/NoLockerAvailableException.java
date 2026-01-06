package org.example.exception;

public class NoLockerAvailableException extends RuntimeException {
    public NoLockerAvailableException() {
        super("No locker available for the given parcel size");
    }
}
