/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgic_assignments;

/**
 *
 * @author SathurjanV
 */
    import java.util.Arrays;  
    public class SecondLargestInArrayExample1{  
    public static int getSecondLargest(int[] a, int length){  
    Arrays.sort(a); 
     System.out.println("Print total:" +length);
    return a[length-2];
       
    }  
    public static void main(String args[]){  
   int a[]={1,2,5,6,3,2};  
   int b[]={44,66,99,77,33,22,55};  
    int c[]={1,3,4,5,6,7,16,45,19,23,43};
   System.out.println("Second Largest: "+getSecondLargest(a,6));  
    System.out.println("Second Largest: "+getSecondLargest(b,7));  
        System.out.println("Second Largest: "+getSecondLargest(c,11));
        
    }}  
