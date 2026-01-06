package org.example;

import org.example.model.*;
import org.example.model.enums.LockerSize;
import org.example.service.OrderService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Locker l1 = new Locker("L1", LockerSize.SMALL);
        Locker l2 = new Locker("L2", LockerSize.MEDIUM);
        Locker l3 = new Locker("L3", LockerSize.LARGE);

        LockerLocation location = new LockerLocation(
                "BLR-01",
                Arrays.asList(l1, l2, l3)
        );

        Parcel parcel = new Parcel("P1", LockerSize.MEDIUM);
        Order order = new Order(parcel);

        OrderService orderService = new OrderService();
        orderService.placeOrder(order, location);

        System.out.println("Pickup Code: " + order.getPickupCode());
    }
}
