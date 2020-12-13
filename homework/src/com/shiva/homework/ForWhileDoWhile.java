package com.shiva.homework;

public class ForWhileDoWhile {
	public static void main(String[] args) {
		int MAX = 5;

		for (int i = 0; i < MAX; i++)

		{

			System.out.format("For Loop : %d\n", i);

		}
		int j = 0;

		while (j < MAX)

		{

			System.out.format("While Loop : %d\n", j);

			j++;

		}
		int k = 0;

		do

		{

			System.out.format("Do While Loop : %d\n", k);

			k++;

		} while (k < MAX);

	}
}