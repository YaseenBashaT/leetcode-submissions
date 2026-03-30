class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = (nums1.length<=nums2.length) ? nums1:nums2;
        int[] B = (nums1.length<=nums2.length) ? nums2:nums1;
        int total = nums1.length+nums2.length;
        int half = (total+1)/2;

        int l=0, r=A.length;
        while(l<=r){
            int i=(l+r)/2;
            int j= half-i;

            int AleftMax = i>0 ? A[i-1] : Integer.MIN_VALUE;
            int ArightMin = i<A.length ? A[i] : Integer.MAX_VALUE;
            int BleftMax = j>0 ? B[j-1] : Integer.MIN_VALUE;
            int BrightMin = j<B.length ? B[j] : Integer.MAX_VALUE;

            if(AleftMax <= BrightMin && BleftMax <= ArightMin){
                if(total%2 != 0){
                    return Math.max(AleftMax,BleftMax);
                }
                return (Math.max(AleftMax,BleftMax) + Math.min(BrightMin, ArightMin))/2.0;
            }else if(BleftMax > ArightMin){
                l=i+1;
            }else{
                r=i-1;
            }
        }
        return -1;
        
    }
}
