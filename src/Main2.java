import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so tien gui: ");
        double money = input.nextDouble();
        System.out.println("Nhap so thang gui: ");
        int month = input.nextInt();
        System.out.println("Nhap so lai suat ngan hang: ");
        double rate = input.nextDouble();
        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (rate / 100) / 12 * month;
        }
        System.out.println("tong so tien lai la: " + total +" Dong");
    }
}
