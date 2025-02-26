package gptwork;
import java.util.Arrays;
import java.util.Scanner;
public class İsimSıralama {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Kaç isim gireceksiniz? ");
int adet=scanner.nextInt();
scanner.nextLine();
 String[] isimler=new String[adet];
 for (int i=0; i<adet; i++) {
	 System.out.println((i+1) + ". ismi giriniz.");
	 isimler[i]=scanner.nextLine();
 }
 Arrays.sort(isimler); //string dizilerinde a-z ye sıralama yapar
 System.out.println("İsim sıralaması: " + Arrays.toString(isimler));

	}
}
