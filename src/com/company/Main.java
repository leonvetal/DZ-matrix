package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("размер матрицы?");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] a = new int[n][n];
        //1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                //1
//                a[i][j] = (n * i + j)  ;         ///?убрать 0
//            }
//        }
//        System.out.println("матрица размер  " + n + " на " + n);
//2

                a[i][j] = (int) (Math.random() * (2 * n + 1)) - n;
            }
        }
        System.out.println("матрица размер  " + n + " на " + n + ",  рандом от " + " -" + n + " до " + n);

        System.out.println("---------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
//строки
        System.out.println("-------------- сорт построчно");
        for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i][j] > a[i][k]) {
                        int tmp = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = tmp;
                    }
                }
            }
        }
        for (int r = 0; r < n; r++) {
            for (int m = 0; m < n; m++) {
                System.out.printf("%4d", a[r][m]);
            }
            System.out.println();
        }
        //строки
        System.out.println("-------------- сорт постолб");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = i + 1; k < n; k++) {
                    if (a[i][j] > a[k][j]) {
                        int tmp = a[i][j];
                        a[i][j] = a[k][j];
                        a[k][j] = tmp;
                    }
                }
            }
        }
        for (int r = 0; r < n; r++) {
            for (int m = 0; m < n; m++) {
                System.out.printf("%4d", a[r][m]);
            }
            System.out.println();
        }
    }
}
