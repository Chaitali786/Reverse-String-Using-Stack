
package stack_datastructures;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chaitali
 */
public class Stack_DataStructures {
    
    private char[] stack_array;
    private int stack_size;
    private int top;
    /**
     * Constructor to create stack with size 
     * @param stack_size
     */
    public  Stack_DataStructures (int size)
    {
        this.stack_size = size;
        this.top = 0;
        this.stack_array = new char[stack_size];
    }
    /*
    Main method of class
    */
    public static void main(String[] args) {
        
        //Scanner class to get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String To Reverse : ");
        String inputString = sc.next();
        
        //calculate the lenght of string
        int lenghtOfString = inputString.length();
        System.out.println("String IS : " + inputString );
        
        //create character array of calculated lenght
        Stack_DataStructures dataStructure = new Stack_DataStructures(lenghtOfString);
        
        //push character into stack
        for(int i=0;i<inputString.length();i++)
        {
            try {
                dataStructure.push(inputString.charAt(i));
                
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                
            }
        }
        
        System.out.println("--------------------------------------------------------------------------" );
        //pop character from the stack
        
        char[] reverseString = new char[inputString.length()];
        for(int i=0;i<inputString.length();i++)
        {
            try {
                
                reverseString[i] = dataStructure.pop();
                
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                
            }
        }
        
        System.out.println("Reverse String IS : " +new String(reverseString) );
    }
    /**
     * This method adds new char to the top of the stack
     * @param character
     * @throws Exception
     */
    public void push(char character)throws Exception
    {
        if(isStackFull()==false)
        {
        System.out.println("ADDING CHARACTER TO STACK :TOP["+top+"]" +character);
        //top = top+1;
        stack_array[top++] = character;
        }
        else
        {
         System.out.println("Stack Is Full !!!");
        }
        
    }
     /**
     * This method pops up  char from top of the stack
     * @throws Exception
     */
    public char pop() throws Exception
    {
        top--;
        
        if(isStackEmpty()==false)
        {
            System.out.println("REMOVE CHARACTER FROM STACK :TOP["+top+"]"+stack_array[top]);
           
        }
         return stack_array[top];
    }
    
    /**
     * This boolean method checks if stack is full or not
     */
    public boolean isStackFull()
    {
        if(stack_array[top]== stack_size )
        {
            return true;
        }
        else
        {
            return false;
        }
            
    }
    /**
     * This boolean method checks if stack is empty or not
     */
    public boolean isStackEmpty()
    {
        if(top < 0)
        {  
            System.out.println("Stack Is Empty !!!");
            return true;
        }
        else
        {
            return false;
        }
            
    }
    
}
