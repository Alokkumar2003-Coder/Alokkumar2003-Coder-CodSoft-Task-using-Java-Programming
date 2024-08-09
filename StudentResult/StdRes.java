package StudentResult;

import java.util.Scanner;

public class StdRes 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of subjects: ");
        int numSubjects = sc.nextInt();

        int marks[] = new int[numSubjects];
        int totalMarks = 0;

        for(int i=0; i<numSubjects; i++)
        {
            System.out.println("Enter marks obtained in each subjects " +(i+1) + "(out of 100): ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
        
        double avgPercent = (double)totalMarks/numSubjects;

        char grade;
        if(avgPercent >=90)
        {
            grade = 'A';
        }
        else if(avgPercent >=80)
        {
            grade = 'B';
        }
        else if(avgPercent >=70)
        {
            grade = 'C';
        }
        else if(avgPercent >=60)
        {
            grade = 'D';
        }        
        else if(avgPercent >=50)
        {
            grade = 'E';
        }
        else 
        {
            grade = 'F';
        }

        System.out.println("\n--Result --");
        System.out.println("TotalMarks: " + totalMarks + " out of " + (numSubjects*100));
        System.out.println("Avg Percent: " + avgPercent + "%");
        System.out.println("Grade: " + grade);

        sc.close();

    }
    
}
