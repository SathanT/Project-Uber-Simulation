package models;
public class Driver extends User{
    private String VehicleNumber;
    private String model;
    private String LicenceId;
    public Driver(String name,String id,String phone,String VehicleNumber,String model,String LicenceId){
        super(id,name,phone);
        this.VehicleNumber=VehicleNumber;
        this.model=model;
        this.LicenceId=LicenceId;
    }
    public String get_VehNo(){
        return VehicleNumber;
    }
    public String get_model(){
        return model;
    }
    public String get_LicId(){
        return LicenceId;
    }
    
}