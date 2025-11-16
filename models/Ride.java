package models;

public class Ride{
    private String rideId;
    private String riderId;
    private String driverId;
    private RideRequest.Status status;
    private int fare;

    public Ride(String rideId,String riderId,String driverId,RideRequest.Status status,int fare){
        this.rideId=rideId;
        this.riderId=riderId;
        this.driverId=driverId;
        this.status=status;
        this.fare=fare;
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


    public String get_driver_id(){
        return driverId;
    }
    public void set_driver_id(String driverId){
        this.driverId=driverId;
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
}