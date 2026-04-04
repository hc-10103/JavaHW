// Java programming 22500819 안희찬 //

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a start date:");
        int start = keyboard.nextInt();

        System.out.println("Enter an end date:");
        int end = keyboard.nextInt();

        // 한 개의 정수로 입력받은 시작 날짜와 끝 날짜를 나누기와 나머지 연산을 통해 분리 //

        int startYear = start / 10000;
        int startMonth = (start % 10000) / 100;
        int startDay = start % 100;

        int endYear = end / 10000;
        int endMonth = (end % 10000) / 100;
        int endDay = end % 100;

        Date startDate = new Date(startYear, startMonth, startDay);
        Date endDate = new Date(endYear, endMonth, endDay);

        int startTotalDays = startDate.toTotalDays();
        int endTotalDays = endDate.toTotalDays();

        int dDay = endTotalDays - startTotalDays;

        System.out.println("D-day: " + dDay + " days.");

        keyboard.close();
    }
}