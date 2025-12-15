public class Fibonacci {
    public void printFibonacci(int n){
        int num1=0;
        int num2=1;
        int num3=0;
        System.out.println(num1);
        System.out.println(num2);
        n-=2;

        while(n>0){
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.println(num3);
            n--;
        }
    }
}
