package nHotes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Note {
	String başlık;
	String içerik;
	String timestamp;

	public Note(String başlık, String içerik) {
		this.başlık = başlık;
		this.içerik = içerik;
		// Tarih/saat bilgisini metne çevirir.
		this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}

	public String toString() {
		return "Başlık: " + başlık + "\nİçerik: " + içerik + "\nTarih" + timestamp;

	}

}

public class NotDefteriUyg2 {
	static ArrayList<Note> notes = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		if (!girisYap()) {
			System.out.println("Şifre yanlış! Giriş yapılamadı.");
	return;
		}
	
	 
		
		while (true) {
			System.out.println("\n1- Yeni Not Ekle");
			System.out.println("2- Notları Listele");
			System.out.println("3- Not Sil");
			System.out.println("4- Çıkış");
			System.out.println("5- Not Düzenle");
			System.out.println("6- Uygulama Hakkında");
			System.out.println("Bir seçenek seçiniz: ");

			int seçim = scanner.nextInt();
			scanner.nextLine();

			switch (seçim) {
			case 1:
				addNote();
				break;
			case 2:
				listNotes();
				break;
			case 3:
				deleteNote();
				break;
			case 4:
				System.out.println("Uygulamadan çıkılıyor... Görüşmek üzere!");
				return;
			case 5:
				editNote();
				break;
			case 6:
				uygulamaHakkinda();
				break;
			default:
				System.out.println("Geçersiz seçim!");
				break;
			}

		} 
		}
	
	public static boolean girisYap() {
	String dogruSifre="1234";
	System.out.println("Şifre girin: ");
	String girilenSifre= scanner.nextLine();
	return girilenSifre.equals(dogruSifre);
	}

	public static void addNote() { // not ekleme
		System.out.print("Not başlığı: ");
		String başlık = scanner.nextLine();
		System.out.print("Not içeriği: ");
		String içerik = scanner.nextLine();

		notes.add(new Note(başlık, içerik));
		System.out.println("Not başarıyla eklendi!");
	}

	public static void listNotes() { // notları listeleme
		if (notes.isEmpty()) {
			System.out.println("Henüz bir not eklenmedi.");
		} else {
			System.out.println("\nNotlarınız:");
			for (int i = 0; i < notes.size(); i++) {
				System.out.println("\n" + (i + 1) + ")\n" + notes.get(i));
			}
		}
	}

	public static void deleteNote() { // not silme
		listNotes();
		if (!notes.isEmpty()) {
			System.out.print("\nSilmek istediğiniz notun numarasını girin: ");
			int seçim = scanner.nextInt() - 1;
			scanner.nextLine();

			if (seçim >= 0 && seçim < notes.size()) {
				notes.remove(seçim); // seçilen notu silmek için kullanılan metod.
				System.out.println("Not başarıyla silindi!");
			} else {
				System.out.println("Geçersiz numara!");
			}
		}
	}

	public static void editNote() { // not düzenleme
			listNotes();
			if (!notes.isEmpty()) {
				System.out.print("\nDüzenlemek istediğiniz notun numarasını girin: ");
				int seçim = scanner.nextInt() - 1;
				scanner.nextLine();

				if (seçim >= 0 && seçim < notes.size()) {
					System.out.print("Yeni başlık: ");
					String newBaslik = scanner.nextLine();
					System.out.print("Yeni içerik: ");
					String newIcerik = scanner.nextLine();

					notes.get(seçim).başlık = newBaslik;
					notes.get(seçim).içerik = newIcerik;
					notes.get(seçim).timestamp = LocalDateTime.now()
							.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

					System.out.println("Not başarıyla güncellendi!");
				} else {
					System.out.println("Geçersiz numara!");
				}
			}}
				public static void  uygulamaHakkinda() {
					System.out.println("\n***Uygulama Hakkında***");
					System.out.println("Uygulama Adı: Not Defteri Uygulaması");
				    System.out.println("Geliştirici ID: 241903003");
				    System.out.println("Açıklama: Bu uygulama notlarınızı kolayca oluşturma, silme ve kaydetme sağlar.");
				    System.out.println("***************************");
				}
			
				{
}}

