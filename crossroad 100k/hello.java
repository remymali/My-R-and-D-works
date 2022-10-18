

public class hello {
    public static void main(String[] args)
     {
    //   SampleTread  s1=new SampleTread();
    //   SampleTread  s2=new SampleTread();
    //   SampleTread  s3=new SampleTread();
    //   s1.start();
    //   s2.start();
    //   s3.start();
    SampleTread st1=new SampleTread();
     Thread T1=new Thread(st1);
     T1.start();
     SampleTread st2=new SampleTread();
     Thread T2=new Thread(st2);
     T2.start();
     SampleTread st3=new SampleTread();
     Thread T3=new Thread(st3);
     T3.start();
     }
 }
 