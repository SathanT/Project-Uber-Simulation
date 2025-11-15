package models;

public class RideRequest {
    
    public enum Status {ASSIGNED,PENDING,STARTED,COMPLETED};

    private String id;
    private String riderId;
    private Location pickup;
    private Location drop;
    private Status status;

    public RideRequest(String id,String riderId,Location pickup,Location drop,Status status){
        this.id=id;
        this.riderId=riderId;
        this.pickup=pickup;
        this.drop=drop;
        this.status=status;
    }

    public String get_Id(){
        return id;
    }
    public void set_id(String id){
        this.id=id;
    }


    public String get_riderId(){
        return riderId;
    }
    public void set_riderId(String riderId){
        this.riderId=riderId;
    }


    public Location get_drop(){
        return id;
    }
    public void set_drop(Location drop){
        this.drop=drop;
    }


    public Loation get_pickup(){
        return pickup;
    }
    public void set_pickup(Location pickup){
        this.pickup=pickup;
    }


    public Status get_status(){
        return status;
    }
    public void set_status(Status status){
        this.status=status;
    }
    

}
