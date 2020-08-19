package com.sparta.tk;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Palindrome Word Checker
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word to check: ");
        String word = scan.next();
        System.out.println(PalindromeCheck.palindromeChecker(word));

        /*
        Palindrome Sentence Checker
        */
        Scanner nextScan = new Scanner(System.in);
        System.out.println("Enter a sentence to check for the longest palindrome word: ");
        String sentence = nextScan.nextLine();
        System.out.println(PalindromeCheck.palindromeSentenceChecker(sentence));
    }
}
