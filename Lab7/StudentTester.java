package Lab7;

import java.io.*;
import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) throws Exception {
        Student[] students = new Student[25]; 
        
        int count = 0;

        File file = new File("studentList.txt");
        Scanner scanner = new Scanner(file);
        
        while (scanner.hasNextLine() && count < 25) {
            String line = scanner.nextLine();
            
            String[] parts = line.split(",");
            
            if (parts.length == 4) {
                String name = parts[0]; 
                double exam1 = Double.parseDouble(parts[1]);  
                double exam2 = Double.parseDouble(parts[2]);  
                double finalExam = Double.parseDouble(parts[3]);  
                students[count] = new Student(name, exam1, exam2, finalExam);
                count++;
            }
        }
        scanner.close();

        System.out.println("Student Grades:");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getName() + ": " + students[i].getLetterGrade());
        }
        
        FileWriter writer = new FileWriter("studentGrades.txt");
        writer.write("Student Grades:\n");
        
        for (int i = 0; i < count; i++) {
            writer.write(students[i].getName() + ": " + students[i].getLetterGrade() + "\n");
        }
        writer.close();
    }
}
