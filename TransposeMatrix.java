public class TransposeMatrix {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        int rows = In.getInt();
        System.out.println("Enter the number of columns: ");
        int columns = In.getInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element at a position(" + (i + 1) + ", " + (j + 1) + "):");
                matrix[i][j] = In.getInt();
            }
        }

        int[][] transposedMatrix = transpose(matrix);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("\nTransposed Matrix:");
        printMatrix(transposedMatrix);
    }

    private static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}