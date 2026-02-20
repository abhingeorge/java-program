import java.util.Scanner;
class CPU {
double price;
// Inner class
class Processor {
int cores;
String manufacturer;
}
// Static nested class
static class RAM {
int memory;
String manufacturer;
}
}
public class CPUMain {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Create outer class object
CPU cpu = new CPU();
System.out.print("Enter CPU Price: ");
cpu.price = sc.nextDouble();
// Create inner class object
CPU.Processor processor = cpu.new Processor();
System.out.print("Enter number of processor cores: ");
processor.cores = sc.nextInt();
sc.nextLine(); // consume leftover newline
System.out.print("Enter processor manufacturer: ");
processor.manufacturer = sc.nextLine();
// Create static nested class object
CPU.RAM ram = new CPU.RAM();
System.out.print("Enter RAM size (GB): ");
ram.memory = sc.nextInt();
sc.nextLine(); // consume leftover newline
System.out.print("Enter RAM manufacturer: ");
ram.manufacturer = sc.nextLine();
// Display details
System.out.println("\n----- CPU DETAILS -----");
System.out.println("CPU Price: Rs. " + cpu.price);
System.out.println("Processor Cores: " + processor.cores);
System.out.println("Processor Manufacturer: " + processor.manufacturer);
System.out.println("RAM Size: " + ram.memory + " GB");
System.out.println("RAM Manufacturer: " + ram.manufacturer);
}
}

