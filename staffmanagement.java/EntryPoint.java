import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
public class EntryPoint {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the employee's first name: ");
		String First_Name = scan.nextLine();

		System.out.println("Please input the employee's last name: ");
		String Last_Name = scan.nextLine();

		System.out.println("Please input the employee's age: ");
		int age = scan.nextInt();

		System.out.println("Please input the employee's salary: ");
		double Monthly_Salary = scan.nextDouble();

		DecimalFormat fmt = new DecimalFormat ("#,###.###");
		System.out.println("Employee information: " + First_Name + Last_Name + "," + age + "," + fmt.format(Monthly_Salary));


		Random generator = new Random();
		int x = generator.nextInt(10) + 1;
		System.out.println("You have "+x+" insertions left.");

		for(int i=0;i<x;i++) {
		Scanner scan2 = new Scanner(System.in);

		System.out.println("Please input the employee's first name: " );
		String First = scan2.nextLine();

		System.out.println("Please input the employee's last name: " );
		String Last = scan2.nextLine();

		System.out.println("Please input the employee's age: " );
		int age2 = scan2.nextInt();

		System.out.println("Please input the employee's monthly salary: " );
		double Salary = scan2.nextDouble();

		DecimalFormat fmt1= new DecimalFormat ("#,###.###");
		System.out.println("Employee information: " + First + Last + "," + age2 + "," + fmt1.format(Salary));

		}
		

	}
}