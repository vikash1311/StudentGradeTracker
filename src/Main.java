import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n=== Student Grade Tracker ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Show Statistics");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter grade: ");
                    double grade = sc.nextDouble();
                    manager.addStudent(name, grade);
                    break;
                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    manager.showStatistics();
                    break;
                case 4:
                    System.out.println("👋 Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("❌ Invalid choice.");
            }
        }
    }
}
