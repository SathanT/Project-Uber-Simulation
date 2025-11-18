package service;
import java.util.*;
import java.util.stream.Collectors;

import models.Driver;
public class DriverService {
    
    private List<Driver> drivers=new ArrayList<>();

    public void add_driver(Driver driver){
        drivers.add(driver);
    }

    public List<Driver> get_drivers(){
        return drivers.stream().filter(d -> d.isAvailable()).collect(Collectors.toList());
    }

}
