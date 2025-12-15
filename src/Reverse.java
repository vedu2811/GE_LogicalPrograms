public class Reverse {
    public void reverseNumber(int n){
        int rev=0;
        while(n>0){
            int mod=n%10;
            rev=rev*10+mod;
            n/=10;
        }
        System.out.println(rev);
    }
}
