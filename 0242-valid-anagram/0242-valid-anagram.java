class Solution {
    public boolean isAnagram(String s, String t) {
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