public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("mom", "female", 61, 170);
        student1.bmi();
        Student student2 = new Student("dad", "male", 66, 189);
        student2.bmi();
    }
}