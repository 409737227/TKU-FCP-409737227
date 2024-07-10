import java.util.Scanner;

public class hm_11 {
    public static void main(String[] args) {
        // 創建Scanner對象以從控制台獲取輸入
        Scanner scn = new Scanner(System.in);
        
        double total = 0;
        
        // 提示使用者輸入三件商品的價格
        for (int i = 1; i <= 3; i++) {
            System.out.print("請輸入第" + i + "件商品的價格: ");
            while (!scn.hasNextDouble()) {
                System.out.println("請輸入一個有效的數字。");
                scn.next(); // 清除錯誤輸入
                System.out.print("請輸入第" + i + "件商品的價格: ");
            }
            double price = scn.nextDouble();
            total += price;
        }
        
        // 輸出總價
        System.out.println("三件商品的總價是: " + total);
        
        // 關閉掃描器
        scn.close();
    }
}
