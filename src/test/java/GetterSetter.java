public class GetterSetter {

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    private int a ;
    private String b;

    public static void main(String[] args)
    {
        GetterSetter getsetobj = new GetterSetter();


        getsetobj.setA(10);

        getsetobj.setB("shibahar");

        System.out.println(" b value " +getsetobj.getA());
    }
}