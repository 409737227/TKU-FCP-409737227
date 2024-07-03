public class hm_05 {
    public static void main(String[] args) {
        // 宣告並初始化兩個整數變數a 和b，值分別為12和7
        int a = 12;
        int b = 7;
        
        // 計算和、差、積、商和餘數
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;  // 整數相除會取整數部分
        int remainder = a % b; // 取餘數
        
        // 格式化輸出結果
        System.out.printf("和：%d%n", sum);
        System.out.printf("差：%d%n", difference);
        System.out.printf("積：%d%n", product);
        System.out.printf("商：%d%n", quotient);
        System.out.printf("餘數：%d%n", remainder);
    }
}
