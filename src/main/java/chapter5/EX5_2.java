package chapter5;

public class EX5_2 {
    public static void main(String[] args) {
        email("テスト", "test@gmail.com", "練習");
    }

    public static void email(String title, String address, String text) {
        System.out.printf("%sに、以下のメールを送信しました\n", address);
        System.out.printf("件名:%s\n", title);
        System.out.printf("本文:%s\n", text);
    }
}
