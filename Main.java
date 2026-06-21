import java.util.Scanner;

class StudentProfile {
    String name;
    String branch;
    int year;
    double cgpa;
    int attendancePercentage;
    int projects;
    int certificates;
    int hackathons;
    int internshipApplications;

    StudentProfile(String name, String branch, int year, double cgpa,
            int attendancePercentage, int projects, int certificates,
            int hackathons, int internshipApplications) {

        this.name = name;
        this.branch = branch;
        this.year = year;
        this.cgpa = cgpa;
        this.attendancePercentage = attendancePercentage;
        this.projects = projects;
        this.certificates = certificates;
        this.hackathons = hackathons;
        this.internshipApplications = internshipApplications;
    }

    void displayProfile() {
        System.out.println("===== Engineering Survival OS =====");
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Year: " + year);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Attendance: " + attendancePercentage + "%");
        System.out.println("Projects: " + projects);
        System.out.println("Certificates: " + certificates);
        System.out.println("Hackathons: " + hackathons);
        System.out.println("Internship Applications: " + internshipApplications);
    }

    void showAttentionAreas() {
        System.out.println("\n===== Areas Needing Attention =====");

        if (cgpa < 7.5) {
            System.out.println("- CGPA needs improvement.");
        }

        if (attendancePercentage < 75) {
            System.out.println("- Attendance is below safe level.");
        }

        if (projects < 1) {
            System.out.println("- Add at least one project to GitHub.");
        }
        if (certificates < 1) {
            System.out.println("- Complete at least one meaningful certificate.");
        }
        if (hackathons < 1) {
            System.out.println("- Try participating in one hackathon/ideathon.");
        }

        if (internshipApplications < 5) {
            System.out.println("- Start applying to internships.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        StudentProfile student = new StudentProfile(
                "Aditi",
                "Information Technology",
                2,
                8.5,
                78,
                0,
                1,
                2,
                0);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Show Profile");
            System.out.println("2. Show Attention Areas");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    student.displayProfile();
                    break;

                case 2:
                    student.showAttentionAreas();
                    break;

                case 3:
                    System.out.println("Thank you for using Engineering Survival OS!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

