package test;

import java.io.IOException;

public class AnalogClockJustAnswersAssignment {

    public static void main(String args[]) throws IOException {


        AnalogClockJustAnswersAssignment obj = new AnalogClockJustAnswersAssignment();


        obj.GetAngle(10,30);
    }


     float  GetAngle (int hour,int minute)
    {
            // Code to be executed

        if(hour>12 &&minute>60) {

            throw new ArithmeticException("not valid");

        }
        else
        {
            float angle =90;//sample angle will be return based on the actual function.for example i have given 90

            return angle;

        }

    }

}