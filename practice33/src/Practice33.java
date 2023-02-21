//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("가로 입력: ");
		rectangle.width = sc.nextInt();
		System.out.print("세로 입력: ");
		rectangle.height = sc.nextInt();
		
		System.out.println("면적은 " + rectangle.width * rectangle.height + "입니다.");
		System.out.println("면적은 " + (rectangle.width + rectangle.height)*2 + "입니다.");
	}

}
