import java.util.Scanner;
public class HomeworkTwo {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("mutq ara 1-ic minchev 10-y cankacac tiv - ");
		
		int number = sc.nextInt();
		
		if(number > 0 && number < 10) {
			System.out.println(number*number);
		}else {
			System.out.println("Sxal haxordagrutyun");
		}
		sc.close();
	}
}