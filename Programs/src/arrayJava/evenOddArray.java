package arrayJava;

public class evenOddArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int[] even = new int[5];
        int[] odd = new int[5];

        int eIndex = 0;
        int oIndex = 0;
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                even[eIndex++] = arr[i];
                evenSum += arr[i];
            } else {
                odd[oIndex++] = arr[i];
                oddSum += arr[i];
            }
        }

        System.out.print("Even Numbers: ");
        for(int num : even) {
            System.out.print(num + " ");
        }
        System.out.println("\nEven Sum = " + evenSum);

        System.out.print("Odd Numbers: ");
        for(int num : odd) {
            System.out.print(num + " ");
        }
        System.out.println("\nOdd Sum = " + oddSum);
    }
}
