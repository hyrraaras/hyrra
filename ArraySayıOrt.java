package tut;

import java.util.Scanner;

public class ArraySayıOrt {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Kaç adet sayı gireceksiniz? ");
		int n=input.nextInt();
		
		int[] sayilar  =  new int [n];
		int toplam = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println((i+1) + ". sayıyı girin: ");
			sayilar[i]=input.nextInt();
			toplam += sayilar[i];
		}
		double ortalama = (double) toplam / n;
		System.out.println("Ortalama: " + ortalama);
	}
}
