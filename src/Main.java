import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 모든 객체를 Person 타입으로 저장 → polymorphism 핵심
        ArrayList<Person> contacts = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();

            if (line.isEmpty()) continue;

            if (line.equalsIgnoreCase("print")) {
                printContacts(contacts);
            }
            else if (line.equalsIgnoreCase("sort name")) {
                // 이름 기준 정렬
                contacts.sort(Comparator.comparing(Person::getName, String.CASE_INSENSITIVE_ORDER));
            }
            else if (line.equalsIgnoreCase("sort dept")) {
                // 학과 기준 정렬
                contacts.sort(Comparator.comparing(Person::getDept, String.CASE_INSENSITIVE_ORDER));
            }
            else {
                // 입력을 파싱해서 해당 객체 생성
                Person p = parsePerson(line);
                if (p != null) contacts.add(p);
            }
        }
    }

    // 입력 문자열을 객체로 변환
    private static Person parsePerson(String line) {
        String[] parts = line.split(",", -1); // 빈 값도 유지

        String type = parts.length > 0 ? parts[0].trim() : "";
        String dept = parts.length > 1 ? parts[1].trim() : "";
        String name = parts.length > 2 ? parts[2].trim() : "";
        String id = parts.length > 3 ? parts[3].trim() : "";
        String email = parts.length > 4 ? parts[4].trim() : "";

        if (type.equalsIgnoreCase("Under")) return new Under(dept, name, id, email);
        if (type.equalsIgnoreCase("Grad")) return new Grad(dept, name, id, email);
        if (type.equalsIgnoreCase("Faculty")) return new Faculty(dept, name, id, email);
        if (type.equalsIgnoreCase("Staff")) return new Staff(dept, name, id, email);

        return null;
    }

    // 출력 (타입별 번호 따로 관리)
    private static void printContacts(ArrayList<Person> contacts) {
        int under = 0, grad = 0, faculty = 0, staff = 0;

        for (Person p : contacts) {
            // 실제 객체 타입에 따라 다른 writeOutput 실행 → polymorphism
            if (p instanceof Under) {
                under++;
                System.out.println(p.writeOutput(under));
            }
            else if (p instanceof Grad) {
                grad++;
                System.out.println(p.writeOutput(grad));
            }
            else if (p instanceof Faculty) {
                faculty++;
                System.out.println(p.writeOutput(faculty));
            }
            else if (p instanceof Staff) {
                staff++;
                System.out.println(p.writeOutput(staff));
            }
        }
    }
}