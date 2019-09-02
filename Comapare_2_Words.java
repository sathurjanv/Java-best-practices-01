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

import java.util.Scanner; 




class Comapare_2_Words{
  public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);

    System.out.print("please enter the firstword: ");
    String StringFirstWord=scanner.nextLine();
    System.out.println("--------------------------------------");
    int FirstWordLength = StringFirstWord.length();


    System.out.print("please enter the secondword in "+FirstWordLength+" words: ");
    String StringSecondWord=scanner.nextLine();
    System.out.println("--------------------------------------");
    int SecondWordLength = StringSecondWord.length();


    if (FirstWordLength==SecondWordLength) {

      int length=FirstWordLength;
      char[] FirstWord=StringFirstWord.toCharArray();
      char[] SecondWord=StringSecondWord.toCharArray();

      for (int i=0;i<length ;i++ ) {
        if(FirstWord[i]!=SecondWord[i]){
          System.out.print("Sorry.the words are not same.");
          System.exit(0);
        }
      }

      System.out.print("The words are same.");



    }

    else{
      System.out.print("Sorry.the words are not same length.");
    }

  }
}