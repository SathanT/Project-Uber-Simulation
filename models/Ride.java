package models;

public class Ride{
    private String rideId;
    private String riderId;
    private Driver driver;
    private RideRequest.Status status;
    private Location pickup;
    private Location drop;
    private int fare;

    public Ride(String rideId,String riderId,Driver driver,RideRequest.Status status,int fare){
        this.rideId=rideId;
        this.riderId=riderId;
        this.driver=driver;
        this.status=status;
        this.fare=fare;
    }

    public Ride(String rideId,String riderId,Driver driver){
        this.rideId=rideId;
        this.riderId=riderId;
        this.driver=driver;
    }

    public Ride(Location pickup,Location drop){
        this.pickup=pickup;
        this.drop=drop;
    }

    public String get_ride_id(){
        return rideId;
    }
    public void set_ride_id(String rideId){
        this.rideId=rideId;
    }


    public String get_rider_id(){
        return riderId;
    }
    public void set_rider_id(String riderId){
        this.riderId=riderId;
    }


    public Driver get_driver(){
        return driver;
    }
    public void set_driver_id(Driver driver){
        this.driver=driver;
    }


    public RideRequest.Status get_status(){
        return status;
    }
    public void set_status(RideRequest.Status status){
        this.status=status;
    }


    public int get_fare(){
        return fare;
    }
    public void set_fare(int fare){
        this.fare=fare;
    }


    public void set_pickup(Location pickup){
        this.pickup=pickup;
    }
    public Location get_pickup(){
        return pickup;
    }


    public void set_drop(Location drop){
        this.drop=drop;
    }
    public Location get_drop(){
        return drop;
    }
}