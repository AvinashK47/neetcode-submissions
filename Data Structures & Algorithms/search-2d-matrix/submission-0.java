class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lowRow = 0;
        int highRow = matrix.length - 1;
        int targetRow = -1;
        while (lowRow <= highRow) {
            int midRow = lowRow + (highRow - lowRow) / 2;
            if (target >= matrix[midRow][0]
                && target <= matrix[midRow][matrix[midRow].length - 1]) {
                targetRow = midRow;
                break;
            }
            if (target < matrix[midRow][0]) {
                highRow = midRow - 1;
            } else {
                lowRow = midRow + 1;
            }
        }
        if (targetRow == -1) {
            return false;
        }
        int lowCol = 0;
        int highCol = matrix[0].length - 1;
        while (lowCol <= highCol) {
            int midCol = lowCol + (highCol - lowCol) / 2;
            if (matrix[targetRow][midCol] == target) {
                return true;
            }
            if (matrix[targetRow][midCol] < target) {
                lowCol = midCol + 1;
            } else {
                highCol = midCol - 1;
            }
        }
        return false;
    }
}
