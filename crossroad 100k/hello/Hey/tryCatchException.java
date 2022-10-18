
public class tryCatchException {
    public static void main(String ar[])
    {
    try {
        int [] marks={12,23,45};
        System.out.println(marks[10]);
    } catch (Exception e) {
        System.out.println("Something went wrong");
    }
    }
}
