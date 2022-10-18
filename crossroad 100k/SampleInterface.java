public class SampleInterface extends AbstractSample{
    // public void OnText(String text)
    // {
    //     System.out.println(text);
    // }
    public void OnTextdetail(String text)
    {
        System.out.println(text);
    }
     SampleInterface()
     {
        AbstractTextScanner objAb= new AbstractTextScanner(this);
        objAb.scan();

     }
     public static void main(String arg[])
     {
        SampleInterface obj =new SampleInterface();
        
     } 
}
