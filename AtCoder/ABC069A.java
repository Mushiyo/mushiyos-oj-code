import java.util.Scanner;

public class ABC069A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int m = input.nextInt();
			
			System.out.println((n - 1) * (m - 1));
		}

	}

}
