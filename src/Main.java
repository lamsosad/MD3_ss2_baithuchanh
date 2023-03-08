import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner checkNumber = new Scanner(System.in);
        System.out.println("Nhap so bat ki can kiem tra");
        int number = checkNumber.nextInt();
        if (number < 2) {
            System.out.println(number + " ko phai so nguyen to nhe!");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " la so nguyen to nhe!");
            } else {
                System.out.println(number + " ko phai so nguyen to nhe!");
            }
        }
    }
}