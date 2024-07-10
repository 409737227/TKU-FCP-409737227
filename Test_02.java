public class Test_02 {
    public static void main(String[] args) {
        // 宣告雙精度浮點數變數celsius，並賦值為25.0
        double celsius = 25.0;

        // 使用公式 F = (C * 9/5) + 32 來計算華氏溫度
        float num = 9.0f / 5.0f;
        float sum = (float)celsius * num + 32;

        // 將結果輸出，並使用System.out.println()方法
        System.out.println("攝氏溫度 " + celsius + " 度對應的華氏溫度是 " + sum + " 度");
    }
}
