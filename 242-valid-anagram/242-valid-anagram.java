import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> A = new HashMap<Character, Integer>();
        int len1 = s.length();
        int len2 = t.length();
        for(int a=0; a<len1; a++) {
            if(A.get(s.charAt(a)) == null) {
                A.put(s.charAt(a), 1);
                // System.out.println("Key:" + s.charAt(a) + " Value: 1");
                continue;
            }
            int n = A.get(s.charAt(a));
            n++;
            A.put(s.charAt(a), n);
            // System.out.println("Key:" + s.charAt(a) + "Value:" + n);
        }
        // all characters of s are in the HashMap
        // let's check t now
        for(int a=0; a<len2; a++) {
            if(A.get(t.charAt(a)) == null) {
                return false;
            }
            int n = A.get(t.charAt(a));
            n--;
            A.put(t.charAt(a), n);
        }
        // now, we need to make sure that all values in the HashMap are zero i.e. each letter was
        // used exactly once.
        for(int a : A.values()) {
            if (a!=0) {
                return false;
            }
        }
        return true;
    }
    
    // public boolean isAnagram(String s, String t) {
    //     int len1 = s.length();
    //     int len2 = t.length();
    //     if(len1 != len2) { // unequal length strings cannot be anagrams
    //         return false;
    //     }
    //     boolean chk = false;
    //     for(int a=0; a<len1; a++) {
    //         chk=false;
    //         char ch = s.charAt(a);
    //         for(int b=0; b<t.length(); b++) {
    //             if(t.charAt(b) == ch) {
    //                 chk=true;
    //                 t = t.substring(0,b) + t.substring(b+1); //dropping that character
    //                 break;
    //             }
    //         }
    //         if(!chk) {
    //             return false;
    //         }
    //     }
    //     return t.equals("");
    // }
}