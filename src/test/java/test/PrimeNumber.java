package test;

import java.io.IOException;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]) throws IOException {

        Scanner sobj = new Scanner(System.in);

       int givenNumber= sobj.nextInt();
        System.out.println(givenNumber);

        String answer =primenumber(givenNumber);

        System.out.println("answer "+answer);

    }


    public static String primenumber(int givenNumber)
    {



        int remainder;
        boolean flag =false;

        for(int i=2;i<givenNumber;i++)
        {
            remainder= givenNumber%i;

            if(remainder==0)
            {
                flag =true;
                break;
            }

        }

        if(flag)
        {
            System.out.println("Given number "+givenNumber+" not is prime number" );

            return  "Not Prime";

        }

        else
        {
            System.out.println("Given number "+givenNumber+"  is  prime number" );

            return  "Prime";
        }

    }
}