import com.sun.xml.internal.bind.v2.TODO;

public class testing {
    public static void main (String args[]) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle(4,80);

        Automobile a1 = new Automobile();
        Automobile a2 = new Automobile(6, 2, "Chevrolet", "Bison", false);

        System.out.println(v1.getPassengers()); //should be 2
        System.out.println(v1.getSpeed()); //should be 10

        System.out.println(v2.getPassengers()); //should be 4
        System.out.println(v2.getSpeed()); //should be 80

        System.out.println(a1.getPassengers()); //should be 2
        System.out.println(a1.getSpeed()); //should be 10
        System.out.println(a1.getWheels()); //should be 4
        System.out.println(a1.getDoors()); //should be 4
        System.out.println(a1.getMake()); //should be 4
        System.out.println(a1.getModel()); //should be 80
        //TODO print out the info for a2, refactor this so it looks better, add some additional text to the printout to make it more legible
    }
}
