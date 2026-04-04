public class Under extends Student {

    public Under(String dept, String name, String id, String email) {
        super(dept, name, id, email);
    }

    // Under 학생 전용 출력 형식
    @Override
    public String writeOutput(int number) {
        return "Under " + number + ", " + dept + ", Name: " + name
                + ", Under Student Number: " + id + " (" + email + ")";
    }
}