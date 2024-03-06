import java.util.Scanner;

public class CekArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta ukuran array dari pengguna
        System.out.print("Masukkan ukuran array: ");
        int size = scanner.nextInt();

        // Membuat array dengan ukuran yang dimasukkan pengguna
        int[] numbers = new int[size];

        // Meminta pengguna untuk memasukkan angka ke dalam array
        System.out.println("Masukkan angka-angka ke dalam array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Menampilkan semua elemen dalam array
        System.out.print("Elemen dalam array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Menemukan angka terbesar dalam array
        int max = numbers[0]; // Anggap elemen pertama sebagai angka terbesar sementara
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Menampilkan angka terbesar
        System.out.println("Angka terbesar dalam array: " + max);

        scanner.close();
    }
}
