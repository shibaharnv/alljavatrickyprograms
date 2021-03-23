package test;

import java.util.ArrayList;

public class Testclass {

    //method to input String "This is text"

    //except for the first letter reverse

    public static void main(String args[])
    {


        ArrayList<String> arrobj = new ArrayList<String>();

        arrobj.add(" 1  hi");
        arrobj.add("hi");
        arrobj.add("hello");
        arrobj.add("bye");

        //remove duplicates
        //Indexes --["hi","hi","hello"]

        // Key value - hashmap entryset




        for(int i=0;i<arrobj.size();i++)
        {
            System.out.println(arrobj.get(i));

            for(int j=i+1;j<arrobj.size();j++)
            {
                if(arrobj.get(i).equalsIgnoreCase(arrobj.get(i)))
                {

                }
            }


    }



    }


    // First need to identify the space
    // Break the sentence into words .
    //get the first word do get chartat(1) to see if it is lowercase or uppercase
    //do the conversion lower/upper
    //  total length of the word and do a for loop (to reverse the rest of the string)
    // add it back to the string
}