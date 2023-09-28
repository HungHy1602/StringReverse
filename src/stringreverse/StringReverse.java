/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringreverse;

/* Name: Ngo Huy Quang Truong
Student Code: SE151285
Purpose: Problem 1 - Recursion Practice.
 */
public class StringReverse {

    // This is a recursive method for reversing a string.
    public static void reverse(String str) {
        // Check if the input string is null or has a length less than or equal to 1.
        if ((str == null) || (str.length() <= 1)) {
            // If true, print the string as is (base case for recursion).
            System.out.println(str);
        } else {
            // If false, print the last character of the string.
            System.out.print(str.charAt(str.length() - 1));
            // Call the reverse method recursively with the substring of the input string
            // excluding the last character.
            reverse(str.substring(0, str.length() - 1));
        }
    }

    // This is the main method where the program starts execution.
    public static void main(String[] args) {
        // Create a string to be reversed.
        String str = "StringReverse Using Recursion";
        // Call the reverse method with the input string.
        StringReverse.reverse(str);
    }
}
