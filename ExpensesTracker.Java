import java.io.FileWriter;
import java.io.IOException;  
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class ExpensesTracker{
  public static void main(String[] args){
  
    try {
	FileWriter fw = new FileWriter("expenses.txt",true);
	
	Scanner scan = new Scanner(System.in);
	
	String name,item;
	String y = "y";
	String n = "n";
	double price;
	String output;

		System.out.println("Input your name: ");
		name = scan.nextLine();

		System.out.println("What did you purchase: ");
		item = scan.nextLine();
		
		System.out.println("How much did you pay: ");
		price = scan.nextDouble();
		scan.nextLine();


		fw.write("<" + name + " > purchased < " + item + " > for < " + price + " > US Dollars.");
		
		
		System.out.println("Would you like to log another purchase?: (y/n)");
		output = scan.nextLine();
		
		
		while(output.equals(y)){
		
		System.out.println("Input your name: ");
		name = scan.nextLine();

		System.out.println("What did you purchase: ");
		item = scan.nextLine();

		System.out.println("How much did you pay: ");
		price = scan.nextDouble();
		scan.nextLine();

		System.out.println("Would you like to log another purchase?: (y/n) ");
		output = scan.nextLine();

		fw.write("<" + name + " > purchased < " + item + " > for < " + price + " > US Dollars.");
	}
		
		
		
		if(output.equals(n)) { 

		System.out.println("Get off of ZoodMall!");
		System.out.println("Would you like to read a summary of your purchases?");
		String answer = scan.nextLine();
	
			if(answer.equals(y)) {
			
			String fileName = "expenses.txt";
			File text = new File(fileName);
			FileReader fr = new FileReader(text);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line = br.readLine()) != null){
       			System.out.println(line);
		
			}
	
		}
   	}
		
		
fw.close();
scan.close();



    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}