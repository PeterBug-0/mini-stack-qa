package accessModifiers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LowLevel {
    public static void printRow(int n, int cols){
        for (int i = 1;i <= cols;i++){
            System.out.printf("%4d", n * i);
        }
        System.out.println();
    }
    public static void printTable(int rows){
        for (int i = 1;i <= rows;i++){
            printRow(i, rows);
        }
    }
    public static void oddSum(int n) {
        int value = 0;
        for (int i = 0;i <= n;i++) {
            if (!(i % 2 == 0)) {
                value += i;
            }
        }
        System.out.println("Sum of Odd numbers from 1 to " + n + "  is: " + value);
    }
    public static void main(String[] args) {
        printTable(4);
        oddSum(10);
      }
}
