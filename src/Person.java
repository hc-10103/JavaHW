public abstract class Person {
    protected String dept;
    protected String name;
    protected String id;
    protected String email;

    public Person(String dept, String name, String id, String email) {
        // 입력이 비어있으면 "Not Yet Defined"로 처리
        this.dept = normalize(dept);
        this.name = normalize(name);
        this.id = normalize(id);
        this.email = normalize(email);
    }

    private String normalize(String value) {
        if (value == null || value.trim().isEmpty()) {
            return "Not Yet Defined";
        }
        return value.trim();
    }

    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }

    // 각 subclass가 출력 형식을 다르게 구현하도록 강제
    public abstract String writeOutput(int number);
}