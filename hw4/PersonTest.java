// Person 클래스의 기능을 테스트하기 위한 클래스
public class PersonTest {
    public static void main(String[] args) {

        // 기본 생성자 테스트
        System.out.println("Default constructor test");
        Person p1 = new Person();
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        // 매개변수 생성자 테스트
        System.out.println("Parameterized constructor test");
        Person p2 = new Person("Alice Kim", 20);
        System.out.println(p2.getName());
        System.out.println(p2.getAge());

        // setName(first, last)와 setAge 테스트
        System.out.println("setName(first, last) and setAge test");
        p1.setName("John", "Park");
        p1.setAge(18);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        // setName(name) 테스트
        System.out.println("setName(name) test");
        p1.setName("David Lee");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        // setPerson 테스트
        System.out.println("setPerson test");
        p1.setPerson("Ahn heechan", 25);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        // createAdult 테스트
        System.out.println(" createAdult test");
        Person adult = Person.createAdult();
        System.out.println(adult.getName());
        System.out.println(adult.getAge());

        // createToddler 테스트
        System.out.println("createToddler test");
        Person toddler = Person.createToddler();
        System.out.println(toddler.getName());
        System.out.println(toddler.getAge());

        // createPreschooler 테스트
        System.out.println("createPreschooler test");
        Person preschooler = Person.createPreschooler();
        System.out.println(preschooler.getName());
        System.out.println(preschooler.getAge());

        // createAdolescent 테스트
        System.out.println("createAdolescent test");
        Person adolescent = Person.createAdolescent();
        System.out.println(adolescent.getName());
        System.out.println(adolescent.getAge());

        // createTeenager 테스트
        System.out.println("create Teenager test");
        Person teenager = Person.createTeenager();
        System.out.println(teenager.getName());
        System.out.println(teenager.getAge());
    }
}