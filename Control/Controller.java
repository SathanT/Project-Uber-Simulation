package Control;
import java.util.*;
import service.DriverService;
import service.RideRequestService;
import service.RideService;
import models.Driver;
import models.Location;
import models.Ride;
import models.Rider;
public class Controller {
    private DriverService driverService;
    private RideRequestService rideRequestService;
    private RideService rideService;
    public Controller(){
        this.driverService=new DriverService();
        this.rideRequestService=new RideRequestService();
        this.rideService=new RideService();
    }

    public Ride bookRide(Rider rider,Location pickup,Location drop){
        List<Driver> drivers=driverService.get_drivers();
        Driver nearest=rideRequestService.nearest_driver(pickup, drivers);
        if(nearest==null){
            System.out.print("No Available Drivers");
            return null;
        }
         
        Ride ride=rideService.create_ride(rider.get_id(),nearest);
        ride.set_pickup(pickup);
        ride.set_drop(drop);
        System.out.println("---------Ride created--------- ");
        System.out.println("Driver Name :     "+nearest.get_name());
        System.out.println("Driver ID :     "+nearest.get_id());
        System.out.println("Driver  Phone :     "+nearest.get_phone());
        System.out.println("Driver Vehicle No :     "+nearest.get_VehNo());

        return ride;

    }

    public DriverService get_driverService(){
        return driverService;
    }
    public RideRequestService get_rideRequstService(){
        return rideRequestService;
    }
    public RideService get_rideService(){
        return rideService;
    }
}
