import java.util.*;

class Grade
{
    public String grade(int avgper)
    {
        switch (avgper / 10) 
        {
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}

class StudentGradeCalculator
{
    public static void main(String[] args)
    {
        Grade g = new Grade();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount of subjects");
        int total_subs = sc.nextInt();
        int total_marks = 0;

        for (int i = 0; i < total_subs; i++){
            System.out.println("Enter subject " + (i + 1) + " marks");
            int marks = sc.nextInt();
            total_marks =total_marks + marks;
        }
        int avgper = total_marks / total_subs;
        String Grade = g.grade(avgper);

        System.out.println("Total marks obtained :- " + total_marks);
        System.out.println("Percentage obtained :- " + avgper+"%");
        System.out.println("Grade obtained :- " + Grade);

        sc.close();
        
    }
}