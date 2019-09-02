/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgic_assignments;

import java.util.Scanner;
/**
 *
 * @author SathurjanV
 */

    
    


class Shifting_Rearranging {

  static int[] array = {9,3,6,1,5,2,2};
  static int length=array.length;

  public static void main(String[] args) {


    System.out.print("array elements before shifting :");
    printarray(array);

    Scanner scanner=new Scanner(System.in);
    System.out.print("Please enter the Target index: ");
    int target=scanner.nextInt();

    System.out.print("Please enter the destination index: ");
    int destination=scanner.nextInt();



    if (length-1>=target && length-1>=destination && target>-1 && destination>-1) {

      System.out.print("array elements after shifting: ");

      printarray(shiftingElements(target,destination));

    }

    else{
      System.out.print("Sorry.incorrect options. ");
    }

  }

  public static void printarray(int[] array){
      for (int i=0;i<length;i++ ) {
          System.out.print(array[i]+" ");
      }
      System.out.print("\n");
      System.out.println("------------------------------------------------------");
  }

  public static int[] shiftingElements(int tar,int des){
      int temp=array[des];
      array[des]=array[tar];
      array[tar]=temp;
      return array;
  }

}