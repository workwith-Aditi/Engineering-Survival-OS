import java.util.Scanner;

class StudentProfile {
    String name;
    String branch;
    int year;
    double cgpa;
    int attendancePercentage;
    int no_of_projects;
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
        this.no_of_projects = projects;
        this.certificates = certificates;
        this.hackathons = hackathons;
        this.internshipApplications = internshipApplications;
    }

    void displayProfile() {
        System.out.println("===== Engineering Survival OS =====");
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Year( in integer): " + year);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Attendance: " + attendancePercentage + "%");
        System.out.println("Projects: " + no_of_projects);
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

        if (no_of_projects < 1) {
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

        Scanner sc = new Scanner(System.in);

        System.out.print( "Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.print("Enter Attendance Percentage: ");
        int attendancePercentage = sc.nextInt();

        System.out.print("Enter Number of Projects: ");
        int projects = sc.nextInt();

        System.out.print("Enter Number of Certificates: ");
        int certificates = sc.nextInt();

        System.out.print("Enter Number of Hackathons: ");
        int hackathons = sc.nextInt();

        System.out.print("Enter Internship Applications: ");
        int internshipApplications = sc.nextInt();

        StudentProfile student = new StudentProfile(
                name,
                branch,
                year,
                cgpa,
                attendancePercentage,
                projects,
                certificates,
                hackathons,
                internshipApplications
        );
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

