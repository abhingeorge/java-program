import java.util.Scanner;
class Employee {
  int eNo;
  String eName;
  double eSalary;
Employee() {
eNo = 0;
eName = "Unknown";
eSalary = 0;
}
  public Employee(int c, String n, double p) {
eNo = c;
eName = n;
eSalary = p;
}
public void display() {
System.out.println(eNo + "\t" + eName + "\t" + eSalary);
}
}
public class EmployeeSearch{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of employees:");
int n=sc.nextInt();
Employee[] arr = new Employee[n];
System.out.println("---Employee Details---");
for(int i=0;i<n;i++){
System.out.println("Employee"+(i+1)+":");
System.out.print("Enter eNo: ");
int eNo = sc.nextInt();
sc.nextLine();
System.out.print("Enter eName: ");
String eName = sc.nextLine();
System.out.print("Enter eSalary: ");
double eSalary = sc.nextDouble();
arr[i] = new Employee(eNo,eName,eSalary);
System.out.println();
}
System.out.print("Enter Employee Number to search: ");
int searchId = sc.nextInt();
boolean found=false;
System.out.println("\n--- Search Results ---");
for(int i=0;i<n;i++){
    if(searchId==arr[i].eNo){
        System.out.println("Employee found");
        arr[i].display();
        found = true;
        break;
    }
}

if(!found){
    System.out.println("Employee not found");
}
}
}

