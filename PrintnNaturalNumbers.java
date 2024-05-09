import java.util.Scanner;
public class PrintnNaturalNumbers {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number till which you want to print natural numbers");
        int n =  sc.nextInt();
        for(int i=1; i<=n; i++)
        {System.out.println(i);}
        sc.close();
    }
}
