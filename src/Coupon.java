import java.util.*;
public class Coupon {
    public void CouponNumber(int n){
        Set<Integer> CouponSet=new HashSet<>();
        int totalRandomNumbers=0;
        while(CouponSet.size()<n){
            int num = (int) Math.ceil(Math.random()*n);
            totalRandomNumbers++;
            CouponSet.add(num);
        }
        System.out.println(totalRandomNumbers);
    }
}
