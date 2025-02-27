package gptwork;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleNoteApp {

    static ArrayList<String> notes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1- Yeni Not Ekle");
            System.out.println("2- Notları Listele");
            System.out.println("3- Not Sil");
            System.out.println("4- Çıkış");
            System.out.print("Bir seçenek seçiniz: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Dummy

            switch (choice) {
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
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }

    public static void addNote() {
        System.out.print("Yeni notunuzu girin: ");
        String note = scanner.nextLine();
        notes.add(note);
        System.out.println("Not başarıyla eklendi!");
    }

    public static void listNotes() {
        if (notes.isEmpty()) {
            System.out.println("Henüz bir not eklenmedi.");
        } else {
            System.out.println("\nNotlarınız:");
            for (int i = 0; i < notes.size(); i++) {
                System.out.println((i + 1) + "- " + notes.get(i));
            }
        }
    }

    public static void deleteNote() {
        listNotes();
        if (!notes.isEmpty()) {
            System.out.print("Silmek istediğiniz notun numarasını girin: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine();

            if (index >= 0 && index < notes.size()) {
                notes.remove(index);
                System.out.println("Not başarıyla silindi!");
            } else {
                System.out.println("Geçersiz numara!");
            }
        }
    }
}


	


