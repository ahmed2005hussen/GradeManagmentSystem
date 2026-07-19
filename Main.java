import javax.swing.plaf.IconUIResource;
import java.util.Locale;
import java.util.Scanner;

class Main {
    Scanner sc = new Scanner(System.in);
    String[] students = new String[5];
    double[][] grades = new double[5][3]; // 5 students and 3 subjects

    public void initialNamesAndGrade() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter The name of Student " + (i+1) + ": ");
            students[i] = sc.next();

            System.out.println();

            for (int j = 0; j < 3; ) {
                System.out.print("Enter The Grade of Subject " + (j+1) + ": ");
                grades[i][j] = sc.nextDouble();

                if (grades[i][j] > 100 || grades[i][j] < 0) {
                    System.out.println("Pleas Enter invalid Grade between 0 - 100");
                    continue;
                }
                j++;
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
    }

    public int menu() {
        System.out.println("1. Show All Students names.");
        System.out.println("2. Show all Students grades and letter in each subject.");
        System.out.println("3. Search Student by name.");
        System.out.println("4. Count Passed Students");
        System.out.println("5. Display average for each subject.");
        System.out.println("6. Display highest grade in each subject.");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice >= 0 && choice <= 6) {
            return choice;
        }
        return -1;
    }

    public void showStudents() {

        System.out.println("Students: ");

        for (int i = 0; i < students.length; i++) {
            System.out.println("   " + (i + 1) + ". " + students[i]);
        }
        System.out.println("--------------------");
    }

    public void studentAndHisGrades() {
        System.out.println("Students and them grades: ");
        System.out.println("   Name   Subject1   Subject2   Subject3");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < students.length; i++) {
            System.out.print("   " + students[i]);
            for (int j = 0; j < grades[0].length; j++) {
                System.out.print("   " + grades[i][j] + " (" + gradeToLetter(grades[i][j]) + ")");
            }
            System.out.println();
        }

        System.out.println("----------------------");
    }

    public char gradeToLetter(double grade) {
        if (grade >= 85) return 'A';
        if (grade >= 75) return 'B';
        if (grade >= 65) return 'C';
        if (grade >= 50) return 'D';
        return 'F';
    }

    public void searchStudent() {
        System.out.print("Enter The Name: ");
        String name = sc.next();
        boolean found = false;
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            if (name.toLowerCase().equals(students[i].toLowerCase())) {
                found = true;
                System.out.println("Student found: ");

                System.out.println("Name: " + students[i]);

                for (int j = 0; j < grades[0].length; j++) {
                    System.out.println("Subject " + (j + 1) + ": " + grades[i][j]);
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Student Not Found");
        }
        System.out.println("-----------------------");
    }

    public void passedStudent() {
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[0].length; j++) {
                if (grades[i][j] < 50) {
                    count++;
                    break;
                }
            }
        }

        System.out.println("Number of Passed Student is: " + (5- count));
        System.out.println("---------------------------");
    }

    public void averageSubject() {
        System.out.println("Average for each Subject: ");
        for (int i = 0; i < grades[0].length; i++) {
            double average = 0.0;
            for (int j = 0; j < grades.length; j++) {
                average += grades[j][i];
            }
            average /= 3;

            System.out.println("   Subject" + " " + (i+1) + ": " + average + " In average.");

        }
        System.out.println("-------------------");
    }

    public void highestGrade() {
        System.out.println("Highest grade for each Subject: ");
        for (int i = 0; i < grades[0].length; i++) {
            double highest = 0.0;
            int student = 0;
            for (int j = 0; j < grades.length; j++) {
                if (grades[j][i] > highest) {
                    highest = grades[j][i];
                    student = j;
                }
            }


            System.out.println("   Subject" + " " + (i+1) + " highest grade is: " + highest + ",for student: " + students[student]);

        }
        System.out.println("-------------------");
    }

    public void main(String[] args) {
        initialNamesAndGrade();
        while(true){
            int choice= menu();
            if (choice == 0){
                break;
            }
            switch (choice){
                case 1 -> showStudents();
                case 2 -> studentAndHisGrades();
                case 3 -> searchStudent();
                case 4 -> passedStudent();
                case 5 -> averageSubject();
                case 6 -> highestGrade();
                case -1 -> System.out.println("Invalid Input");


            }
        }
        System.out.println("Thanks");
    }

}
