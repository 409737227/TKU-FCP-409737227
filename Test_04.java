public class Test_04 {
    public static void main(String[] args) {
        // 宣告三個雙精度浮點數變數：principal（本金）、rate（年利率）和time（年數）
        double principal = 1000.0;
        double rate = 0.05;
        double time = 2.0;

        // 使用公式：利息 = 本金 * 年利率 * 年數
        float num = (float)(principal * rate * time);

        // 使用System.out.printf()方法格式化輸出結果
        System.out.printf("本金: %.2f%n", principal);
        System.out.printf("年利率: %.2f%%%n", rate * 100); // 顯示百分比
        System.out.printf("年數: %.2f%n", time);
        System.out.printf("利息: %.2f%n", num);
    }
}
