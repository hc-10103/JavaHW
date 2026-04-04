public class Faculty extends Employee {

    public Faculty(String dept, String name, String id, String email) {
        super(dept, name, id, email);
    }

    // Faculty 전용 출력 형식
    @Override
    public String writeOutput(int number) {
        return "Faculty " + number + ", " + dept + ", Name: " + name
                + ", Faculty ID: " + id + " (" + email + ")";
    }
}