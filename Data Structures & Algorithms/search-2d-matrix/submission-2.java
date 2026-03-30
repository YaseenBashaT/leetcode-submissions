class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int top = 0,botm = row-1;
        while(top<=botm){
            int theRow = (top + botm) / 2;
            if(matrix[theRow][col-1] < target){
                top = theRow + 1;
            }else if(matrix[theRow][0] > target){
                botm = theRow - 1;
            }else{
                break;
            }
        }
        if(!(top<=botm)){
            return false;
        }
        int theRow = (top+botm)/2;
        int l = 0, r = col-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(matrix[theRow][mid] < target){
                l = mid+1;
            }else if(matrix[theRow][mid] > target){
                r = mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
