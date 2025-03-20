import java.util.Scanner;

public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        System.out.println("\nData mahasiswa sebelum sorting : ");
        list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        // list.selectionSort();
        // list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC): ");
        list.insertionSort();
        list.tampil();
    }
}