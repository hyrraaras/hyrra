package ders;

import java.util.Scanner;

public class AtmSimilation {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			double bakiye = 1000.00;   
			while (true) { //programın sürekli çalışmasını sağlar.
				System.out.println("1- Bakiye Görüntüle\n2- Para Yatır\n3- Para Çek\n4- Çıkış");
				System.out.print("Seçiminizi yapınız: ");
				int secim = scanner.nextInt();
				switch (secim) {
				case 1:
					System.out.println("Bakiyeniz: " + bakiye + " TL");
					break;

				case 2:
					System.out.print("Yatırılacak tutarı giriniz: ");
					int yatirilanTutar = scanner.nextInt();
					if (yatirilanTutar > 0) {
						bakiye += yatirilanTutar;
						System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
					} else {
						System.out.println("Geçersiz tutar!");
					}
					break;

				case 3:
					System.out.print("Çekilecek tutarı giriniz: ");
					int cekilenTutar = scanner.nextInt();
					if (cekilenTutar > 0 && cekilenTutar <= bakiye) {
						bakiye -= cekilenTutar;
						System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
					} else {
						System.out.println("Yetersiz bakiye veya geçersiz tutar!");
					}
					break;

				case 4:
					System.out.println("Çıkış yapılıyor...");
					return; //programın tamamen kapanmasını sağlar.

				default: //geçersiz seçim.
					System.out.println("Geçersiz seçim! Lütfen 1-4 arasında bir değer girin.");
				}
			}
		}

	}


