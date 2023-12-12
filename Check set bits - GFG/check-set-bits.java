//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isBitSet(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int isBitSet(int N){
        String s = Integer.toBinaryString(N);
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='0'){
                return 0;
            }
            i++;
            
        }
        return 1;
    }
}