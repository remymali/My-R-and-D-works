public class Static {
     int a=10;
     static int b=200;
    public static void main(String arg[])
    {
        Static h=new Static();
        h.simpleDisplay();
        StaticDisplay();
        
       // System.out.println(h.a);
    }
    void simpleDisplay()
    {
        System.out.println(a);
        System.out.println(b);

    }
    static void StaticDisplay()
    {

        System.out.println(b);
    }
}
