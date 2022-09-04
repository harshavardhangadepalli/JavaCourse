import java.util.Scanner;
public class ReadInputFromUser {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = scanner.nextLine();
        // System.out.println("Your name "+ name);
        // scanner.close();
        // readingUserInput();
        // minMax();
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
    }

    public static void readingUserInput() {
        int sum = 0;
        int counter = 0;
        Scanner s = new Scanner(System.in);
        while(counter < 10) {
            System.out.println("Enter the number #"+(counter+1));
            if(!s.hasNextInt())
                System.out.println("Invalid Number");
            else {
                counter += 1;
                sum += s.nextInt();
            }
            s.nextLine();
        }
        s.close();
        System.out.println(sum);
    }

    public static void minMax() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number");
            if (!s.hasNextInt())
                break;
            int n = s.nextInt();
            min = Math.min(min,n);
            max = Math.max(max,n);
        }
        s.close();
        System.out.println(min);
        System.out.println(max);
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;
        while (true) {
            if(!s.hasNextInt())
                break;
            count += 1;
            sum += s.nextInt();
        }
        if(count == 0) {
            System.out.println("SUM = 0 AVG = 0");
            s.close();
            return;
        }
        average = Math.round((double)sum/count);
        System.out.println("SUM = "+sum+" AVG = "+average);
        s.close();
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <=0 || height <= 0 || areaPerBucket <=0 || extraBuckets < 0)
            return -1;
        if (width * height <= areaPerBucket * extraBuckets)
            return 0;
        return (int)Math.ceil((double) (width * height - areaPerBucket * extraBuckets) / areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <=0 || height <= 0 || areaPerBucket <=0)
            return -1;
        return (int)Math.ceil((double) (width * height) / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <=0 || areaPerBucket <=0)
            return -1;
        return (int)Math.ceil((double) (area) / areaPerBucket);
    }
}
