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

        printMatrix(matrix);
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
        System.out.println("\nOriginal Matrix");
        printFormattedMatrix(matrix);

        int[][] transposedMatrix = transpose(matrix);

        System.out.println("\nTransposed Matrix");
        printFormattedMatrix(transposedMatrix);
    }

    private static void printFormattedMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.print("]\n");
        }
    }
}