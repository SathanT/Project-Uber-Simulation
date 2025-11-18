package models;
public class Rider extends User {
    public Rider(String id,String name,String phone){
        super(id,name,phone);
    }
    public String get_id(){
        return id;
    }
    public String get_name(){
        return name;
    }
    public String get_phone(){
        return phone;
    }
}
