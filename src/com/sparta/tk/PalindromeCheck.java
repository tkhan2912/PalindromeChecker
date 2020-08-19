package com.sparta.tk;

public class PalindromeCheck {
    static String longestPalidromeWord = "";
    //Palindrome Check
    public static boolean palindromeChecker(String wordToCheck){
        String reverseOfWordToCheck = "";
        for(int i = wordToCheck.length() - 1; i >= 0; i--){
            //System.out.println((wordToCheck.charAt(i))); -debug
            reverseOfWordToCheck = reverseOfWordToCheck.concat(String.valueOf(wordToCheck.charAt(i)));
        }
        if(wordToCheck.equalsIgnoreCase(reverseOfWordToCheck)){
            //System.out.println("true");
            return true;
        }else{
            //System.out.println("false");
            return false;
        }
    }

    //Palindrome Sentence Checker
    public static String palindromeSentenceChecker(String sentenceToCheck){
        sentenceToCheck = sentenceToCheck.toLowerCase();
        String wordToCheck = sentenceToCheck.substring(sentenceToCheck.lastIndexOf(" ") + 1);
        if(PalindromeCheck.palindromeChecker(wordToCheck)){
            if(wordToCheck.length() > longestPalidromeWord.length()){
                longestPalidromeWord = wordToCheck;
            }
        }
        if (sentenceToCheck.contains(" ")){
            sentenceToCheck = sentenceToCheck.substring(0, sentenceToCheck.length() - wordToCheck.length() - 1);
            palindromeSentenceChecker(sentenceToCheck);
        }else{
            return longestPalidromeWord;
        }
        return longestPalidromeWord;
    }
}
