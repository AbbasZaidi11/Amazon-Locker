package org.example.service;

import org.example.model.Locker;
import org.example.model.LockerLocation;
import org.example.model.Order;

public class OrderService {

    private LockerService lockerService = new LockerService();

    public void placeOrder(Order order, LockerLocation location) {
        Locker locker = lockerService.assignLocker(
                location,
                order.getParcel()
        );
        order.assignLocker(locker);
    }
}
