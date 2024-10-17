package chapter2;

import java.util.*;

public class EX2_3 {
    public static void main(String[] args) {
        System.out.println("ようこそ占いの館へ");

        System.out.print("あなたの名前を入力してください>");
        String name = new Scanner(System.in).nextLine();

        System.out.print("あなたの年齢を入力してください>");
        String ageString = new Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);

        int fortune = new Random().nextInt(3);
        ++fortune;

        System.out.println("占いの結果がでました！");
        String ans = "%d歳の%sさん、あなたの運気番号は%dです。".formatted(age, name, fortune);
        System.out.println(ans);
        System.out.println(" 1:大吉 2:中吉 3:吉 4:凶");
    }
}
