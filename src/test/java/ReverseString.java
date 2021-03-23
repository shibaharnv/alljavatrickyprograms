public class ReverseString {


    public static void main(String args[]) {



        String word = "abcd";

        String reverse = "";



        for(int i=word.length()-1;i>=0;i--)
        {
            char c =word.charAt(i);
            reverse =reverse+c;

        }

        System.out.println("reverse "+reverse);


    }
}