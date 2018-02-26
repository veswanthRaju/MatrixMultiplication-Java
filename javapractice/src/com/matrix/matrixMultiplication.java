package com.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class matrixMultiplication {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no of rows for matrix one");

		int row1 = Integer.parseInt(br.readLine());

		System.out.println("Enter no of columns for matrix one");

		int column1 = Integer.parseInt(br.readLine());
		int[][] matrix1 = new int[row1][column1];

		int count = 1;
		for (int i = 0; i < row1; i++) {
			System.out.println("Enter " + count + " Row!");
			count++;
			for (int j = 0; j < column1; j++) {

				matrix1[i][j] = Integer.parseInt(br.readLine());

			}
		}

		System.out.println("Matrix One is : \n");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < column1; j++) {
				System.out.print(matrix1[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("\nFirst Matrix transport is : \n");

		for (int i = 0; i < column1; i++) {
			for (int j = 0; j < row1; j++) {
				System.out.print(matrix1[j][i] + " ");
			}
			System.out.println();
		}

		System.out.println("Enter no of rows for matrix two");

		int row2 = Integer.parseInt(br.readLine());

		System.out.println("Enter no of columns for matrix two");

		int column2 = Integer.parseInt(br.readLine());
		int[][] matrix2 = new int[row2][column2];

		int[][] multipliedMatrix = new int[row1][column2];

		int c = 1;
		for (int i = 0; i < row2; i++) {
			System.out.println("Enter " + c + " Row!");
			c++;
			for (int j = 0; j < column2; j++) {

				matrix2[i][j] = Integer.parseInt(br.readLine());

			}
		}

		System.out.println("Matrix Two is : \n");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < column2; j++) {
				System.out.print(matrix2[i][j] + " ");

			}
			System.out.println();
		}

		if (column1 != row2) {
			System.out.println("Multiplication is not possible!!");
			System.out.println("Reason : Number of columns in 1st matrix should equal to number of rows in 2nd matrix");
		} else {
			System.out.println("Matrix multiplication is : \n");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column2; j++) {
					for (int k = 0; k < column1; k++) {
						multipliedMatrix[i][j] = multipliedMatrix[i][j] + matrix1[i][k] * matrix2[k][j];
					}
				}
			}

			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column2; j++) {
					System.out.print(multipliedMatrix[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}