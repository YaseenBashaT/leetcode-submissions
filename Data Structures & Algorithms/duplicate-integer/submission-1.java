class Solution {
    public boolean hasDuplicate(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }
    
}
