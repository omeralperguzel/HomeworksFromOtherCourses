/* QUESTION: (MEDIUM)
Have the function TrappingWater(arr) take the array of non-negative integers stored in arr, and determine the largest amount of water that can be trapped. The numbers in the array represent the height of a building (where the width of each building is 1) and if you imagine it raining, water will be trapped between the two tallest buildings. For example: if arr is [3, 0, 0, 2, 0, 4] then this array of building heights looks like the following picture if we draw it out: 

(Object needed) 

Now if you imagine it rains and water gets trapped in this picture, then it'll look like the following (the x's represent water): 

(Object needed)

This is the most water that can be trapped in this picture, and if you calculate the area you get 10, so your program should return 10.

*/
import java.util.*; 
import java.io.*;

class Main {

  public static int TrappingWater(int[] arr) {
    // code goes here
    Stack<Integer> stack = new Stack<Integer>();
        int water = 0,large=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(stack.size()==0 || arr[i]<=large)
            {
                stack.push(arr[i]);
                if(arr[i] > large)
                {
                    large = arr[i];
                }
            }
            else if( arr[i] > large)
            {
                while(stack.size()>0)
                {
                    water += large - stack.peek();
                    stack.pop();
                }
                stack.push(arr[i]);
                large = arr[i];
            }
        }
        large = 0;
        while(stack.size()>0)
        {
           if(large < stack.peek())
           {
               large = stack.peek();
           }
            water += large - stack.peek();
            stack.pop();
        }
        
        return water;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(TrappingWater(s.nextLine())); 
  }

}
