package chapter3;

import java.util.*;

public class EX3_5 {
    public static void main(String[] args) {
        System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");

        Scanner sc = new Scanner(System.in);
        int selected = sc.nextInt();

        switch (selected) {
            case 1 -> System.out.println("検索します");
            case 2 -> System.out.println("登録します");
            case 3 -> System.out.println("削除します");
            case 4 -> System.out.println("変更します");
        }
    }
}
