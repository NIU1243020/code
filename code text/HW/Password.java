import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ErrorTimes = 0;
        int AttemptsTimes = 3;
        String Password = "123";

        while (ErrorTimes < AttemptsTimes) {
            System.out.println("請輸入密碼: ");
            String Input = scanner.nextLine();

            if (Input.equals(Password)) {
                System.out.println("歡迎光臨本系統");
                break; // 結束該whlie迴圈
            } else {
                System.out.println("密碼輸入錯誤");
                ErrorTimes = ErrorTimes + 1;
                if (ErrorTimes == AttemptsTimes) {
                    System.out.println("暫停使用本系統");
                }
            }
        }
        
        scanner.close();
    }
}
