import java.util.Scanner;

public class ThayTheKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập chuỗi văn bản từ bàn phím
        System.out.print("Nhập chuỗi văn bản: ");
        String input = scanner.nextLine();

        // 2. Sử dụng replaceAll với Regular Expression (Regex) để thay thế tất cả ký tự số bằng '*'
        // Ký hiệu '\\d' trong regex đại diện cho các chữ số từ 0 đến 9
        String result = input.replaceAll("\\d", "*");

        // 3. Hiển thị kết quả sau khi thay thế
        System.out.println("Kết quả: " + result);

        scanner.close();
    }
}