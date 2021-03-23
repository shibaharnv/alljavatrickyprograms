package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateFindingInListUsingSet {

    public static void main(String[] args) {

        ArrayList<String> aobj = new ArrayList<String>();

        aobj.add("hi");
        aobj.add("hi");
        aobj.add("hello");
        aobj.add("bye");
        aobj.add("test");
        aobj.add("give");
        aobj.add("new");
        aobj.add("raw");
        aobj.add("spider");

        System.out.println("before removing duplicates " + aobj.toString());


        Set<String> sobj = new LinkedHashSet<>(aobj);

        //Instead of linkedhashset if you are using Hashset then the output will not be ordered.

        System.out.println("After removing " + sobj.toString());


    }


}