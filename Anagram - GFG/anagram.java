//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends




class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String s,String t)
    {
        
        boolean one = true;
        char [] ar = new char[s.length()];
        char [] arr = new char[s.length()];
        if(s.length()==t.length()){
            for(int i=0; i<s.length();i++){
                ar[i]= s.charAt(i);
                arr[i]= t.charAt(i);
            }
        }
        else{
            return false;
        }
        Arrays.sort(ar);
        Arrays.sort(arr);
        for(int i=0;i<ar.length;i++){
            if(ar[i]==arr[i]){
                one = true;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}