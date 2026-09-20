class MatrixAdvanced {
    public static double[][] createRandomMatrix(int rows, int columns) {
        double[][] matrix = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = 1 + (int)(Math.random() * 9);
            }
        }

        return matrix;
    }

    public static double[][] transpose(double[][] matrix) {
        double[][] result = new double[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] -
               matrix[0][1] * matrix[1][0];
    }

    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static double[][] inverse2x2(double[][] matrix) {
        double determinant = determinant2x2(matrix);

        if (determinant == 0) {
            return new double[0][0];
        }

        double[][] inverse = new double[2][2];

        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;

        return inverse;
    }

    public static double[][] inverse3x3(double[][] matrix) {
        double determinant = determinant3x3(matrix);

        if (determinant == 0) {
            return new double[0][0];
        }

        double[][] inverse = new double[3][3];

        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / determinant;
        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / determinant;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / determinant;

        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / determinant;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / determinant;
        inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / determinant;

        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / determinant;
        inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / determinant;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / determinant;

        return inverse;
    }

    public static void displayMatrix(double[][] matrix) {
        if (matrix.length == 0) {
            System.out.println("Inverse does not exist");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%.2f\t", matrix[i][j]);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] matrix2 = createRandomMatrix(2, 2);

        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2);

        System.out.println("Transpose:");
        displayMatrix(transpose(matrix2));

        System.out.println("Determinant = " + determinant2x2(matrix2));

        System.out.println("Inverse:");
        displayMatrix(inverse2x2(matrix2));

        double[][] matrix3 = createRandomMatrix(3, 3);

        System.out.println("3x3 Matrix:");
        displayMatrix(matrix3);

        System.out.println("Transpose:");
        displayMatrix(transpose(matrix3));

        System.out.println("Determinant = " + determinant3x3(matrix3));

        System.out.println("Inverse:");
        displayMatrix(inverse3x3(matrix3));
    }
}
