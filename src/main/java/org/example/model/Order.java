package org.example.model;

import java.util.UUID;

public class Order {
    private String orderId;
    private Parcel parcel;
    private Locker assignedLocker;
    private String pickupCode;

    public Order(Parcel parcel) {
        this.orderId = UUID.randomUUID().toString();
        this.parcel = parcel;
    }

    public Parcel getParcel() {
        return parcel;
    }

    public void assignLocker(Locker locker) {
        this.assignedLocker = locker;
        this.pickupCode = UUID.randomUUID().toString().substring(0, 6);
    }

    public String getPickupCode() {
        return pickupCode;
    }
}
