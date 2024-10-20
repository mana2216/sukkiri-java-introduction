package chapter5;

public class EX5_1 {
    public static void main(String[] args) {
        introduceOneself();
    }

    public static void introduceOneself() {
        String name = "taro";
        int age = 22;
        double height = 100.0;
        char zodiac = '辰';

        System.out.printf("私の名前は%sです。歳は%d歳です。身長は%fcmです。十二支は%sです。", name, age, height, zodiac);
    }
}

