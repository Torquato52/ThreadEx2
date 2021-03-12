package view;

import controller.Thread1;
import controller.Thread2;
import controller.Thread3;
import controller.Thread4;
import controller.Thread5;

public class Main {

	public static void main(String[] args) {

		Thread1 um = new Thread1();
		um.start();

		Thread2 dois = new Thread2();
		dois.start();

		Thread3 tres = new Thread3();
		tres.start();

		Thread4 quatro = new Thread4();
		quatro.start();

		Thread5 cinco = new Thread5();
		cinco.start();

	}
}