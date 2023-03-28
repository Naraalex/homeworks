import java.util.Scanner;
public class HomeworkOne{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Mutq ara cankacac tiv: ");
		int n = sc.nextInt();
		if(n < 1){
			System.out.println("Vochinch chtpel");
		} else if (n > 10) {
			n = 10;
		}
			
		for (int i = 0; i < n; i++){
			System.out.println("My name is Narine");
		}
	}
}