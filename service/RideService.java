package service;
import java.util.*;
import models.Driver;
import models.Location;
public class RideService {
    
    public Driver nearest_driver(Location pickup,List<Driver> drivers){

        Driver nearest=null;
        int min_dist=Integer.MAX_VALUE;

        for(Driver d : drivers){
            int dist=calc(pickup,d.get_currentLocation());
            if(min_dist>dist){
                min_dist=dist;
                nearest=d;
            }
        }
        return nearest;

    }
    public int calc(Location a,Location b){
        return (int)Math.sqrt(Math.pow(a.get_lot() - b.get_lot(), 2) + Math.pow(a.get_lon() - b.get_lon(), 2));
    }
}
