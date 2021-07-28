public class Automobile extends Vehicle{
    private int wheels; //number of wheels
    private int doors; //number of doors
    private String make; //car's make
    private String model; //car's model
    private boolean euro; //left or right handedness of driver side: false = driver on left side, true = driver on right side

    //constructors
    Automobile(){
        wheels = 4;
        doors = 4;
        make = "";
        model = "";
        euro = false;
    }
    Automobile(int w, int d, String ma, String mo, boolean e){//Vehicle constructor not overridden, just uses defaults
        wheels = w;
        doors = d;
        make = ma;
        model = mo;
        euro = e;
    }

    //Setters
    protected void setWheels(int w){
        wheels = w;
    }
    protected void setDoors(int d){
        doors = d;
    }
    protected void setMake(String ma){
        make = ma;
    }
    protected void setModel(String mo){
        model = mo;
    }
    protected void setEuro(boolean e){
        euro = e;
    }

    //Getters
    protected int getWheels(){
        return wheels;
    }
    protected int getDoors(){
        return doors;
    }
    protected String getMake(){
        return make;
    }
    protected String getModel(){
        return model;
    }
    protected boolean getEuro(){
        return euro;
    }
}
