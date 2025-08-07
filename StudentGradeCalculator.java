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

    public char calculateGrade()
    {
         double average = calculateAverage();
        if(average>=90) return 'A';
        else if(average>=75) return 'B';
        else if(average>=60) return 'C';
        else if(average>=50) return 'D';
        else return 'F';
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

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        int[] marks = new int[5];
        System.out.println("Enter marks for 5 Subjects: ");

        for(int i=0;i<5;i++)
        {
            System.out.println("Subject "+ (i+1) + ": " );
            marks[i] = sc.nextInt();
        }

        Student S = new Student(name,rollNumber,marks);
        S.showReport();



    }
}