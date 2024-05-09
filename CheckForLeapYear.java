import java.util.Scanner;
public class CheckForLeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int n = sc.nextInt();
        if (n%4==0){
            if (n%100 != 0){
                System.out.println("Given year is leap year");}
            else{
            if (n%400==0){
                System.out.println("Given year is a leap year");}
            else {System.out.println("Not a leap year");}
            }}
        else
        System.out.println("Not a leap year");
sc.close();
    }
    
}
