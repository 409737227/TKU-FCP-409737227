public class Test_05 {
    public static void main(String[] args) {
        // 宣告兩個雙精度浮點數變數weight（體重，單位kg）和height（身高，單位m）
        double weight = 70.0;
        double height = 1.75;

        // 使用公式：BMI = 體重 / (身高 * 身高)
        float bmi = (float) (weight / (height * height));

        // 使用System.out.printf()方法格式化輸出結果，保留一位小數
        System.out.printf("體重: %.1f kg%n", weight);
        System.out.printf("身高: %.2f m%n", height);
        System.out.printf("BMI: %.1f%n", bmi);
    }
}
