class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0, r=0, res =0;
        for(int num:nums){
            l=Math.max(l,num);
            r+=num;
        }
        res = r;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(countSplit(nums, k, mid)){
                res = mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
    public boolean countSplit(int[] nums, int k, int guess){
        int subArr = 1, currSum = 0;
        for(int num:nums){
            currSum+=num;
            if(currSum>guess){
                subArr++;
                if(subArr>k){
                    return false;
                }
                currSum = num;
            }
        }
        return true;
    }

}