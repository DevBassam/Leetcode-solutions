class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        boolean isEven = mat.length % 2 == 0;
        for(int i = 0; i < mat.length; i++){
            sum += mat[i][i]; // primary digonal
            sum += mat[i][mat.length - i - 1]; // secondry digonal
        }
        sum -= (isEven) ? 0 : mat[mat.length/2][mat.length/2] ; // subtract the center in odd matrix "added twice"
        return sum;
    }
}
