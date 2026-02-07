import java.io.ObjectInputFilter.Status;

public class logical {
    public static void main(String[] args) {
        int marks=95;
        boolean status=true;
        if(marks>90 && marks<100)
            System.out.println("A grade");
        else if(marks>35 || marks==35)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println(!status);
        }
    
}
}
