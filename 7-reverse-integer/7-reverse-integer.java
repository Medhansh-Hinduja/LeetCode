class Solution {
    public int reverse(int x) {
        int n=x;
        int m=0; //to store the reversed number
        while(n!=0){
            if(m > Integer.MAX_VALUE/10)
                return 0;
            if (m < Integer.MIN_VALUE/10)
                return 0;
             m = (m*10) + (n%10);
             n/=10;
            }
        return m;
    }
}