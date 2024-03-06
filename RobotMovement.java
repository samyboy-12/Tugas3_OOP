import java.util.*;

public class RobotMovement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan lebar area: ");
        int width = scanner.nextInt();
        System.out.print("Masukkan tinggi area: ");
        int height = scanner.nextInt();

        System.out.print("Masukkan koordinat start (start_x start_y): ");
        int start_x = scanner.nextInt();
        int start_y = scanner.nextInt();

        System.out.print("Masukkan koordinat finish (finish_x finish_y): ");
        int finish_x = scanner.nextInt();
        int finish_y = scanner.nextInt();

        char[][] area = new char[height][width];

        // Inisialisasi area dengan karakter '.'
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                area[i][j] = '.';
            }
        }

        // Titik start ditandai dengan 'S'
        area[start_y][start_x] = 'S';

        // Titik finish ditandai dengan 'F'
        area[finish_y][finish_x] = 'F';

        // Menampilkan area awal
        System.out.println("Area Pergerakan Robot:");
        printArea(area);

        // Mulai pergerakan robot
        System.out.println("Robot bergerak...");
        jalan(start_x, start_y, finish_x, finish_y);
    }

    // Fungsi untuk menampilkan area
    public static void printArea(char[][] area) {
        for (char[] row : area) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    // Fungsi untuk pergerakan robot
    public static void jalan(int start_x, int start_y, int finish_x, int finish_y) {
        int x = start_x;
        int y = start_y;

        // Pergerakan horizontal
        while (x != finish_x) {
            System.out.println("Posisi robot sekarang ada di (" + x + ", " + y + ")");
            if (x < finish_x) {
                x++;
            } else {
                x--;
            }
        }
        // Pergerakan vertikal
        while (y != finish_y) {
            System.out.println("Posisi robot sekarang ada di (" + x + ", " + y + ")");
            if (y < finish_y) {
                y++;
            } else {
                y--;
            }
        }
        // Robot mencapai finish
        System.out.println("Posisi robot sekarang ada di (" + x + ", " + y + ")");
        System.out.println("Robot telah mencapai titik finish!");
    }
}
