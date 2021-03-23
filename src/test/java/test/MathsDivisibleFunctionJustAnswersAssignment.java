package test;

import org.apache.http.impl.conn.SystemDefaultRoutePlanner;

import java.io.IOException;

public class MathsDivisibleFunctionJustAnswersAssignment {

    public static void main(String args[]) throws IOException {


        MathsDivisibleFunctionJustAnswersAssignment obj = new MathsDivisibleFunctionJustAnswersAssignment();


        obj.mathsFunction(60,90);

    }



    void  mathsFunction (double firstnumber,double secondnumber)


    {

        double medium = firstnumber;
        firstnumber =secondnumber;
        secondnumber =medium;

         System.out.println("firstnumber "+firstnumber);
        System.out.println("secondnumber "+secondnumber);




        double quotient = firstnumber / secondnumber;

        double remainder = firstnumber % secondnumber;

        System.out.println("quotient "+quotient);

        System.out.println("remainder "+remainder);

    }

}