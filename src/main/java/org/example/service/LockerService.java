package org.example.service;

import org.example.exception.NoLockerAvailableException;
import org.example.model.Locker;
import org.example.model.LockerLocation;
import org.example.model.Parcel;

public class LockerService {

    public Locker assignLocker(LockerLocation location, Parcel parcel) {
        for (Locker locker : location.getLockers()) {
            if (locker.canFit(parcel)) {
                locker.occupy();
                return locker;
            }
        }
        throw new NoLockerAvailableException();
    }
}
