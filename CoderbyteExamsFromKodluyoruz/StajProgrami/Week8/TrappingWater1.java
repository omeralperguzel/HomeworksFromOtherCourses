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
