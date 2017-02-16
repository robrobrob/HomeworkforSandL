import java.util.Scanner;

/**
 * @author: Robert
 * @version: 2/16/17
 * @assign.ment: Strings and Loops
 * @descrip.tion: Exercises in Strings and Loops
 *
 */
public class SandL {
	public static void main(String[] args) {
		boringLoop();
		boringLoop2();
		multTable();
		printThemTickets();
	}
	public static void boringLoop(){
		int i=1;
		for(;i<=25;i++){
			System.out.println(i);
		}
	}
	public static void boringLoop2(){
		int x = 1;
		while(x<=25){
			System.out.println(x);
			x = x+1;
		}
	}
	public static void multTable(){
		for (int i = 0; i<=9; i++){
			for (int x = 0; x<=9; x++){
				if (x==0){
					System.out.println();
				}
				if(i!=0) {
					System.out.print(x * i + "\t");
				}
			}
		}
	}
	public static void printThemTickets(){
		boolean x = true;
		while(x==true) {
			System.out.println("Print Tickets Started");
			System.out.println("Enter number of tickets");
			Scanner scannerTickNum = new Scanner(System.in);
			int tickNum = scannerTickNum.nextInt();
			System.out.println("Enter Last Name");
			Scanner scannerLastName = new Scanner(System.in);
			String lastName = scannerLastName.nextLine();
			System.out.println("Enter starting number");
			Scanner scannerStartNum = new Scanner(System.in);
			int startNum = scannerStartNum.nextInt();
			System.out.println("Ticket Printout Starting");
			int i = 0;
			String eventName = "Brian Arnold's Rockin' Synth Jams";
			for (;i<tickNum;i++){
				int currentTickNum = startNum+i;
				System.out.println("Ticket: "+lastName.substring(0,4)+", "+currentTickNum+", "+eventName);
			}
			System.out.println("Do you wish to Continue? Y or N");
			String throwAway = scannerStartNum.nextLine();
			Scanner scannercontinue = new Scanner(System.in);
			String choice = scannercontinue.nextLine();
			if (choice.equals("Y")){
				x = true;
			}
			if (choice.equals("N")){
				System.out.println("Ending");
				x = false;
			}
			if(!(choice.equals("N")||choice.equals("Y"))) {
				System.out.println("Invalid, Ending");
				x = false;
			}
		}
	}
}
