package com.thoughtworks.iwp.parkCriteria;

import com.thoughtworks.iwp.ParkingLot;

import java.util.List;

public class ParkFirst implements ParkCriteria {
    @Override
    public ParkingLot giveParkingLot(List<ParkingLot> parkingLotList) {
        return parkingLotList.stream().filter(parking -> parking.isNotFull()).findFirst().orElse(null);
    }
}
