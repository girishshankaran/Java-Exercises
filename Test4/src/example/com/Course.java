package example.com;
import java.util.ArrayList;
import java.util.List;

public class Course {

    String courseName;
    ArrayList<Student> MyStudent = new ArrayList<>();

    // Add a student
    public String add_student(Student student) {
        MyStudent.add(student);
        System.out.println(student.name + " is added");
        return student.name;
    }

    // Remove a student by studentID
    public boolean remove_student_by_id(int studentID) {
        for (int i = 0; i < MyStudent.size(); i++) {
            if (MyStudent.get(i).getStudentID() == studentID) {
                System.out.println(MyStudent.get(i).getName() + " is removed");
                MyStudent.remove(i);
                return true; // Student found and removed
            }
        }
        System.out.println("Student with ID " + studentID + " not found");
        return false; // Student not found
    }

    // Display all enrolled students
    public void display_students() {
        if (MyStudent.isEmpty()) {
            System.out.println("No students enrolled.");
            return;
        }
        System.out.println("Enrolled students:");
        for (Student s : MyStudent) {
            System.out.println("Name: " + s.getName() + ", ID: " + s.getStudentID());
        }
    }
}

