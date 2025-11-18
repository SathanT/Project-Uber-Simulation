package service;
import java.util.*;
import models.Ride;
import models.Driver;
import models.RideRequest;
public class RideService{
    List<Ride> rides=new ArrayList<>();

    public Ride create_ride(String riderId,Driver driver){
        Ride ride=new Ride(UUID.randomUUID().toString(),riderId,driver);
        rides.add(ride);

        driver.set_status(Driver.Status.ON_RIDE);

        return ride;

    }

    public void start_ride(Ride ride){
        ride.set_status(RideRequest.Status.STARTED);
    }

    public void complete_ride(Driver driver,Ride ride,int dist){
        int fare=dist*10;
        ride.set_fare(fare);
        ride.set_status(RideRequest.Status.COMPLETED);
        driver.set_status(Driver.Status.AVAILABLE);

    }

}