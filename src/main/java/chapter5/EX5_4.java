package chapter5;

public class EX5_4 {
    public static void main(String[] args) {
        double tArea = calcTriangleArea(10.0, 5.0);
        double rArea = calcCircleArea(5.0);
        System.out.println(tArea);
        System.out.println(rArea);
    }

    public static double calcTriangleArea(double bottom, double height) {
        double triangleArea = (bottom * height) / 2.0;
        return triangleArea;
    }

    public static double calcCircleArea(double radius) {
        double rArea = radius * radius * Math.PI;
        return rArea;
    }
}
