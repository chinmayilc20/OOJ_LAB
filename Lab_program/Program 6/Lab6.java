import SEE.*;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        int n = inp.nextInt();

        External[] students = new External[n];

        for (int i = 0; i < n; i++) {
            inp.nextLine(); 
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("USN: ");
            String usn = inp.nextLine();

            System.out.print("Name: ");
            String name = inp.nextLine();

            System.out.print("Semester: ");
            int sem = inp.nextInt();

            students[i] = new External(usn, name, sem);

            int[] cie = new int[5];
            System.out.println("Enter 5 CIE marks (Out of 50): ");
            for (int j = 0; j < 5; j++) {
                cie[j] = inp.nextInt();
            }
            students[i].setCieMarks(cie);

            int[] see = new int[5];
            System.out.println("Enter 5 SEE marks (Out of 100): ");
            for (int j = 0; j < 5; j++) {
                see[j] = inp.nextInt();
            }
            students[i].setSeeMarks(see); 

        System.out.println("\n=== Final Marks of All Students ===");
        for (External s : students) {
            s.displayResults();
        }

        inp.close();
    }
}
}
