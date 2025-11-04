import java.util.Scanner;

public class Soal_Latihan_UKL2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        if (input.hasNextInt()) {
            int n = input.nextInt();
            if (n % 2 == 0) {
                System.out.println("Bilangan " + n + " adalah genap");
            } else {
                System.out.println("Bilangan " + n + " adalah ganjil");
            }
        } 
    }
}
