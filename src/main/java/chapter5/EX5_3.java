package chapter5;

public class EX5_3 {
    public static void main(String[] args) {
        email("test@gmail.com", "test");
    }

    public static void email(String address, String text) {
        System.out.printf("%sに、以下のメールを送信しました\n", address);
        System.out.println("件名: 無題");
        System.out.printf("本文: %s\n", text);
    }
}
