import java.io.*;
import java.util.*;

public class MainApp {
    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        loadData();

        while(true) {
            System.out.println("\n=== Student Performance Tracker ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Save & Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch(ch) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: saveData(); System.exit(0);
                default: System.out.println("Invalid Choice!");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");
        for(int i=0;i<5;i++) marks[i] = sc.nextInt();

        list.add(new Student(id, name, marks));
        System.out.println("Student Added ✅");
    }

    static void viewStudents() {
        System.out.println("\nID | Name | % | Grade");
        for(Student s : list) System.out.println(s);
    }

    static void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        for(Student s : list)
            if(s.id == id) { System.out.println(s); return; }
        System.out.println("Student not found ❌");
    }

    static void saveData() throws Exception {
        FileWriter fw = new FileWriter("students.txt");
        for(Student s : list) fw.write(s + "\n");
        fw.close();
        System.out.println("Data Saved ✅");
    }

    static void loadData() throws Exception {
        File file = new File("students.txt");
        if(!file.exists()) return;
        Scanner fr = new Scanner(file);
        while(fr.hasNextLine()) System.out.println(fr.nextLine());
        fr.close();
    }
}
