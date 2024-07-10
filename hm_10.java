import java.util.Scanner;
public class hm_10{
    public static void main(String[] args) {
        // 創建Scanner對象以從控制台獲取輸入
        Scanner scn = new Scanner(System.in);
        
        // 提示使用者輸入華氏溫度
        System.out.print("請輸入華氏溫度: ");
        while (!scn.hasNextDouble()) {
            System.out.println("請輸入一個有效的數字。");
            scn.next(); // 清除錯誤輸入
            System.out.print("請輸入華氏溫度: ");
        }
        double fahrenheit = scn.nextDouble();
        
        // 將華氏溫度轉換為攝氏溫度
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        // 輸出攝氏溫度
        System.out.println("攝氏溫度是: " + celsius);
        
        // 關閉掃描器
        scn.close();
    }
}