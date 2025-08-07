import java.util.Scanner;

class Student
{

    private String name;
    private int rollNumber;
    private int[] marks = new int[5];

    Student(String n,int r,int[] m)
    {
        name = n;
        rollNumber = r;
        marks = m;
    }

    public int calculateTotal()
    {
        int total = 0;
        for(int mark:marks)
        {
            total+=mark;
        }

        return total;
    }

    public double calculateAverage()
    {
        double average = calculateTotal()/5.0;
        return average;

    }

    public String calculateGrade()
    {
         double average = calculateAverage();
        if(average>=90) return "O+";
        else if(average>=75) return "A+";
        else if(average>=60) return "A";
        else if(average>=50) return "B";
        else return "F";
    }

    public void showReport()
    {
        System.out.println("--------STUDENT REPORT----------");
        System.out.println("Name       :"+ name);
        System.out.println("Roll Number:"+ rollNumber);
        System.out.println("Total      :"+ calculateTotal());
        System.out.println("Average    :"+ calculateAverage());
        System.out.println("Grade      :"+ calculateGrade());
    }
}

public class StudentGradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        int[] marks = new int[5];
        System.out.print("Enter marks for 5 Subjects: ");

        for(int i=0;i<5;i++)
        {
            System.out.print("Subject "+ (i+1) + ": " );
            marks[i] = sc.nextInt();
        }

        Student S = new Student(name,rollNumber,marks);
        S.showReport();



    }
}
/*
Enter Student Name: Aishu
Enter Roll Number: 60
Enter marks for 5 Subjects: Subject 1: 96
Subject 2: 97
Subject 3: 98
Subject 4: 99
Subject 5: 100
--------STUDENT REPORT----------
Name       :Aishu
Roll Number:60
Total      :490
Average    :98.0
Grade      :O+
*/