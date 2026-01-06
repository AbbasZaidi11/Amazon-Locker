package org.example.model.enums;

public enum LockerSize {
    SMALL,
    MEDIUM,
    LARGE;

    public boolean canFit(LockerSize parcelSize) {
        return this.ordinal() >= parcelSize.ordinal();
    }
}
