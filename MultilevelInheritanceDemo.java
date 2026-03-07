import java.util.Scanner;

// --- 1. Base Class: Person ---
class Person {

    // 1. Declare instance variables
    String name, gender, address;
    int age;

    // Parametrized Constructor
    public Person(String name, String gender, String address, int age) {

        // 2. Initialize variables
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    public void display() {

        // 3. Print Person details
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
    }
}


// --- 2. Intermediate Subclass: Employee extends Person ---

// 4. Inherit Person class
class Employee extends Person {

    // 5. Declare instance variables
    int empId;
    String companyName;
    String qualification;
    double salary;

    // Parametrized Constructor
    public Employee(String name, String gender, String address, int age,
                    int empId, String companyName,
                    String qualification, double salary) {

        // 6. Call parent constructor
        super(name, gender, address, age);

        // 7. Initialize Employee variables
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }

    @Override
    public void display() {

        // 8. Call parent display
        super.display();

        // 9. Print Employee details
        System.out.println("Employee ID : " + empId);
        System.out.println("Company Name : " + companyName);
        System.out.println("Qualification : " + qualification);
        System.out.println("Salary : " + salary);
    }
}


// --- 3. Terminal Subclass: Teacher extends Employee ---

// 10. Inherit Employee class
class Teacher extends Employee {

    // 11. Declare variables
    String subject;
    String department;
    int teacherId;

    // Parametrized Constructor
    public Teacher(String name, String gender, String address, int age,
                   int empId, String companyName,
                   String qualification, double salary,
                   String subject, String department, int teacherId) {

        // 12. Call parent constructor
        super(name, gender, address, age,
              empId, companyName, qualification, salary);

        // 13. Initialize Teacher variables
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    @Override
    public void display() {

        // 14. Call parent display
        super.display();

        // 15. Print Teacher details
        System.out.println("Teacher ID : " + teacherId);
        System.out.println("Subject : " + subject);
        System.out.println("Department : " + department);
        System.out.println("----------------------------------------");
    }
}


// --- 4. Main Execution Class ---

public class MultilevelInheritanceDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of teachers (N): ");
        int n = sc.nextInt();

        // 16. Array of Teacher objects
        Teacher teachers[] = new Teacher[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\n--- Enter Details for Teacher " + (i + 1) + " ---");

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Company Name: ");
            String companyName = sc.nextLine();

            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            sc.nextLine();

            System.out.print("Teacher ID: ");
            int teacherId = sc.nextInt();
            sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            // 17. Create Teacher object
            teachers[i] = new Teacher(name, gender, address, age,
                                      empId, companyName,
                                      qualification, salary,
                                      subject, department, teacherId);
        }

        System.out.println("\n========================================");
        System.out.println(" TEACHER RECORDS");
        System.out.println("========================================");

        // 18. Display all teachers
        for (int i = 0; i < n; i++) {
            teachers[i].display();
        }

        sc.close();
    }
}
