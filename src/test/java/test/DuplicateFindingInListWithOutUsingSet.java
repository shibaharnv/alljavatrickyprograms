package test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateFindingInListWithOutUsingSet {

    public static void main(String[] args) {

        ArrayList<String> aobj = new ArrayList<String>();

        aobj.add("hi");
        aobj.add("hi");
        aobj.add("hello");
        aobj.add("bye");
        aobj.add("tbye");
        aobj.add("hbye");
        aobj.add("lbye");


        System.out.println("before removing duplicates " + aobj.toString());



        for(int i=0;i<aobj.size();i++)
        {
            for(int j=i+1; j<aobj.size();j++)
            {

                if(aobj.get(i).equalsIgnoreCase(aobj.get(j)))
                {
                    aobj.remove(j);

                }

            }
        }

        System.out.println(aobj.toString());


    }


}