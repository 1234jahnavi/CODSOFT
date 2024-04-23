import java.util.Scanner;

class Grade{
    public String grade(int avgper){
        switch (avgper / 10) {
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

public class Task2{
    public static void main(String[] args){
        Grade g = new Grade();
        Scanner sc = new Scanner(System.in);

        //Taking input of how many subjects are there
        System.out.println("Enter the amount of subjects");
        int tsubs = sc.nextInt();
        int tmarks = 0;

        //Taking and adding all the marks
        for (int i = 0; i < tsubs; i++) {
            System.out.println("Enter the marks obtained in subject " + (i + 1));
            int marks = sc.nextInt();
            tmarks += marks;
        }

        //Calculating Percentage
        int avgper = tmarks / tsubs;

        //Calculating Grades
        String Grade = g.grade(avgper);

        //Displaying all the Data
        System.out.println("Total marks obtained :- " + tmarks);
        System.out.println("Percentage obtained :- " + avgper+"%");
        System.out.println("Grade obtained :- " + Grade);

        sc.close();
        //Lets test the code
    }
}