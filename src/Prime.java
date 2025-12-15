public class Prime {
    public void isPrime(int n){
        if(n==0 || n==1){
            System.out.println("Not prime");
            return;
        }
        if(n==2){
            System.out.println("Prime");
            return;
        }
        if(n%2==0){
            System.out.println("Not Prime");
            return;
        }
        for(int i=3;i<n/2;i+=2){
            if(n%i==0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
