import java.util.Scanner;
public class SumofFirstNNaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user input");
        int n = sc.nextInt();
        System.out.println("Sum of first n natural numbers is"+" "+(n*(n+1)/2));
        sc.close();

    }
    
}
