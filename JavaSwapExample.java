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
public class JavaSwapExample {

 public static void main(String[] args) {

  int x=0;
  int y=0;

  System.out.println("Before Swapping");
  System.out.println("Enter Value of x :" + x);
  System.out.println("Enter Value of y:" + y);
  Scanner in= new Scanner(System.in);
  
  x=in.nextInt();
  y=in.nextInt();

  //add both the numbers and assign it to first
  x = x + y;
  y = x - y;
  x = x - y;
  
  System.out.println("After Swapping");
  System.out.println("Value of x is :" + x);
  System.out.println("Value of y is :" + y);
 }
}