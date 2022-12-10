package HT.HT1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ht1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        // // 1.Вычислить n-ое треугольного число(сумма чисел от 1 до n)

        // System.out.print("Insert number: ");
        // int number1 = iScanner.nextInt();
        // sumOneToN(number1);

        // // // n! (произведение чисел от 1 до n)

        // double fact = factor(number1);
        // System.out.println(number1 + "! = " + fact);
        // __________________________________________________________________________
        // // 2.Написать метод, принимающий на вход два целых числа и проверяющий, что
        // их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
        // в противном случае – false.

        // System.out.print("Insert number1: ");
        // int number1 = iScanner.nextInt();
        // System.out.print("Insert number2: ");
        // int number2 = iScanner.nextInt();
        // System.out.println(task2(number1, number2));
        // __________________________________________________________________________
        // // 3.Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль, положительное ли число передали или
        // отрицательное. Замечание: ноль считаем положительным числом.

        // int number1 = inpReader();
        // task3(number1);
        // __________________________________________________________________________
        // // 4.Написать метод, которому в качестве параметра передается целое число.
        // Метод должен вернуть true, если число отрицательное, и вернуть false если
        // положительное.

        // System.out.print("Insert number: ");
        // int number1 = iScanner.nextInt();
        // System.out.println(task4(number1));
        // __________________________________________________________________________
        // // 5.Написать метод, которому в качестве аргументов передается строка и
        // число, метод должен отпечатать в консоль указанную строку, указанное
        // количество раз;
        // я не очень понял задание, поэтому сделал два варианта (см. метод task5)

        // System.out.print("Insert string: ");
        // String inp = iScanner.nextLine();
        // System.out.print("Insert number: ");
        // int number1 = iScanner.nextInt();
        // task5(inp, number1);
        // __________________________________________________________________________
        // // 6.Написать метод, который определяет, является ли год високосным,
        // и возвращает boolean (високосный - true, не високосный - false).
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый
        // 400-й – високосный.

        // System.out.print("Insert year: ");
        // int year = iScanner.nextInt();
        // System.out.println(task6(year));
        // // __________________________________________________________________________
        // // 7.Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0

        // int[] array = { 1, 0, 1, 0, 1, 0, 1, 0, 1 };
        // task7(array);
        // // __________________________________________________________________________
        // // 8.Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100

        // System.out.print("Insert number: ");
        // int number1 = iScanner.nextInt();
        // task8(number1);
        // // __________________________________________________________________________

        // // 9.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2

        // int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        // task9(array);
        // // __________________________________________________________________________
        // // 10.Создать квадратный двумерный целочисленный массив (количество строк и
        // столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно
        // только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

        System.out.print("Insert array's length: ");
        int number1 = iScanner.nextInt();
        task10(number1);

        // // __________________________________________________________________________
        // // 11.Написать метод, принимающий на вход два аргумента: len и initialValue,
        // возвращающий одномерный массив типа int длиной len, каждая ячейка которого
        // равна initialValue;

        // System.out.print("Insert array's length: ");
        // int arrLen = iScanner.nextInt();
        // System.out.print("Insert initial value: ");
        // int initialValue = iScanner.nextInt();
        // task11(arrLen, initialValue);
        // // __________________________________________________________________________
        // // 12.Задать одномерный массив и найти в нем минимальный и максимальный
        // элементы

        // System.out.print("Insert array's length: ");
        // int arrLen = iScanner.nextInt();
        // task12(arrLen);

        iScanner.close();
    }

    public static void sumOneToN(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println("sum 1 to " + n + " = " + sum);
    }

    public static double factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }

    public static boolean task2(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void task3(int n) {
        if (n >= 0) {
            System.out.println(n + " is positive");
        } else {
            System.out.println(n + " is negative");
        }

    }

    public static boolean task4(int n) {
        if (n >= 0) {
            return false;
        } else {
            return true;
        }

    }

    public static void task5(String str, int n) {
        // String ans = new String(new char[n]).replace("\0", str);
        // System.out.println(ans); // вариат 1, конкатенация строк
        for (int i = 0; i < n; i++) {
            System.out.println(str); // вариат 2, цикл.
        }

    }

    public static boolean task6(int n) {
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void task7(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task8(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task9(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task10(int l) {
        int[] arr[] = new int[l][l];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                arr[i][i] = l;
                arr[l - 1 - i][i] = l;
            }
        }
        // System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task11(int len, int initVal) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initVal;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task12(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(arr));
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(min);
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}
