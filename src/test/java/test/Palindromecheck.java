package test;

public class Palindromecheck {


    public static void main(String args[]) {



        String word = "madam";

        String reverse = "";



        for(int i=word.length()-1;i>=0;i--)
        {
            char c =word.charAt(i);
            reverse =reverse+c;

        }

        System.out.println("reverse "+reverse);

        if(word.equals(reverse))
        {
            System.out.println("The given number is Palindrome.");
        }


    }
}