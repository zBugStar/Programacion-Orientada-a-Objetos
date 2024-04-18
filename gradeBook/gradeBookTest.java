package gradeBook;
import java.util.Scanner;

public class gradeBookTest {
    public static void main(String[] args) {
        gradeBook courseName1 = new gradeBook("numero2");
        System.out.println(courseName1.displayMessage() + courseName1.getCourseName());
        Scanner input = new Scanner(System.in);

        double total,average,grade;
        int gradeCounter,notPass,pass,students;


        gradeCounter = 1;
        students = 10;
        pass = 0;
        notPass = 0;

        total = 0;

        while(gradeCounter <= students){
            System.out.println("Escriba la nota estudiante " + gradeCounter);
            grade = input.nextDouble();
            if(grade >=3){
                pass = pass + 1;
            }else{
                notPass = notPass + 1;
            }

            total = total + grade;
            gradeCounter = gradeCounter + 1;

        }
        average = total / 10 ;

        System.out.println("El promedio de las notas es : " + average);

        if(pass >= 8){
            System.out.println("El profesor merece el bono");
        }else if(notPass >8){
            System.out.println("El profesor no merece el bono");
        }

    }
}