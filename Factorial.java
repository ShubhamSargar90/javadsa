import java.util.Scanner;
public class Factorial{
    public static int Facto(int num){
        int fact=1;
        for(int i=1;i<=num; i++){
            fact= fact * i;
    }
    return fact;
}
public static void main(String[]args){
    System.out.println("enter a number ");
    Scanner sc=new Scanner(System.in);
    int num =sc.nextInt();
    System.out.println(Facto(num));
}}