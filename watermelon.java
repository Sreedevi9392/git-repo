import java.util.Scanner;
public class watermelon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user input");
        int x = sc.nextInt();
        if (x%2 != 0 || x==2 )
        {System.out.println("Given watermelon can not be cut in to even weighed pieces");}
        else
        {System.out.println("Given watermelon can be cut in to even weighed pieces");} 
        sc.close();


    }
}

