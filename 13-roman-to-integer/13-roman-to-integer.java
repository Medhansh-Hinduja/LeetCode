class Solution {
    public int romanToInt(String s) {
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
            else if (s.charAt(a) == 'V') {
                num += 5;
            }
            else if (s.charAt(a) == 'L') {
                num += 50;
            }
            else if (s.charAt(a) == 'D') {
                num += 500;
            }
            else if(s.charAt(a) == 'M'){
                num += 1000;
            }
            else if(s.charAt(a) == 'I'){
                num += 1;
            }
            else if(s.charAt(a) == 'X'){
                num += 10;
            }
            else if(s.charAt(a) == 'C'){
                num += 100;
            }
        }
        return num;
    }
}