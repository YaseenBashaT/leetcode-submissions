class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> visit = new HashSet<>();
        while(!visit.contains(n)){
            visit.add(n);
            n=isSumSquare(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
        private int isSumSquare(int n){
            int sum = 0;
            while(n>0){
                int lastDigit=n%10;
                lastDigit *= lastDigit;
                sum += lastDigit;
                n/=10;
            }
            return sum;
        }
}
