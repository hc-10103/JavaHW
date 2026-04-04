public class Grad extends Student {

    public Grad(String dept, String name, String id, String email) {
        super(dept, name, id, email);
    }

    // Grad 학생 전용 출력 형식
    @Override
    public String writeOutput(int number) {
        return "Grad " + number + ", " + dept + ", Name: " + name
                + ", Grad Student Number: " + id + " (" + email + ")";
    }
}