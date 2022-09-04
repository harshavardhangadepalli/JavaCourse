public class ReverseArray {

    private static void reverse(int[] arr) {
        System.out.print("Array = [");
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[arr.length-i-1];
            if(i==0) {
                System.out.print(arr[i]);
                continue;
            }
            System.out.print(", "+arr[i]);
        }
        System.out.print("]");
        System.out.print("Reversed array = [");
        for (int i = 0; i < newArr.length; i++) {
            arr[i] = newArr[i];
            if(i==0) {
                System.out.print(arr[i]);
                continue;
            }
            System.out.print(", "+arr[i]);
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        reverse(arr);
    }

}