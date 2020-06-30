package homework_two;

public class SecondTask {
    public static void main(String[] args) {

        int []arr=new int []{1,12,0,7,3,23};    //задание 6
        System.out.println(checkBalance(arr));

        moveArray(arr, -2);
    }

    public static void invertArray() {              //задание 1
        int[] arr = {1, 0, 0, 1, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void fillArray() {        //задание 2
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray2() {       //задание 2 (вариант 2)
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
            System.out.print(arr[i - 1] + " ");
        }
        System.out.println(arr[7]);
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
    public static void changeArray() {   // задание 3
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        } System.out.println();
    }

    //      Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//      и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fillDiagonal() {        //задание 4
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }   System.out.print(arr[i][j] + " ");
            } System.out.println();
        }
    }


    //** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void minAndMax() {        //задание 5
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }System.out.println("|| max= "+ max + " min= "+ min);
    }

//** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.

    public static boolean checkBalance (int[]arr) {        //задание 6
        int summLeft = 0;
        int summRigth = 0;

        for (int i = 0; i < arr.length; i++) {
            summLeft = summLeft + arr[i];
            summRigth = 0;
            for (int nextI = i + 1; nextI < arr.length; nextI++) {
                summRigth = summRigth + arr[nextI];
            }
            if (summLeft == summRigth) {
                break;
            }
        }return (summLeft == summRigth);
    }

    //**** Написать метод, которому на вход подается одномерный массив и число n
    // (может быть положительным, или отрицательным), при этом метод должен сместить
    // все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) ->
    // [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.

    public static void moveArray (int[]arrToMove, int n) {        //задание 7
        int count = 0;
        if (n > 0) {
            while (count < n) {
                count++;
                int temp = arrToMove[0];
                arrToMove[0] = arrToMove[arrToMove.length - 1];
                for (int i = 1; i < arrToMove.length - 1; i++) {
                    arrToMove[arrToMove.length - i] = arrToMove[arrToMove.length - 1 - i];
                }
                arrToMove[1] = temp;
            }
            for (int i = 0; i < arrToMove.length; i++) {
                System.out.print(arrToMove[i] + " ");
            }
        } else {
            for (count = 0; count > n; count--) {
                int temp = arrToMove[arrToMove.length - 1];
                arrToMove[arrToMove.length - 1] = arrToMove[0];
                for (int i = 0; i < arrToMove.length - 1; i++) {
                    arrToMove[i] = arrToMove[i + 1];
                }
                arrToMove[arrToMove.length - 2] = temp;
            }
            for (int i = 0; i < arrToMove.length; i++) {
                System.out.print(arrToMove[i]+ " ");
            }
        }
    }
}
