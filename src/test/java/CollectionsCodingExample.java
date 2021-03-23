import java.util.*;

public class CollectionsCodingExample {

    public static void main(String news[])
    {
        List<Integer> lobj= new ArrayList<Integer>();

        //Code like this permitted because of auto boxing

        lobj.add(5); // new Integer(5)

        //5 is auto boxed and stored into arraylist

        List<String> slobj = new ArrayList<String>();

        ArrayList<String> al = new ArrayList<String>();


        LinkedList<String> obj = new LinkedList<String >();
        slobj = new LinkedList<String>();


        slobj.add("hi");
        slobj.add("hello");
        slobj.add("bye");

        System.out.println("test " +slobj.indexOf("hii"));

        Collections.sort(slobj);

        System.out.println("After Sorting "+slobj.toString());

        Iterator<String> itobj = slobj.iterator();

        while (itobj.hasNext())
        {
            String valuestring = itobj.next();
            System.out.println("Value string " +valuestring);
        }


        Set<String> sobj = new LinkedHashSet<String>();

        sobj.add("test");
        sobj.add("new");
        sobj.add("new");
        sobj.add("fork");


        System.out.println("sobj "+sobj.toString());

        Iterator<String> itsobj = sobj.iterator();

        while(itsobj.hasNext())
        {
            String sobjvalue = itsobj.next();
            System.out.println("Final values " +sobjvalue);
        }


//  Treeset stores the object in sorted order -ascending -wont allow duplicates
        Set<String> tsobj = new TreeSet<String>();

        tsobj.add("test");
        tsobj.add("new");
        tsobj.add("new");
        tsobj.add("fork");

        System.out.println(tsobj.toString());


        //Hashmap will allow only one null value
        //If we keep a duplicate key it will overwrite
        //Duplicate values are allowed

        //Hashmap will allow one null key and multiple null values

        Map<Integer,String> mapobj = new HashMap<Integer,String>();

        mapobj.put(1,"shibahar");
        mapobj.put(2,"Mano");
        mapobj.put(3,"Mano");
        mapobj.put(4,null);

        mapobj.put(null,"nullvalue");
        mapobj.put(null,"nullvalue2");

        //Iterator<Map.Entry<Integer,String>> mapitr = mapobj.entrySet().iterator();

        Iterator<Map.Entry<Integer,String>> mapitr = mapobj.entrySet().iterator();

        while(mapitr.hasNext())
        {
            System.out.println("map entry set values "+mapitr.next());
        }

        for (Map.Entry<Integer, String> integerStringEntry : mapobj.entrySet()) {


            Integer keyvalue =integerStringEntry.getKey();
            String valuestring =integerStringEntry.getValue();

            System.out.println("Key and value " +keyvalue+ ""+valuestring);
        }


        //Tree Map - Sorted in order duplicates not allowed

        //

        Map<Integer,String> treemapobj = new TreeMap<>();

        treemapobj.put(1,"shibahar");
        treemapobj.put(3,"Mano");
        treemapobj.put(2,"Thanu");
       // treemapobj.put(null,"sfsdf"); -- This will give null pointer exception

        System.out.println("Treemap just printing "+treemapobj);
        Iterator <Map.Entry<Integer,String>> treeitobj = treemapobj.entrySet().iterator();

        while (treeitobj.hasNext())
        {
            System.out.println("treeitobj " +treeitobj.next());
        }


        //Hastable will not accept null value

        Map<Integer,String> hstobj = new Hashtable<Integer,String>();

        hstobj.put(1,"first");
        hstobj.put(2,"second");
        hstobj.put(3,"third");
       // hstobj.put(4,null);

        //Hashtable will not allow null key or null value
        Iterator<Map.Entry<Integer,String>> hstitrobj = hstobj.entrySet().iterator();

        while(hstitrobj.hasNext())
        {
            System.out.println("hast table key values " +hstitrobj.next());
        }



    }
}