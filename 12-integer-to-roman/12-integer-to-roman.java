class Solution {
    public String intToRoman(int num) {
        String s = "";
        int n = num; //making a copy
        while (n!=0) {
            String A[] = toAdd(n);
            s += A[0];
            n = Integer.parseInt(A[1]);
        }
        return s;
    }
    
    // returns a 2 element array with the symbol to be concatenated to the string and
    // the remaining number to be converted.
    public String[] toAdd(int n) {
        String A[] = {"",""};
        if (n>=1 && n<5) {
            if(n==4) {
               A[0] = "IV";
               A[1] = "0"; 
            } 
            else {
                A[0] = "I";
                A[1] = Integer.toString(n-1);
            }
        } else if (n>=5 && n<10) {
            if(n==9) {
                A[0] = "IX";
                A[1] = "0"; 
            } 
            else {
                A[0] = "V";
                A[1] = Integer.toString(n-5);
            }
        } else if (n>=10 && n<50) {
            if(n>=40) {
                A[0] = "XL";
                A[1] = Integer.toString(n-40); 
            } 
            else {
                A[0] = "X";
                A[1] = Integer.toString(n-10);
            }
        } else if (n>=50 && n<100) {
            if(n>=90) {
                A[0] = "XC";
                A[1] = Integer.toString(n-90); 
            } 
            else {
                A[0] = "L";
                A[1] = Integer.toString(n-50);
            }
        } else if (n>=100 && n<500) {
            if(n>=400) {
                A[0] = "CD";
                A[1] = Integer.toString(n-400); 
            } 
            else {
                A[0] = "C";
                A[1] = Integer.toString(n-100);
            }
        } else if (n>=500 && n<1000) {
            if(n>=900) {
                A[0] = "CM";
                A[1] = Integer.toString(n-900); 
            } 
            else {
                A[0] = "D";
                A[1] = Integer.toString(n-500);
            }
        } else {
            A[0] = "M";
            A[1] = Integer.toString(n-1000);
        }
        return A;
    }
}