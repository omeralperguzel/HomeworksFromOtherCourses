/*QUESTION (MEDIUM)
 * Have the function MaxSubarray(arr) take the array of numbers stored in arr and determine the largest sum that can be formed by any contiguous subarray in the array. For example, if arr is [-2, 5, -1, 7, -3] then your program should return 11 because the sum is formed by the subarray [5, -1, 7]. Adding any element before or after this subarray would make the sum smaller.
 */

package CoderbyteExamsFromKodluyoruz.StajProgrami.Week7;

public class MaxSubarray1 {

    public static int MaxSubarray(int[] arr) {
        // code goes here  
        return arr[0];
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(MaxSubarray(s.nextLine())); 
      }
    
}
