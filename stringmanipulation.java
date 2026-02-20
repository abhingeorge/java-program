import java.util.Scanner;
public class StringMain {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the String:");
     String s = sc.nextLine();

     String c = new String(s);
     System.out.println("The length of the string is:"+s.length());
     System.out.println("Character EXtraction:" + s.charAt(3));
     System.out.print("Enter second String:");
     String t = sc.nextLine();

     String c1 = new String(t);
     System.out.println("Check Str6+ing Comparison:" +s.equals(t));
     System.out.println("String Concatination:"+ s+t);
     System.out.print("Enter third String:");
     String r = sc.nextLine();
     String c2 = new String(r);
     System.out.println("s compared to t:"+s.compareTo(t));
     System.out.println("s compared to r:"+s.compareTo(r));
     System.out.println("t compared to s:"+t.compareTo(s));
     System.out.println("Searching String:" +s.indexOf(t));
     System.out.println("Modifying String by replace:" +s.replace('a','c'));
     System.out.println("Modifying String by uppercase:" +s.toUpperCase());
     int n=10;
     System.out.println("Value Conversion:" +String.valueOf(n));
     System.out.print("Enter Strings:");
     String i = sc.nextLine();
     String[] arr = i.split(" ");
     String c3 = new String(i);
     System.out.println("--Splitting the String--");
     System.out.println(arr[0]);
     System.out.println(arr[2]);
     System.out.println(arr[1]);    
     StringBuffer g = new StringBuffer("hello");
     g.append("world");
     System.out.println("Mutable string using string buffer:"+g);
     }
}
