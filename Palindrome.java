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
class Palindrome {

    public static void main(String[] args) {

        System.out.println("Enter the string");

        String str = new Scanner(System.in).nextLine();
        String Result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            Result += str.charAt(i);

            System.out.println("\nReverse String of " + str + " is =" + Result);
        }
        if (Result.equals(str)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

    }

}
