import java.util.Random;
import java.util.Scanner;
public class TugasAPBsegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pencari Jenis Segitiga");
        System.out.println("Masukkan Sisi panjang Segitiga: ");
        long angka1 = input.nextLong();
        System.out.println("Masukkan sisi lainnya: ");
        long angka2 = input.nextLong();
        System.out.println("Masukkan sisi akhir: ");
        long angka3 = input.nextLong();
        double angkaTerbesar,totalSisiLain,pangkatSisi;

        if(angka1 >= angka2 && angka1 >= angka3){
            angkaTerbesar = angka1;
            totalSisiLain = angka2+angka3;
            pangkatSisi = Math.pow(angka2, 2) + Math.pow(angka3, 2);
        } else if(angka2 >= angka1 && angka2 >= angka3){
            angkaTerbesar = angka2;
            totalSisiLain = angka1+angka3;
            pangkatSisi = Math.pow(angka1, 2) + Math.pow(angka3, 2);
        } else {
            angkaTerbesar = angka3;
            totalSisiLain = angka1+angka2;
            pangkatSisi = Math.pow(angka1, 2) + Math.pow(angka2, 2);
        }

        if (angka1<=angka2+angka3) {

            if (angka1 == angka2 && angka1 == angka3) {
                System.out.println("Segitiga Sama Sisi");
            } else if (angka1 == angka2 || angka2 == angka3 || angka3 == angka1)  {
                System.out.println("Segitiga Sama Kaki");

            }
            else if(Math.pow(angkaTerbesar, 2) == pangkatSisi ) {
                System.out.println("segitiga siku-siku");
            }
            else {
                System.out.println("Segitiga Sembarang");
            }
        }

        else {
            System.out.println("Bukan Segitiga");
        }
    }
}
