import java.lang.*;
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            if(isprime(Integer.bitCount(i))){
                count++;
            }
        }
        return count;
    }
    public static boolean isprime(int n){
        if(n==1)
        return false;
        if(n==2)
        return true;
        if((n&1)==0)
        return false;
        int max=(int)Math.sqrt(n);
        for(int i=3;i<=max;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
}