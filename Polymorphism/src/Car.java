public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        return "Car";
    }

    public String accelerate() {
        return "Car";
    }

    public String brake() {
        return "Car";
    }


    public int getCylinders() {
        return this.cylinders;
    }

    public String getName() {
        return this.name;
    }


}
