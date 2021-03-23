package test;

public class ReverseSentence {

    String[] splitString;

    char charchanged1;
    char charchanged2;
    String outputString;

    public static void main(String[] args)
    {

        ReverseSentence obj = new ReverseSentence();

      String xoutString=  obj.reverseSentenceMethod("This is text");

        System.out.println("xoutString "+xoutString);






        // First need to identify the space
        // Break the sentence into words .
        //get the first word do get chartat(1) to see if it is lowercase or uppercase
        //do the conversion lower/upper
        //  total length of the word and do a for loop (to reverse the rest of the string)
        // add it back to the string

    }

    public String reverseSentenceMethod(String inputString)
    {

       splitString =inputString.split(" ");

        for(int i=0; i<splitString.length;i++)
        {
            System.out.println(splitString[i]);

            char firstCharacter =splitString[i].charAt(0);

                 boolean b1 =   Character.isUpperCase(firstCharacter);

            System.out.println(b1);

            if(b1)
            {
               charchanged1 =  Character.toLowerCase(firstCharacter);

              System.out.println(charchanged1);

               outputString=  reversalMethod(i,charchanged1);


            }
            else
            {
                 charchanged2 =  Character.toUpperCase(firstCharacter);
                System.out.println(charchanged2);
                 outputString =reversalMethod(i,charchanged2);

            }
        }

        return  outputString;

    }


    String reversalMethod(int i,char charchanged)
    {

        StringBuilder sbobj= new StringBuilder(splitString[i]);

        String stringAfterFirstCharRemoval = sbobj.deleteCharAt(0).toString();

        System.out.println("stringAfterFirstCharRemoval "+stringAfterFirstCharRemoval);
        String finalreverse="";
        char[] chararry =stringAfterFirstCharRemoval.toCharArray();
        for(int j=chararry.length-1;j>=0;j--)
        {
            finalreverse = finalreverse + chararry[j] ;
        }
        System.out.println("finalreverse "+finalreverse);

        String finalOutString = charchanged + finalreverse;

        System.out.println("finalOutString "+finalOutString);

        String xxfinalString="";

        xxfinalString= xxfinalString+ finalOutString.concat(" ");

        System.out.println("xxfinalString "+xxfinalString);

        return xxfinalString;




    }
}