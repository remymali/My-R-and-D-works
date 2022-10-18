public class StaticExample {
    // Java program to demonstrate that
// In both static and non-static methods,
// static methods are directly accessed.
  static int num=10;
  static String  head="Hello static";
    public static void main(String arg[])
    {
     StaticExample stObj=new StaticExample();
     stObj.nonStaticdisplay();
     display();
    }               
    static void display()
    {
        System.out.println("Static number:"+num);
        System.out.println("Static string :"+head);
    }
    void nonStaticdisplay()
    {//static method can be accessed in a non static method
        display();
    }
}
