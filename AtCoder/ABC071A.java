import java.util.Scanner;

public class ABC071A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int x = input.nextInt();
			int a = input.nextInt();
			int b = input.nextInt();
			
			if(Math.abs(x - a) < Math.abs(x - b)){
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		}

	}

}
