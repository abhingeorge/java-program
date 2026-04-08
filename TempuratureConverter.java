import java.util.Scanner;
public class TempuratureConverter{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(true){
System.out.println("\n 1. Calsius to Fahrenheit \n 2.Fahrenheit to Calsius  \n 3.EXIT\n");
System.out.println("\n enter your choice: ");
int choice=sc.nextInt();
sc.nextLine();
if(choice==3){
break;
}
System.out.println("\n enter temperature value: ");
String tem=sc.nextLine();
try{
double temperature=Double.parseDouble(tem);
double convertedTemp;
switch(choice){
case 1: convertedTemp=(temperature * 9 /5)+32;
        System.out.println(temperature+"C is"+convertedTemp+"F");
        break;
case 2: convertedTemp=(temperature - 32)*5/9;
        System.out.println(temperature+"F is"+convertedTemp+"C");
        break;        
default:System.out.println("\nerror: invalid choice!!");
}
}
catch(NumberFormatException e){
System.out.println("\nerror: Invalid input. you must enter a numerical value.");
System.out.println("\nException detail "+e);
System.out.println("\nException detail "+e.getMessage());
}}}}





