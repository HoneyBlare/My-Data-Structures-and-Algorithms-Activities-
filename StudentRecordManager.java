import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentRecordManager {

    // Inner class to represent a student record
    static class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    // Inner class to implement a hash table for student records
    static class HashTable {
        private List<LinkedList<Student>> table;
        private int size;

        HashTable(int size) {
            this.size = size;
            table = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                table.add(new LinkedList<>());
            }
        }

        // Hash function to determine the index for a given student ID
        int hash(int key) {
            return key % size;
        }

        // Adds a new student record to the hash table
        void add(Student student) {
            int index = hash(student.id);
            table.get(index).add(student);
        }

        // Searches for a student record by ID
        Student search(int key) {
            int index = hash(key);
            for (Student student : table.get(index)) {
                if (student.id == key) {
                    return student;
                }
            }
            return null;
        }

        // Deletes a student record by ID
        void delete(int key) {
            int index = hash(key);
            for (Student student : table.get(index)) {
                if (student.id == key) {
                    table.get(index).remove(student);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a hash table with a size of 10 (can be adjusted)
        HashTable hashTable = new HashTable(10);

        int choice;
        // Main loop to interact with the user
        do {
            System.out.println("\nStudent Record Manager");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add Student
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    hashTable.add(new Student(id, name));
                    System.out.println("Student added successfully.");
                    break;
                case 2: // Search Student
                    System.out.print("Enter student ID to search: ");
                    id = scanner.nextInt();
                    Student student = hashTable.search(id);
                    if (student != null) {
                        System.out.println("Student found: ID=" + student.id + ", Name=" + student.name);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3: // Delete Student
                    System.out.print("Enter student ID to delete: ");
                    id = scanner.nextInt();
                    hashTable.delete(id);
                    System.out.println("Student deleted successfully.");
                    break;
                case 4: // Exit
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
}