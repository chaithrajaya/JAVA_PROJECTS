public class Student {
    int id;
    String name;
    int[] marks;
    double percentage;
    String grade;

    public Student(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        calculateResult();
    }

    void calculateResult() {
        int total = 0;
        for(int m : marks) total += m;
        percentage = total / 5.0;

        if(percentage >= 90) grade = "A+";
        else if(percentage >= 80) grade = "A";
        else if(percentage >= 70) grade = "B";
        else if(percentage >= 60) grade = "C";
        else if(percentage >= 50) grade = "D";
        else grade = "Fail";
    }

    public String toString(){
        return id + " | " + name + " | " + percentage + "% | " + grade;
    }
}
