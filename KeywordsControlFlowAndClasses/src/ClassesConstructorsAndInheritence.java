public class ClassesConstructorsAndInheritence {
    public static void main(String[] args) {
        // SimpleCalculator cal = new SimpleCalculator();
        // cal.setFirstNumber(5);
        // cal.setSecondNumber(4);
        // System.out.println(cal.getAdditionResult());
        // System.out.println(cal.getMultiplicationResult());
        // System.out.println(cal.getDivisionResult());


        Person p = new Person();
        p.setFirstName("");
        p.setLastName("");
        p.setAge(10);
        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
        System.out.println(p.isTeen());
    }

    public static class SimpleCalculator {
        private double firstNumber;
        private double secondNumber;

        SimpleCalculator() {
            this.firstNumber = 1;
            this.secondNumber = 1;
        }

        public double getFirstNumber() {
            return this.firstNumber;
        }

        public double getSecondNumber() {
            return this.secondNumber;
        }

        public void setFirstNumber(double val) {
            this.firstNumber = val;
        }

        public void setSecondNumber(double val) {
            this.secondNumber = val;
        }

        public double getAdditionResult() {
            return this.firstNumber + this.secondNumber;
        }

        public double getSubtractionResult() {
            return this.firstNumber - this.secondNumber;
        }
        public double getMultiplicationResult() {
            return this.firstNumber * this.secondNumber;
        }

        public double getDivisionResult() {
            if(this.secondNumber == 0)
                return 0;
            return this.firstNumber/this.secondNumber;
        }
    }

    public static class Person {
        private String firstName;
        private String lastName;
        private int age;

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public void setFirstName(String s) {
            this.firstName = s;
        }

        public void setLastName(String s) {
            this.lastName = s;
        }

        public void setAge(int n) {
            if (n < 0 || n > 100) {
                this.age = 0;
                return;
            }
            this.age = n;
        }

        public boolean isTeen() {
            if (13 <= this.age && this.age <= 19)
                return true;
            return false;
        }

        public String getFullName() {
            if (this.firstName.isEmpty() && this.lastName.isEmpty())
                return "";
            if (this.firstName.isEmpty())
                return this.lastName;
            if (this.lastName.isEmpty())
                return this.firstName;
            return this.firstName +" "+ this.lastName;
        }
    }
}
