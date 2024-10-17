package chapter3;

public class EX3_3 {
    public static void main(String[] args) {
        int isHungry = 0;
        String food = "グラタン";

        System.out.println("こんにちは");

        if (isHungry == 1) {
            System.out.println("はらぺこです");
            String tmpStr = "%sをいただきます".formatted(food);
            System.out.println(tmpStr);
        } else {
            System.out.println("お腹がいっぱいです");
        }

        System.out.println("ごちそうさまでした");
    }
}
