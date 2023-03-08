import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap  a: ");
        a = input.nextInt();
        System.out.println("Nhap b: ");
        b = input.nextInt();
        a = Math.abs(a); //Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
                System.out.println("a = " + a);
            } else {
                b = b - a;
                System.out.println("b = " + b);
            }
        }
        System.out.println("Ước chung lớn nhất: " + a);
    }
}
