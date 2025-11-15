package models;

public class Location {
    private int lon;
    private int log;
    public Location(int lon,int log){
        this.lon=lon;
        this.log=log;
    }
    public int get_lon(){
        return lon;
    }
    public int get_log(){
        return log;
    }
}
