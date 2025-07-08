package example.com;

public class TestCourse {

    public static void main(String[] args) {
        Student student1 = new Student("Girish", 1100);
        Student student2 = new Student("Vivaan", 1101);
        Student student3 = new Student("Tiana", 1102);

        Course MyCourse = new Course();

        MyCourse.add_student(student1);
        MyCourse.add_student(student2);
        MyCourse.add_student(student3);

        // Display all students
        MyCourse.display_students();

        // Remove a student by ID
        MyCourse.remove_student_by_id(1101);

        // Display students after removal
        MyCourse.display_students();
    }
}

