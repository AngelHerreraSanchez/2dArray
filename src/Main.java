public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int i, j, sum = 0;


        for (i = 0; i <  array.length; ++i) {
            for (j = 0; j < array[i].length; ++j) {
                sum += array[i][j];
            }

            System.out.println("Sum of the row " + i + " = " + sum);

            sum = 0;
        }


        for (i = 0; i <  array.length; ++i) {
            for (j = 0; j < array[i].length; ++j) {
                sum += array[i][j];
            }

            System.out.println("Sum of the column " + i + " = " + sum);

            sum = 0;
        }
    }



    }

