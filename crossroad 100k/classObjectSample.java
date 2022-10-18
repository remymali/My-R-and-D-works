public class classObjectSample{
    public static void main(String ar[])
    {

        sample obj1=new sample();
        sample obj2=new sample();
        System.out.println("Sample project");
        obj1.a=10;
        obj1.b=20;
        obj2.a=40;
        obj2.b=30;
        
        classObjectSample cobj=new classObjectSample();
        
        sample s=new sample();
        s.Sum(obj1.a, obj1.b);
        s.Display();
        s.Sum(obj2.a,obj2.b);
        s.Display();
        
    }
    classObjectSample()
        {
            System.out.println("Hello");
        }
}
