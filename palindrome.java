import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of test cases:");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        { 
            int n=sc.nextInt();
            int temp=n;
            int rev=0;
            while(n!=0)
            {
                int dig=n%10;
                rev=rev*10+dig;
                n=n/10;
            }
            if(rev==temp)
            {
                System.out.println("it is a palindrome:");
            }
            else
            {
                System.out.println("it is not a palindrome:");    
            }
        }
    }
}
