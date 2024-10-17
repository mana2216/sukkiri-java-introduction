package chapter3;

import java.util.*;

public class EX3_6 {
    public static void main(String[] args) {
        System.out.println("[数当てゲーム");

        int ans = new Random().nextInt(10);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("0~9の数字を入力してください");
            int num = sc.nextInt();
            if (num == ans) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("違います");
            }
        }

        System.out.println("ゲームを終了します");
    }
}
