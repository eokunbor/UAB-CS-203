package HW3;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class UABSystem {
    static UABPerson[] peopleArray = new UABPerson[100];
    static int personCount = 0;
    static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the UAB Employee System");
        loadFromFile("c:\\Users\\eokun\\OneDrive\\Documents\\UAB-CS-203-1\\HW3\\uabEmployee.txt");

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Display the UABPerson list");
            System.out.println("2. Add UABPerson");
            System.out.println("3. Update the database");
            System.out.println("4. Delete UABPerson");
            System.out.print("Enter your choice (1-4): ");

            int userChoice = inputScanner.nextInt();
            inputScanner.nextLine();

            if (userChoice == 1) {
                displayPeople();
            } else if (userChoice == 2) {
                addPerson();
            } else if (userChoice == 3) {
                saveToFile("c:\\Users\\eokun\\OneDrive\\Documents\\UAB-CS-203-1\\HW3\\uabEmployee.txt");
                System.out.println("Database updated!");
            } else if (userChoice == 4) {
                deletePerson();
            } else {
                System.out.println("Error found in choice. Please try again.");
            }
        }

        inputScanner.close();
    }

    static void loadFromFile(String filename) {
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null && personCount < 100) {
                String[] parts = line.split(" ");

                if (parts.length < 3) continue;

                char personType = parts[0].charAt(0);
                String firstName = parts[1];
                String lastName = parts[2];
                String blazerId = parts[3];

                if (personType == 'F') {
                    if (parts.length >= 6) {
                        String department = parts[4];
                        int courses = Integer.parseInt(parts[5]);
                        peopleArray[personCount] = new Faculty(firstName, lastName, blazerId, department, courses);
                        personCount++;
                    }
                } else if (personType == 'S') {
                    if (parts.length >= 7) {
                        String level = parts[4];
                        String major = parts[5];
                        double gpa = Double.parseDouble(parts[6]);
                        peopleArray[personCount] = new Student(firstName, lastName, blazerId, level, major, gpa);
                        personCount++;
                    }
                } else if (personType == 'I') {
                    if (parts.length >= 5) {
                        String team = parts[4];
                        peopleArray[personCount] = new ITProfessional(firstName, lastName, blazerId, team);
                        personCount++;
                    }
                } else if (personType == 'M') {
                    if (parts.length >= 6) {
                        String role = parts[4];
                        String department = parts[5];

                        if (role.equals("Nurse") && parts.length >= 7) {
                            boolean onCall = parts[6].equals("Yes");
                            peopleArray[personCount] = new Nurse(firstName, lastName, blazerId, role, department, onCall);
                            personCount++;
                        } else {
                            peopleArray[personCount] = new Doctor(firstName, lastName, blazerId, role, department);
                            personCount++;
                        }
                    }
                } else if (personType == 'A') {
                    if (parts.length >= 6) {
                        String department = parts[4];
                        String group = parts[5];
                        peopleArray[personCount] = new Advisor(firstName, lastName, blazerId, department, group);
                        personCount++;
                    }
                } else if (personType == 'O') {
                    if (parts.length >= 6) {
                        String role = parts[4];
                        String department = parts[5];
                        peopleArray[personCount] = new OfficeAssociate(firstName, lastName, blazerId, role, department);
                        personCount++;
                    }
                }
            }

            bufferedReader.close();
            System.out.println("Successfully loaded " + personCount + " people from file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            System.out.println("Starting with an empty database.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } 
    }

    static void saveToFile(String filename) {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            PrintWriter writer = new PrintWriter(fileWriter);

            for (int i = 0; i < personCount; i++) {
                UABPerson person = peopleArray[i];

                if (person instanceof Student) {
                    writer.println(((Student) person).toFileString());
                } else if (person instanceof Faculty) {
                    writer.println(((Faculty) person).toFileString());
                } else if (person instanceof Nurse) {
                    writer.println(((Nurse) person).toFileString());
                } else if (person instanceof Doctor) {
                    writer.println(((Doctor) person).toFileString());
                } else if (person instanceof MedicalStaff) {
                    writer.println(((MedicalStaff) person).toFileString());
                } else if (person instanceof Advisor) {
                    writer.println(((Advisor) person).toFileString());
                } else if (person instanceof ITProfessional) {
                    writer.println(((ITProfessional) person).toFileString());
                } else if (person instanceof OfficeAssociate) {
                    writer.println(((OfficeAssociate) person).toFileString());
                }
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    static void displayPeople() {
        int facultyCount = 0;
        int studentCount = 0;
        int itProfessionalCount = 0;
        int advisorCount = 0;
        int officeAssociateCount = 0;
        int doctorCount = 0;
        int nurseCount = 0;

        for (int i = 0; i < personCount; i++) {
            if (peopleArray[i] instanceof Faculty) {
                facultyCount++;
            } else if (peopleArray[i] instanceof Student) {
                studentCount++;
            } else if (peopleArray[i] instanceof ITProfessional) {
                itProfessionalCount++;
            } else if (peopleArray[i] instanceof Advisor) {
                advisorCount++;
            } else if (peopleArray[i] instanceof OfficeAssociate) {
                officeAssociateCount++;
            } else if (peopleArray[i] instanceof Doctor) {
                doctorCount++;
            } else if (peopleArray[i] instanceof Nurse) {
                nurseCount++;
            }
        }

        System.out.println("The UAB Employee System has the following employees:");
        System.out.println("Total Number of employees = " + personCount);

        if (facultyCount > 0) {
            System.out.println("Faculty: " + facultyCount);
            for (int i = 0; personCount > i; i++) {
                if (peopleArray[i] instanceof Faculty) {
                    System.out.println(peopleArray[i].toString());
                }
            }
        }

        if (studentCount > 0) {
            System.out.println("Students: " + studentCount);
            for (int i = 0; personCount > i; i++) {
                if (peopleArray[i] instanceof Student) {
                    System.out.println(peopleArray[i].toString());
                }
            }
        }

        if (officeAssociateCount > 0) {
            System.out.println("Office Associates: " + officeAssociateCount);
            for (int i = 0; personCount > i; i++) {
                if (peopleArray[i] instanceof OfficeAssociate) {
                    System.out.println(peopleArray[i].toString());
                }
            }
        }

        if (advisorCount > 0) {
            System.out.println("Advisors: " + advisorCount);
            for (int i = 0; personCount > i; i++) {
                if (peopleArray[i] instanceof Advisor) {
                    System.out.println(peopleArray[i].toString());
                }
            }
        }

        if (itProfessionalCount > 0) {
            System.out.println("IT Professionals: " + itProfessionalCount);
            for (int i = 0; personCount > i; i++) {
                if (peopleArray[i] instanceof ITProfessional) {
                    System.out.println(peopleArray[i].toString());
                }
            }
        }

        int medicalStaffCount = doctorCount + nurseCount;
        if (medicalStaffCount > 0) {
            System.out.println("Total Medical Staff: " + medicalStaffCount);

            if (doctorCount > 0) {
                System.out.println("Doctors: " + doctorCount);
                for (int i = 0; personCount > i; i++) {
                    if (peopleArray[i] instanceof Doctor) {
                        System.out.println(peopleArray[i].toString());
                    }
                }
            }

            if (nurseCount > 0) {
                System.out.println("Nurses: " + nurseCount);
                for (int i = 0; personCount > i; i++) {
                    if (peopleArray[i] instanceof Nurse) {
                        System.out.println(peopleArray[i].toString());
                    }
                }
            }
        }
    }

    static void addPerson() {
        System.out.println("Add a new UAB Person");
        System.out.println("Select the type of person to add:");
        System.out.println("1. Faculty (F)");
        System.out.println("2. Student (S)");
        System.out.println("3. IT Professional (I)");
        System.out.println("4. Medical Staff - Doctor (M)");
        System.out.println("5. Medical Staff - Nurse (M)");
        System.out.println("6. Advisor (A)");
        System.out.println("7. Office Associate (O)");
        System.out.print("Enter your choice (1-7): ");

        int userChoice = inputScanner.nextInt();
        inputScanner.nextLine();

        System.out.print("Enter first name: ");
        String firstName = inputScanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = inputScanner.nextLine();

        System.out.print("Enter blazerId: ");
        String blazerId = inputScanner.nextLine();

        if (userChoice == 1) {
            System.out.print("Enter department: ");
            String department = inputScanner.nextLine();

            System.out.print("Enter number of courses: ");
            int courses = inputScanner.nextInt();
            inputScanner.nextLine();

            peopleArray[personCount] = new Faculty(firstName, lastName, blazerId, department, courses);
            personCount++;
            System.out.println("Faculty member added successfully!");

        } else if (userChoice == 2) {
            System.out.print("Enter level (Freshman/Sophomore/Junior/Senior): ");
            String level = inputScanner.nextLine();

            System.out.print("Enter major: ");
            String major = inputScanner.nextLine();

            System.out.print("Enter GPA: ");
            double gpa = inputScanner.nextDouble();
            inputScanner.nextLine();

            peopleArray[personCount] = new Student(firstName, lastName, blazerId, level, major, gpa);
            personCount++;
            System.out.println("Student added successfully!");

        } else if (userChoice == 3) {
            System.out.print("Enter team: ");
            String team = inputScanner.nextLine();

            peopleArray[personCount] = new ITProfessional(firstName, lastName, blazerId, team);
            personCount++;
            System.out.println("IT Professional added successfully!");

        } else if (userChoice == 4) {
            System.out.print("Enter role (e.g., Cardiologist, Surgeon): ");
            String doctorRole = inputScanner.nextLine();

            System.out.print("Enter department: ");
            String doctorDept = inputScanner.nextLine();

            peopleArray[personCount] = new Doctor(firstName, lastName, blazerId, doctorRole, doctorDept);
            personCount++;
            System.out.println("Doctor added successfully!");

        } else if (userChoice == 5) {
            System.out.print("Enter department: ");
            String nurseDept = inputScanner.nextLine();

            System.out.print("On call? (Yes/No): ");
            String onCallStr = inputScanner.nextLine();
            boolean onCall = false;
            if (onCallStr.equals("Yes")) {
                onCall = true;
            }

            peopleArray[personCount] = new Nurse(firstName, lastName, blazerId, "Nurse", nurseDept, onCall);
            personCount++;
            System.out.println("Nurse added successfully!");

        } else if (userChoice == 6) {
            System.out.print("Enter department: ");
            String advisorDept = inputScanner.nextLine();

            System.out.print("Enter group (Undergraduate/Graduate): ");
            String group = inputScanner.nextLine();

            peopleArray[personCount] = new Advisor(firstName, lastName, blazerId, advisorDept, group);
            personCount++;
            System.out.println("Advisor added successfully!");

        } else if (userChoice == 7) {
            System.out.print("Enter role: ");
            String officeRole = inputScanner.nextLine();

            System.out.print("Enter department: ");
            String officeDept = inputScanner.nextLine();

            peopleArray[personCount] = new OfficeAssociate(firstName, lastName, blazerId, officeRole, officeDept);
            personCount++;
            System.out.println("Office Associate added successfully!");

        } else {
            System.out.println("Invalid choice.");
        }
    }

    static void deletePerson() {
        System.out.println("Delete a UAB Person");
        System.out.println("Select the type of person to delete:");
        System.out.println("1. Faculty (F)");
        System.out.println("2. Student (S)");
        System.out.println("3. IT Professional (I)");
        System.out.println("4. Medical Staff (M)");
        System.out.println("5. Advisor (A)");
        System.out.println("6. Office Associate (O)");
        System.out.print("Enter your choice (1-6): ");

        int userChoice = inputScanner.nextInt();
        inputScanner.nextLine();

        System.out.print("Enter blazerId to delete: ");
        String blazerId = inputScanner.nextLine();

        boolean isFound = false;
        int indexToDelete = -1;

        for (int i = 0; i < personCount; i++) {
            if (peopleArray[i].getBlazerId().equals(blazerId)) {
                boolean roleMatches = false;

                if (userChoice == 1) {
                    if (peopleArray[i] instanceof Faculty) {
                        roleMatches = true;
                    }
                } else if (userChoice == 2) {
                    if (peopleArray[i] instanceof Student) {
                        roleMatches = true;
                    }
                } else if (userChoice == 3) {
                    if (peopleArray[i] instanceof ITProfessional) {
                        roleMatches = true;
                    }
                } else if (userChoice == 4) {
                    if (peopleArray[i] instanceof MedicalStaff) {
                        roleMatches = true;
                    }
                } else if (userChoice == 5) {
                    if (peopleArray[i] instanceof Advisor) {
                        roleMatches = true;
                    }
                } else if (userChoice == 6) {
                    if (peopleArray[i] instanceof OfficeAssociate) {
                        roleMatches = true;
                    }
                }

                if (roleMatches) {
                    isFound = true;
                    indexToDelete = i;
                    break;
                }
            }
        }

        if (isFound) {
            for (int i = indexToDelete; i < personCount - 1; i++) {
                peopleArray[i] = peopleArray[i + 1];
            }
            peopleArray[personCount - 1] = null;
            personCount--;
            System.out.println("Person deleted successfully!");
        } else {
            System.out.println("Person not found with the given blazerId and role.");
        }
    }
}