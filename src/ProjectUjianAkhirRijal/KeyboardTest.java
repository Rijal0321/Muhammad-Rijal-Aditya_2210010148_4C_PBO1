package ProjectUjianAkhirRijal;

import java.util.Scanner;

public class KeyboardTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Keyboard[] keyboards = new Keyboard[5];
        int count = 0;

        while (true) {
            try {
                System.out.println("1. Tambah Keyboard");
                System.out.println("2. Tampilkan Semua Keyboard");
                System.out.println("3. Keluar");
                System.out.print("Pilih opsi: ");
                int option = Integer.parseInt(scanner.nextLine());

                if (option == 1) {
                    if (count >= keyboards.length) {
                        System.out.println("Kapasitas array penuh!");
                        continue;
                    }

                    System.out.print("Masukkan brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Masukkan model: ");
                    String model = scanner.nextLine();
                    System.out.print("Masukkan jenis (mechanical/membrane): ");
                    String type = scanner.nextLine();

                    if (type.equalsIgnoreCase("mechanical")) {
                        System.out.print("Masukkan jenis switch: ");
                        String switchType = scanner.nextLine();
                        keyboards[count] = new MechanicalKeyboard(brand, model, switchType);
                    } else {
                        keyboards[count] = new Keyboard(brand, model, type);
                    }

                    count++;
                } else if (option == 2) {
                    for (int i = 0; i < count; i++) {
                        keyboards[i].displayInfo();
                        System.out.println();
                    }
                } else if (option == 3) {
                    break;
                } else {
                    System.out.println("Opsi tidak valid!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, harap masukkan angka!");
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }

        scanner.close();
    }
}