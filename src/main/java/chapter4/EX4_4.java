package chapter4;

import java.util.Scanner;

public class EX4_4 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 9};
        System.out.println("1桁の数字を入力してください");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (var item : numbers) {
            if (input == item) {
                System.out.println("アタリ！");
            }
        }
    }
}
