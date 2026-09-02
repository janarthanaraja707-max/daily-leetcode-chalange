class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int rows = image.length;
        int cols = image[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                result[i][j] = 1 - image[i][cols - 1 - j];

            }
        }

        return result;
    }
}