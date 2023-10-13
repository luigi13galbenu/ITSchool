package session12.practice.object_vs_reference;

public class TestPolymorphism {

    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myTruck = new Truck();

        Car myCar2=(Car) myCar;             //casting pe obiecte



        System.out.println(myCar.fuelType());
        System.out.println(myTruck.fuelType());

        Car ford=new Car();
        Object carAsObject= ford;
        Car backToCar=(Car) carAsObject;
        backToCar.fuelType();
    }
}