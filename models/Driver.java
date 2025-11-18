package models;
public class Driver extends User{
    public  enum Status {
        AVAILABLE,
        ON_RIDE,
        OFFLINE
    }
    private String VehicleNumber;
    private String model;
    private String LicenceId;
    private Status status;
    private Location curr_location;

    public Driver(String name,String id,String phone,String VehicleNumber,String model,String LicenceId,Location curr_location,Driver.Status status){
        super(id,name,phone);
        this.VehicleNumber=VehicleNumber;
        this.model=model;
        this.LicenceId=LicenceId;
        this.curr_location=curr_location;
        this.status=status;
    }


    public String get_id(){
        return id;
    }
    public void set_id(String id){
        this.id=id;
    }


    public String get_name(){
        return name;
    }
    public void set_name(String name){
        this.name=name;
    }


    public String get_phone(){
        return phone;
    }
    public void set_phone(String phone){
        this.phone=phone;
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


    public void set_status(Driver.Status status){
        this.status=status;
    }
    public boolean isAvailable(){
        return this.status==Status.AVAILABLE;
    }
    
}