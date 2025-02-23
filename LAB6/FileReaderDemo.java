package LAB6;

import java.io.File;
import java.util.Scanner;

public class FileReaderDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("sample_data.txt");
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine()){
            System.out.print(sc.nextLine());
        }
        sc.close();
    }
}

