import java.util.Scanner;
public class HomeworkThree{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Mutq ara mi tiv: ");
		int number = sc.nextInt();
		if (number % 2 == 0){
			System.out.println("Zuyg tiv");
		} else {
			System.out.println("Kent tiv");
		}
		sc.close();
		
	}
}