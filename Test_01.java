public class Test_01 {
    public static void main(String[] args) {
        // 宣告整數變數radius，並賦值為5
        int radius = 5;

        // 使用常數PI (可以使用Math.PI)
        double pi = Math.PI;

        // 計算圓的面積和周長
        double area = pi * Math.pow(radius, 2);
        double circumference = 2 * pi * radius;

        // 使用System.out.printf()方法格式化輸出結果，保留兩位小數
        System.out.printf("圓面積: %.2f%n", area);
        System.out.printf("圓周長: %.2f%n", circumference);
    }
}
