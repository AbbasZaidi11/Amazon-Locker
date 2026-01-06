package org.example.model;

import org.example.model.enums.LockerSize;
import org.example.model.enums.LockerStatus;

public class Locker {
    private String lockerId;
    private LockerSize size;
    private LockerStatus status;

    public Locker(String lockerId, LockerSize size) {
        this.lockerId = lockerId;
        this.size = size;
        this.status = LockerStatus.AVAILABLE;
    }

    public boolean canFit(Parcel parcel) {
        return status == LockerStatus.AVAILABLE
                && size.canFit(parcel.getSize());
    }

    public void occupy() {
        this.status = LockerStatus.OCCUPIED;
    }

    public String getLockerId() {
        return lockerId;
    }
}
