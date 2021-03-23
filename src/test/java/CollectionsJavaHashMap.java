

import java.util.ArrayList;

import java.util.*;

import java.util.HashMap;

public class CollectionsJavaHashMap {


    public static void main(String[] args) {


        HashMap<Integer,String> hm = new HashMap<Integer,String >();

        hm.put(1,"hi");
        hm.put(2,"to");
        hm.put(5,"my");
        hm.put(10,"good");
        hm.put(20,"wife");
        hm.put(20,"");
        hm.put(20,"");
        hm.put(10,"");

        String value =hm.get(5);
        System.out.println(value);
        Set enrtysetobj =hm.entrySet();

        Iterator iobj=enrtysetobj.iterator();

            while (iobj.hasNext())
            {
                Map.Entry mapentryobj =(Map.Entry)iobj.next();

              System.out.println(mapentryobj.getKey());
                System.out.println(mapentryobj.getValue());

            }




    }

}