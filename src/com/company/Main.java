package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("размер матрицы?");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n * i + j;         ///?убрать 0
            }
        }
        System.out.println("матрица размер  " + n + " на " + n);
        System.out.println("---------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

    }
}
