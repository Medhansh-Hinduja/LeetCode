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
}