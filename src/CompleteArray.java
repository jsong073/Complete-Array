/*
1. Set up variables
    a. An array of
    b. An int to hold the sum of the numbers in the array
2. Create for loop
    a. for (int i = 0; i < length of numbers array; i++)
    b. each iteration, add one number in the array to sum
    c. end loop when i reaches length of numbers array
3. print out sum with S.O.P.
 */

public class CompleteArray {
    public static void main (String[] args) {
        int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};
        int[] testNumbers = {1, 2, 3};      //used to test loop with easier numbers,
                                            // sum should equal 6 if the loop works
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);
    }
}
