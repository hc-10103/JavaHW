public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 윤년인지 판별
    public boolean isLeapYear(int y) {
        if (y % 400 == 0) {
            return true;
        } else if (y % 100 == 0) {
            return false;
        } else if (y % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 전달받은 달의 날짜 수 반환
    public int getDaysInMonth(int m) {
        if (m == 1 || m == 3 || m == 5 || m == 7 ||
            m == 8 || m == 10 || m == 12) {
            return 31;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        } else {
            if (isLeapYear(year)) {
                return 29;
            } 
            else {
                return 28;
            }
        }
    }

    // 1년 1월 1일부터 현재 날짜까지의 총 일수 계산
    public int toTotalDays() {
        int total = 0;

        // 이전 연도들의 총 일수 더하기
        for (int i = 1; i < year; i++) {
            if (isLeapYear(i)) {
                total = total + 366;
            } 
            else {
                total = total + 365;
            }
        }

        // 현재 연도의 이전 달들 일수 더하기
        for (int i = 1; i < month; i++) {
            total = total + getDaysInMonth(i);
        }

        total = total + day;

        return total;
    }
}