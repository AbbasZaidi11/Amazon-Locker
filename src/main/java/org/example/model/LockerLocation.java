package org.example.model;

import java.util.List;

public class LockerLocation {
    private String locationId;
    private List<Locker> lockers;

    public LockerLocation(String locationId, List<Locker> lockers) {
        this.locationId = locationId;
        this.lockers = lockers;
    }

    public List<Locker> getLockers() {
        return lockers;
    }
}
