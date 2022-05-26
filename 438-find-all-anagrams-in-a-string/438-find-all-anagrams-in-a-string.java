import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int len1 = p.length();
        int len2 = s.length();
        List<Integer> output = new ArrayList<Integer>();
        for(int a=0; a<(len2-len1+1); a++) {
            boolean chk1 = false;
            for(char c: p.toCharArray()) {
                if(s.charAt(a) == c) {
                    chk1 = true;
                    break;
                }
            }
            if(!chk1) continue;
            String s1 = s.substring(a, a+len1);
            boolean chk = isAnagram(p, s1);
            if(chk) {
                output.add(a);
            }
        }
        return output;
    }
    
    // checks if s and t are anagrams or not
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len1 != len2) { // unequal strings cannot be anagrams
            return false;
        }
        int count[] = new int[26];
        // add all the characters of s
        for(int a=0; a<len1; a++) {
            count[s.charAt(a) - 'a']++;
        }
        // remove all corresponding characters of t
        for(int b=0; b<len2; b++) {
            count[t.charAt(b) - 'a']--;
        }
        // check for non-zero elements and return false, if any
        for(int c=0; c<count.length; c++) {
            if(count[c] != 0) {
                return false;
            }
        }
        return true;
    }
}