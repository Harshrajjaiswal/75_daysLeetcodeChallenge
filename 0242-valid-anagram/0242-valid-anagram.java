import java.util.Arrays;
class Solution {
    public String sorting(String str){
        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        return sorted;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        s=sorting(s);
        t=sorting(t);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i)){
                return false;
            }
        }
        return true;
    }
}