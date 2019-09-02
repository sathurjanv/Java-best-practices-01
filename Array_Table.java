/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgic_assignments_01;

import java.util.Scanner;

/**
 *
 * @author SathurjanV
 */
public class Array_Table {
    

  public static void main(String[] args) {

    int i;

    Scanner scanner=new Scanner(System.in);


    System.out.print("how many records you need to store : ");
    int count=scanner.nextInt();

    String[][] person = new String[count][3];



    for (i=0;i<count;i++ ) {
      System.out.println("----------------------------------------------------------");

      System.out.print("please enter the name: ");
      String name=scanner.nextLine();

      System.out.print("please enter the contact number: ");
      String contact_num=scanner.nextLine();

      System.out.print("please enter the address: ");
      String address=scanner.nextLine();

      person[i][0]=name;
      person[i][1]=contact_num;
      person[i][2]=address;
    }

    System.out.println("----------------------------------------------------------");


    System.out.println("details that you stored\n");
    System.out.println("name \t contact_number \t address");

    System.out.println("-----------------------------------------------");


    for (i=0;i<count;i++ ) {

      for (int j=0;j<3;j++ ) {
        System.out.print(person[i][j]+"\t\t");
      }

      System.out.println("\n");

    }

  }
}
