import java.util.Scanner;
public class PrintAllEvenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want all the even numbers starting from 2");
        int x = sc.nextInt();
        for (int  i=2; i<=x; i+=2 ){
        System.out.println(i);}
        sc.close();

    }
}
