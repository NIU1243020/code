import java.util.Scanner;

public class Zodiac2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("輸入出生月份: ");
        int month = scanner.nextInt();
        System.out.print("輸入出生日期: ");
        int day = scanner.nextInt();

        String Zodiac = determineZodiac(month, day);

        System.out.println("你的中文星座是：" + Zodiac);

        scanner.close();
    }

    private static String determineZodiac(int month, int day) {
        switch (month) {
            case 1:
                return (day >= 21) ? "水瓶座" : "摩羯座";
            case 2:
                return (day >= 19) ? "雙魚座" : "水瓶座";
            case 3:
                return (day >= 21) ? "白羊座" : "雙魚座";
            case 4:
                return (day >= 21) ? "金牛座" : "白羊座";
            case 5:
                return (day >= 21) ? "雙子座" : "金牛座";
            case 6:
                return (day >= 22) ? "巨蟹座" : "雙子座";
            case 7:
                return (day >= 23) ? "獅子座" : "巨蟹座";
            case 8:
                return (day >= 23) ? "處女座" : "獅子座";
            case 9:
                return (day >= 23) ? "天秤座" : "處女座";
            case 10:
                return (day >= 24) ? "天蠍座" : "天秤座";
            case 11:
                return (day >= 23) ? "射手座" : "天蠍座";
            case 12:
                return (day >= 22) ? "摩羯座" : "射手座";
            default:
                return "無效月份";
        }
    }
}
