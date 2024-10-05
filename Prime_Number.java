import java.util.Scanner;


public class Prime_Number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive numbere:"+" ");
        int number=sc.nextInt();
        boolean isPrime=checkPrime(number);
        if(isPrime){
            System.out.println(number +" is a prime number");
        }else{
            System.out.println(number +" is not a prime number");
        }
    }
    public static boolean checkPrime(int number){
        if(number <= 1) {
            return false;
        }
        for(int i=2;i<Math.sqrt(number);i++)
        {
            if(number % 2 ==0){
                return false;
            }
        }
        return true;    }
}
