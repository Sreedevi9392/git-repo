import java.util.Scanner;
public class CheckforBiggerNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user input for three natural numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a==b && a ==c)
        System.out.println("All numbers are equal");
        else if(a>=b && a>=c)
        System.out.println("Greatest number is"+" "+a);
        else if(b>=a && b>=c)
        System.out.println("Greatest number is"+" "+b);
        else if(c>=a && c>=b)
        System.out.println("Greatest number is"+" "+c);
        sc.close();
    }
}
