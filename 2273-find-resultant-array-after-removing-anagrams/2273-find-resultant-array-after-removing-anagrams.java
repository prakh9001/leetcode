class Solution {
    public boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])return false;
        }
        return true;
    }
    public List<String> removeAnagrams(String[] words) {
        List<String> list=new ArrayList<>();
        boolean vis[]=new boolean[words.length];
        for(int i=0;i<words.length-1;i++){
            int j=i+1;
            while(vis[j]==true){
                j++;
            }
            if(isAnagram(words[i],words[j])){
                vis[j]=true;
            }
        }
        for(int i=0;i<words.length;i++){
            // System.out.print(i+"--"+vis[i]);
            if(vis[i]==false)
            {
                list.add(words[i]);
            }
        }
        return list;
    }
}