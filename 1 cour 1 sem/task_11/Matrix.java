package task_11;

import java.util.Scanner;

public class Matrix {

    private final int rows;
    private final int columns;
    private final int[][] matrix;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }

    /*public Matrix(int size) {
        if (size <= 0) {
            System.out.println("Неверный размер");
        }

        this.rows = this.columns = size;
        this.matrix = new int[size][size];
    }
    private static boolean test(Matrix m1, Matrix m2, boolean forMultiply) {
        if(forMultiply) {
            return ((m1.rows == m2.rows) && (m1.columns == m2.columns)) ||
                    (m1.columns == m2.rows);
        }
        else {
            return (m1.rows == m2.rows) && (m1.columns == m2.columns);
        }
    }*/


    public void print() {

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static Matrix sum(Matrix m1, Matrix m2) {
        Matrix m = new Matrix(m1.rows, m1.columns);
        if (m1.rows == m2.rows && m1.columns == m2.columns) {
           // Matrix m = new Matrix(m1.rows, m1.columns);

            for (int i = 0; i < m1.rows; i++) {
                for (int j = 0; j < m1.columns; j++) {
                    m.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
                }
            }
        }
        else {
            System.out.println("Не подходящий размер матрицы");
        }
        return m;
    }


    public static Matrix multiplyStatic(Matrix m1, Matrix m2) {
        Matrix matrix = new Matrix(m1.rows, m2.columns);
        if (m1.columns != m2.rows) {
            System.out.println("Не подходящий размер матриц");
        }
        else {
            for (int i = 0; i < m1.rows; i++) {
                for (int j = 0; j < m1.rows; j++) {
                    for (int k = 0; k < m1.rows; k++) {
                        matrix.matrix[i][j] += m1.matrix[i][k] * m2.matrix[k][j];
                    }
                }
            }
        }
        return matrix;
    }

    public static Matrix multiplyByNumbStatic(Matrix m1, int number) {
        Matrix matrix = new Matrix(m1.rows, m1.columns);
            for (int i = 0; i < m1.rows; i++) {
                for (int j = 0; j < m1.rows; j++) {
                        matrix.matrix[i][j] = m1.matrix[i][j] * number;
                    }
                }
        return matrix;
    }



    public static void filling(Matrix m) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.matrix.length; i++) {
            for (int j = 0; j < m.matrix[i].length; j++) {
                m.matrix[i][j] = sc.nextInt();
            }

        }
        System.out.println("Конец ввода этой матрицы");

    }

    public Matrix multiplyByNumb(int number) {
        Matrix m = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                m.matrix[i][j] = matrix[i][j] * number;
            }
        }
        return m;
    }


    public Matrix multiply(Matrix m2) {
        Matrix m = new Matrix(rows, m2.columns);
        if (columns != m2.rows) {
            System.out.println("Не подходящий размер матриц");
        }
        else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
                    for (int k = 0; k < rows; k++) {
                        m.matrix[i][j] += matrix[i][k] * m2.matrix[k][j];
                    }
                }
            }
        }
        return m;
    }

    public Matrix sum(Matrix m2) {
        Matrix m = new Matrix(rows, columns);
        if (rows == m2.rows && columns == m2.columns) {
            // Matrix m = new Matrix(m1.rows, m1.columns);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    m.matrix[i][j] = matrix[i][j] + m2.matrix[i][j];
                }
            }
        }
        else {
            System.out.println("Не подходящий размер матрицы");
        }
        return m;
    }

    public static void printStatic(Matrix m) {
        for(int i = 0; i < m.rows; i++) {
            for(int j = 0; j < m.columns; j++) {
                System.out.print(m.matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
