# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa brand, model, type dan switchtype dan memberikan output berupa informasi identifikasi dari keyboard yang sudah ditambahkan
Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Keyboard`, `MechanicalKeyboard`, dan `KeyboardTest` adalah contoh dari class.

```bash
class Keyboard {
    ...
}

class MechanicalKeyboard extends Keyboard{
    ...
}

public class KeyboardTest {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `keyboards[count] = new MechanicalKeyboard(brand, model, switchType);` dan `keyboards[count] = new Keyboard(brand, model, type);` adalah contoh pembuatan object.

```bash
keyboards[count] = new MechanicalKeyboard(brand, model, switchType);

keyboards[count] = new Keyboard(brand, model, type);
 ```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `brand`, `model`, `type` dan `switchtype` adalah contoh atribut.

```bash
    String brand;
    String model;
    String type;
    String switchType;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
  public Keyboard(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        setType(type); 
}

public MechanicalKeyboard(String brand, String model, String switchType) {
        super(brand, model, "mechanical");
        this.switchType = switchType;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setBrand`, `setModel`, `setType` dan `setSwitchType` adalah contoh method mutator.

```bash
 public void setBrand(String brand) {
        this.brand = brand;
}

public void setModel(String model) {
        this.model = model;
}

 public void setType(String type) {
        if (!type.equalsIgnoreCase("mechanical")) {
            this.type = "membrane";
        } else {
            this.type = type;
}

public void setSwitchType(String switchType) {
        this.switchType = switchType;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getBrand`, `getModel`, `getType` dan `getSwitchType`  adalah contoh method accessor.

```bash
public String getBrand() {
        return brand;
}

 public String getModel() {
        return model;
}

public String getType() {
        return type;
}

public String getSwitchType() {
        return switchType;
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `brand`, `model`, `type` dan `switchtype` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String brand;
    private String model;
    private String type;
    private String switchType;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MechanicalKeyboard` mewarisi `Keyboard` dengan sintaks `extends`.

```bash
class MechanicalKeyboard extends Keyboard {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo()` di `Keyboard` merupakan  method `displayInfo` dan `displayInfo` di `MechanicalKeyboard` merupakan override dari method `displayInfo` di `MechanicalKeyboard`.

```bash
public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Type: " + getType());
}

@Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Switch Type: " + getSwitchType());
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` untuk membuat pilihan
```bash
 if (!type.equalsIgnoreCase("mechanical")) {
            this.type = "membrane";
        } else {
            this.type = type;
        }
...

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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` dan `for` untuk  menampilkan data.

```bash
while (true) {
...
}

for (int i = 0; i < count; i++) {
        keyboards[i].displayInfo();
        System.out.println();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
...
System.out.println("1. Tambah Keyboard");
System.out.println("2. Tampilkan Semua Keyboard");
System.out.println("3. Keluar");
System.out.print("Pilih opsi: ");
int option = Integer.parseInt(scanner.nextLine());

keyboards[i].displayInfo();
System.out.println();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Keyboard[] keyboards = new Keyboard[5];` adalah contoh penggunaan array.

```bash
Keyboard[] keyboards = new Keyboard[5];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (NumberFormatException e) {
      System.out.println("Input tidak valid, harap masukkan angka!");
}catch (Exception e) {
      System.out.println("Terjadi kesalahan: " + e.getMessage());
 }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Rijal Aditya
NPM: 2210010148
