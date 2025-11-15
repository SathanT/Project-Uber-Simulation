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
}