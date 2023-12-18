import java.util.*;
public class array2 {
    public static void main(String[] args) {
        //program about unique element in an array
        //uniqueElement();
        //program to find given number is happy number or not
        //happyNumber();
        //program to find missing element in given array from 0ton elements
        //missingNumber();
        //program to do bubble sort
        bubbleSort();

    }
    public static void uniqueElement(){
        int[] a={1,1,2,2,3,3,4,5,5};
        int xor=0;
        for(int i=0;i<a.length;i++){
            xor=xor^a[i];
        }
        System.out.println("unique element is : " +xor);
    }

    public static void happyNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int a=sc.nextInt();
        int slow=a;
        int fast=a;
        do{
            slow=calculate(slow);
            fast=calculate(calculate(fast));
        }while(fast!=slow && fast!=1);
        if(fast==1){
            System.out.println("given number is a happy number");
        }
        else{
            System.out.println("given number is not a happy number");
        }
    }
    public static int calculate(int n){
        int sum = 0;
        while (n>0) {
            int id=n%10;
            sum += (id*id);
            n = n/10;
        }
        return sum;
    }

    public static void missingNumber(){
        int[] a={0,1,2,3,4,6};
        int xor=a.length;
        for(int i=0;i<a.length;i++){
            xor=xor^a[i]^i;
        }
        System.out.println("missing number is: " +xor);
    }

    public static void bubbleSort(){
        int[] a={5,4,3,2,1};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
