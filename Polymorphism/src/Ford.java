public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Ford";
    }

    @Override
    public String brake() {
        return "Ford";
    }

    @Override
    public String startEngine() {
        return "Ford";
    }
}
