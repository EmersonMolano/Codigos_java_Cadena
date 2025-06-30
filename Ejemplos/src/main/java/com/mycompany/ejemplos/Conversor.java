

import java.util.Arrays;

public class Conversor {

   public static void main(String[] args) {
       int[] array = {7, 8, 9, 10, 11};
       System.out.println("Array : " + Arrays.toString(array)); // print array

       // Call function to get reversed array
       int[] reversedArray = reverse(array);
       System.out.println("Reversed array : " + Arrays.toString(reversedArray)); // print reversed array
   }

   // Method returns a new reversed array, based on the array which was passed to it.
   static int[] reverse(int[] array) {
       int[] newArray = new int[array.length];

       for (int i = 0; i < array.length; i++) {
           newArray[array.length - 1 - i] = array[i];
       }

       return newArray;
   }
}