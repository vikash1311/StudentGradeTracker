import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        students.add(new Student(name, grade));
        System.out.println("✅ Student added!");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠ No students found.");
            return;
        }
        System.out.println("\n=== Student List ===");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void showStatistics() {
        if (students.isEmpty()) {
            System.out.println("⚠ No students available.");
            return;
        }

        double sum = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        String highStudent = "", lowStudent = "";

        for (Student s : students) {
            double g = s.getGrade();
            sum += g;
            if (g > highest) {
                highest = g;
                highStudent = s.getName();
            }
            if (g < lowest) {
                lowest = g;
                lowStudent = s.getName();
            }
        }

        double avg = sum / students.size();

        System.out.println("\n=== Statistics ===");
        System.out.println("Average Score: " + avg);
        System.out.println("Highest Score: " + highest + " (by " + highStudent + ")");
        System.out.println("Lowest Score: " + lowest + " (by " + lowStudent + ")");
    }
}
