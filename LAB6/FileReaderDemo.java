package LAB6;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("sample_data.txt");
            BufferedReader reader = new BufferedReader(file);
            
            System.out.println("People from file:");
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                Person person = new Person(name, age);
                person.displayPerson();
            }
            
            reader.close();
            
        } catch (Exception e) {
            System.out.println("Error:File Not Found");
        }
    }
}