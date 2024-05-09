import java.util.Scanner;
public class CheckReminder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int n = sc.nextInt();
        int r1 = n%100;
        int r2 = n%400;
        System.out.println("Reminder when divided by 100 is "+r1);
        System.out.println("Reminder when divided by 400 is "+r2);
        sc.close();

    }
    
}
