import java.util.*;
 
class Solution {
    public int titleToNumber(String columnTitle) {
       int counter=-1, sum=0;
        for(int i=columnTitle.length()-1; i>=0; i--){
            counter++;
            sum+= (columnTitle.charAt(i)-'A'+1)*Math.pow(26,counter);
        }    
        return sum;
    }
}