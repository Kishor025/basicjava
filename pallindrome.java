
import java.util.*;
public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        int rem,sum=0;
        int temp = number;

        while(number>0)
        {
            rem = number%10;
            sum = (sum*10)+rem;
            number = number/10;
        }
        if (temp == sum)
        {
            System.out.println("palindrome Number");
        }
        else
        {
            System.out.println("Not a palindrome number");
        }
    }
}
