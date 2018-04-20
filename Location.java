import java.util.Scanner;

public class Location {
    public static int row, column, rowMax, columnMax;
    public static double maxValue;

    public static double locateLargest(double[][] array) {
        rowMax = 0;
        columnMax = 0;
        maxValue = array[rowMax][columnMax];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    rowMax = i;
                    columnMax = j;
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        row = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        column = scanner.nextInt();
        double[][] array = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter valute at " + j + ", " + i);
                array[i][j] = scanner.nextDouble();
            }
        }
        locateLargest(array);
        System.out.println("Max value = " + maxValue + " at location " + columnMax + ", " + rowMax);
    }
}
