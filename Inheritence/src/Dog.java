public class Dog extends Animal{
    private int c;

    public Dog() {
        super();
        this.c = 30;
    }

    public int getSum(){
        return super.getSum() + this.c;
    }
}
