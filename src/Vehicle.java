public class Vehicle {
    private int passengers; //maximum number of passengers
    private double speed; //maximum speed in mph

    //constructors
    Vehicle (){
        passengers = 2;
        speed = 10;
    }
    Vehicle (int p, double s){
        passengers = p;
        speed = s;
    }

    //Setters
    protected void setPassengers(int p){
        passengers = p;
    }
    protected void setSpeed(double s){
        speed = s;
    }

    //Getters
    protected int getPassengers(){
        return passengers;
    }
    protected double getSpeed(){
        return speed;
    }
}
