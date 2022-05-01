package com.justEatAway;

public class Dummy {

	int resultValue = 23;

	public static void main(String[] args) {

		Dummy d = new Dummy();
		int userInput = 56;

		if (userInput % 1 == 0) {
			if (d.player1(userInput) == 1) {
				System.out.println("Player 1 is won");
			}

		} else {
			System.out.println("Enter the Correct whole number");
		}

	}

	public int player1(int i) {

		boolean test;
		int cnt;
		int num = 0;

		if (i == 1) {
			return 1;
		}

		if ((i + 1) % 3 == 0) {
			num = (i + 1) / 3;
		} else if ((i + 0) % 3 == 0) {
			num = (i + 0) / 3;
		} else if ((i - 1) % 3 == 0) {
			num = (i - 1) / 3;
		}

		if (num == 1) {

			test = true;

			return 1;
		} else {
			test = false;

			cnt = player2(num);
			if (cnt == 1) {
				System.out.println("Pleyer 2 is won");
			}

		}

		int msg;
		if (test) {
			msg = 1;
		} else {
			msg = 0;
		}

		return msg;

	}

	public int player2(int i) {
		boolean test;

		int num1 = 0;
		int cnt;

		if (i == 1) {
			return 1;
		}

		if ((i + 1) % 3 == 0) {
			num1 = (i + 1) / 3;
		} else if ((i + 0) % 3 == 0) {
			num1 = (i + 0) / 3;
		} else if ((i - 1) % 3 == 0) {
			num1 = (i - 1) / 3;
		}

		if (num1 == 1) {

			test = true;
			return 1;
		} else {
			test = false;

			cnt = player1(num1);
			if (cnt == 1) {
				System.out.println("Pleyer 1 is won");
			}
		}

		int msg;
		if (test) {
			msg = 1;
		} else {
			msg = 0;
		}
		return msg;

	}
}
