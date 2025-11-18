package models;

public class Location {
    private int lot;
    private int lon;
    public Location(int lot,int lon){
        this.lot=lot;
        this.lon=lon;
    }
    public int get_lot(){
        return lot;
    }
    public int get_lon(){
        return lon;
    }
    public void set_lot(int lot){
        this.lot=lot;
    }
    public void eet_lon(int lon){
        this.lon=lon;
    }
}
