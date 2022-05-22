class Solution {
    public int reverse(int x) {
        int n=x;
        boolean chk = false; //true if the number is negative
        if (n<0) {
            chk=true;
            n=-x;
        }
        int m=0; //to store the reversed number
        try {
            while(n!=0){
                if(m > Integer.MAX_VALUE/10)
                    return 0;
                if (m < Integer.MIN_VALUE/10)
                    return 0;
                m = (m*10) + (n%10);
                n/=10;
            }
        }
        catch (Exception e) {
            return 0;
        }
        if (chk) {
            m = -m;
        }
        return m;
    }
}