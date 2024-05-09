import java.util.Scanner;
public class CheckForPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user input");
        int x = sc.nextInt();
        int count = 0;
        if(x==1)
        System.out.println("Given number is composite");
        else{
        for (int i=2; i<x; i++){
            if (x%i == 0)
            count++;}       
        if (count>0){
            System.out.println("Given number is not prime");}
        else
            System.out.println("Given number is prime"+" "+count);
            sc.close();
        }
    }
}
