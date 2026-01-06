package org.example.model;

import org.example.model.enums.LockerSize;

public class Parcel {
    private String parcelId;
    private LockerSize size;

    public Parcel(String parcelId, LockerSize size) {
        this.parcelId = parcelId;
        this.size = size;
    }

    public LockerSize getSize() {
        return size;
    }
}
