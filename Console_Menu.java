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
public class Console_Menu {
    
  public static void main(String[] args) {
    System.out.println("--------------menu---------------");
    System.out.println("|\t1.PRINT SQUARE\t\t|");
    System.out.println("|\t2.PRINT RECTANGLE\t|");
    System.out.println("|\t3.PRINT CROSS(X)\t|");
    System.out.println("|\t4.PRINT PLUS(+)\t\t|");
    System.out.println("|\t5.PRINT DIAMOND\t\t|");
    System.out.println("|\t6.TO EXIT APPLICATION\t|");
    System.out.println("---------------------------------");

    System.out.print("\n Please select your option(as number 1-6): ");
    Scanner scanner=new Scanner(System.in);

    int option=scanner.nextInt();

    while (option!=6) {
      if(option==1){
        printsquare();
      }
      else if (option==2) {
        printrectangle();
      }
      else if (option==3) {
        printcross();
      }
      else if (option==4) {
        printplus();
      }
      else if (option==5) {
        printdiamond();
      }
      else{
        System.out.println("Sorry.incorrect option.");
      }
      System.out.print("\n Please select your option(as number 1-6): ");
      option=scanner.nextInt();

    }
  System.out.println("System exit.");

  }

  public static void printsquare(){
      for (int i=0;i<8 ;i++ ) {
        for (int j=0;j<15 ;j++ ) {
          if (i==0 || i==7) {
            System.out.print("-");
          }
          else if(j==0 || j==14){
            System.out.print("|");
          }
          else {
            System.out.print(" ");
          }
        }
      System.out.print("\n");
      }

  }

  public static void printrectangle(){
    for (int i=0;i<8 ;i++ ) {
      for (int j=0;j<25 ;j++ ) {
        if (i==0 || i==7) {
          System.out.print("-");
        }
        else if(j==0 || j==24){
          System.out.print("|");
        }
        else {
          System.out.print(" ");
        }
      }
    System.out.print("\n");
    }

  }

  public static void printcross(){
    for (int i=1;i<=11 ;i++ ) {
      for (int j=1;j<=11 ;j++ ) {
        if(j==i || i+j==12){
          System.out.print("*");
        }

        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }


  }

  public static void printplus(){
    for (int i=1;i<=10 ;i++ ) {
      for (int j=1;j<=15 ;j++ ) {
        if(i==5){
          System.out.print("-");
        }
        else if (j!=7) {
          System.out.print(" ");
        }
        else {
          System.out.print("|");
        }
      }
      System.out.println();
    }

  }

  public static void printdiamond(){
    for (int i=0;i<5 ;i++ ) {
      for (int j=0;j<5 ;j++ ) {

      }
    }

  }
}
