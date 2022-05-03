import java.util.Scanner;

public class stringReverse
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--){
			System.out.print(arr[i]);
		}
		
		
	}
}