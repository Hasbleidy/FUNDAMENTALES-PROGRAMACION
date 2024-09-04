package Menor;

import java.util.Scanner;
public class MenorCinco {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[5];
		
		 for (int i = 0; i < 5; i++) {
	            System.out.print("Write Number " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
		}
		
		int menor = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (numbers[i] < menor) {
                menor = numbers[i];
		}
		
            System.out.println("The number menor is: " + menor);
		
		scanner.close();
        }
	}
}
