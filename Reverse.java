import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String Str = sc.nextLine();
        String reversed = "";
        for(int i = Str.length() - 1; i>= 0; i--){
            reversed = reversed + Str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
 }
    
}
