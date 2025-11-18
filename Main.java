
import Control.Controller;
import models.Driver;
import models.Rider;
import models.Location;
import models.Ride;
public class Main {
    public static void main(String[] args){

        Controller control = new Controller();
        control.get_driverService().add_driver(new Driver("AK","00707","880720","TN34","alto","xy34tt",new Location(45,25),Driver.Status.AVAILABLE));
        control.get_driverService().add_driver(new Driver("Arun","00708","320478","TN44","swift","ejfb34",new Location(14,63),Driver.Status.AVAILABLE));
        control.get_driverService().add_driver(new Driver("Ramesh","00709","573482","TN88","wagnar","csdnf76",new Location(39,64),Driver.Status.AVAILABLE));
        control.get_driverService().add_driver(new Driver("Karthi","00710","019234","TN34","krysta","ibdfj30",new Location(45,34),Driver.Status.AVAILABLE));
        control.get_driverService().add_driver(new Driver("Suresh","00711","341668","TN72","innova","wepto68",new Location(23,95),Driver.Status.AVAILABLE));

        Rider rider1=new Rider("21370","jack","27198293");

        Ride ride = control.bookRide(rider1,new Location(37,32),new Location(87,90));

        control.get_rideService().start_ride(ride);
        control.get_rideService().complete_ride(ride.get_driver(), ride, control.get_rideRequstService().dist(ride.get_pickup(),ride.get_drop()));
        System.out.print("your fare for this ride is :  "+ride.get_fare());


    }
}
