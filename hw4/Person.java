// 22500819 안희찬
public class Person {
    private String name;
    private int age;

    // 기본 생성자: 이름은 "No name yet", 나이는 0으로 초기화
    public Person() {
        name = "No name yet";
        age = 0;
    }

    // 매개변수 생성자: 주어진 이름과 나이로 초기화
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 일반성인객체 생성
    public static Person createAdult() {
        return new Person("An adult", 21);
    }

    // 유아객체 생성
    public static Person createToddler() {
        return new Person("A toddler", 2);
    }

    // 유치원생객체 생성
    public static Person createPreschooler() {
        return new Person("A preschooler", 5);
    }

    // 아동객체 생성
    public static Person createAdolescent() {
        return new Person("An adolescent", 9);
    }

    // 청소년객체 생성
    public static Person createTeenager() {
        return new Person("A teenager", 15);
    }

    // 이름 반환
    public String getName() {
        return name;
    }

    // 나이 반환
    public int getAge() {
        return age;
    }

    // 이름을 first + last 형태로 설정
    public void setName(String first, String last) {
        name = first + " " + last;
    }

    // 이름을 하나의 문자열로 설정
    public void setName(String name) {
        this.name = name;
    }

    // 나이 설정
    public void setAge(int age) {
        this.age = age;
    }

    // 이름과 나이를 동시에 설정
    public void setPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}