import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int len = s.length();
        int num = 0; //to store the final value
        for(int a=0; a<len; a++) {
            if(s.charAt(a) == 'I' && a!=(len-1)) {
                if(s.charAt(a+1) == 'V') {
                    num += 4;
                    a++;
                } 
                else if (s.charAt(a+1) == 'X') {
                    num += 9;
                    a++;
                }
                else {
                    num += 1;
                }
            }
            else if (s.charAt(a) == 'X' && a!=(len-1)) {
                if(s.charAt(a+1) == 'L') {
                    num += 40;
                    a++;
                } 
                else if (s.charAt(a+1) == 'C') {
                    num += 90;
                    a++;
                }
                else {
                    num += 10;
                }
            }
            else if (s.charAt(a) == 'C' && a!=(len-1)) {
                if(s.charAt(a+1) == 'D') {
                    num += 400;
                    a++;
                } 
                else if (s.charAt(a+1) == 'M') {
                    num += 900;
                    a++;
                }
                else {
                    num += 100;
                }
            }
            else {
                num += roman.get(s.charAt(a));
            }
        }
        return num;
    }
}