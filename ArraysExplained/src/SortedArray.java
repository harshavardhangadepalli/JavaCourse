import java.util.*;


public class SortedArray {
    // write code here
    private static Scanner sc = new Scanner(System.in);

    public static int[] getIntegers(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++)
            newArray[i] = sc.nextInt();
        return newArray;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++)
            System.out.println("Element "+i+" contains "+array[i]);
    }

    public static int[] sortIntegers(int[] array) {
        class Helper {
            int[] mergeSort(int[] arr) {
                if(arr.length == 1)
                    return arr;
                if(arr.length == 2) {
                    int[] l = {arr[0]};
                    int[] r = {arr[1]};
                    return merge(l,r);
                }
                int size1,size2;
                if(arr.length % 2 == 0) {
                    size1 = arr.length/2;
                    size2 = arr.length/2;
                }
                else {
                    size1 = arr.length/2;
                    size2 = (arr.length/2)+1;
                }

                int[] l = new int[size1];
                int[] r = new int[size2];

                for (int i = 0; i < size1; i++) {
                    l[i] = arr[i];
                }
                for (int i = size1; i < arr.length; i++) {
                    r[i-size1] = arr[i];
                }
                int[] new_l = mergeSort(l);
                int[] new_r = mergeSort(r);
                return merge(new_l,new_r);
            }


            int[] merge(int[] arr1, int[] arr2) {
                if (arr1.length == 0 && arr2.length == 0)
                    return new int[0];
                if (arr1.length == 0)
                    return arr2;
                if (arr2.length == 0)
                    return arr1;
                int newSize = arr1.length + arr2.length;
                int[] arr = new int[newSize];
                int i = 0;
                int j = 0;
                int k = 0;
                while(true) {
                    if (j == arr1.length || k == arr2.length)
                        break;
                    if(arr1[j] < arr2[k]) {
                        arr[i] = arr1[j];
                        j+=1;
                        i+=1;
                    }
                    else {
                        arr[i] = arr2[k];
                        k += 1;
                        i+=1;
                    }
                }
                if(j!= arr1.length) {
                    while(true) {
                        if (j == arr1.length)
                            break;
                        arr[i] = arr1[j];
                        i+=1;
                        j+=1;
                    }
                }
                if(k!= arr2.length) {
                    while(true) {
                        if (k == arr2.length)
                            break;
                        arr[i] = arr2[k];
                        i+=1;
                        k+=1;
                    }
                }
                return arr;
            }
        }
        Helper h = new Helper();
        return h.mergeSort(array);
    }

    public static void main(String[] args) {
        int[] arr;
        arr = getIntegers(6);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}