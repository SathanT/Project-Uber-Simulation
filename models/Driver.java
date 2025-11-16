package models;
public class Driver extends User{
    private  enum Status {
        AVAILABLE,
        ON_RIDE,
        OFFLINE
    }
    private String VehicleNumber;
    private String model;
    private String LicenceId;
    private Status status;
    private Location curr_location;

    public Driver(String name,String id,String phone,String VehicleNumber,String model,String LicenceId,Location curr_location){
        super(id,name,phone);
        this.VehicleNumber=VehicleNumber;
        this.model=model;
        this.LicenceId=LicenceId;
        this.curr_location=curr_location;
    }


    public String get_VehNo(){
        return VehicleNumber;
    }
    public void set_VehNo(String VehicleNumber){
        this.VehicleNumber=VehicleNumber;
    }


    public String get_model(){
        return model;
    }
    public void set_model(String model){
        this.model=model;
    }


    public String get_LicId(){
        return LicenceId;
    }
    public void set_LicId(String LicId){
        this.LicenceId=LicId;
    }


    public Location get_currentLocation(){
        return curr_location;
    }
    public void set_currentLocation(Location curr_location){
        this.curr_location=curr_location;
    }


    public boolean isAvailable(){
        return this.status==Status.AVAILABLE;
    }
    
}