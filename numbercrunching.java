import java.util.*;
public class numbercrunching {
    public static int noOfDigits(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }

    public static int reverse(int n){
        int rev=0;
        int r;
        while(n>0){
            r=n%10;
            rev=(rev*10)+r;
            n/=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int c=noOfDigits(n);
        System.out.println("no of digits is : "+c);
        int r=reverse(n);
        System.out.println("The reverse of a given number is : "+r);
    }
}
