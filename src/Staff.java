public class Staff extends Employee {

    public Staff(String dept, String name, String id, String email) {
        super(dept, name, id, email);
    }

    // Staff 전용 출력 형식
    @Override
    public String writeOutput(int number) {
        return "Staff " + number + ", " + dept + ", Name: " + name
                + ", Staff ID: " + id + " (" + email + ")";
    }
}