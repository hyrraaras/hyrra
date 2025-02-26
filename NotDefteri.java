package gptwork;

import java.util.ArrayList;
import java.util.Scanner;

public class NotDefteri {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> notes = new ArrayList<>();
		while (true) {
			System.out.println("1-Not ekle\n2-Notları görüntüle\n3-Çıkış");
			int choise = scanner.nextInt();
			scanner.nextLine(); // boş satırları yakalamak için.
			if (choise == 1) {
				System.out.println("Not: ");
				notes.add(scanner.nextLine());
			} else if (choise == 2) {
				System.out.printf("Notlarınız: ");
				for (String note : notes)
					System.out.println("- " + notes);
			} else if (choise == 3) {
				break;
			} else {
				System.out.println("Geçersiz seçim!!");
			}

		}
		scanner.close();
	}

}
