//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		
		System.out.println("첫 번째 사각형의 정보를 입력하세요.");
		System.out.print("가로 입력: ");
		rectangle.width = sc.nextInt();
		System.out.print("세로 입력: ");
		rectangle.height = sc.nextInt();
		System.out.println("두 번째 사각형의 정보를 입력하세요.");
		System.out.print("가로 입력: ");
		rectangle2.width = sc.nextInt();
		System.out.print("세로 입력: ");
		rectangle2.height = sc.nextInt();
		
		System.out.println("첫 번째 사각형의 면적은 " + rectangle.width * rectangle.height + "입니다.");
		System.out.println("첫 번째 사각형의 둘레는 " + (rectangle.width + rectangle.height)*2 + "입니다.");
		System.out.println("두 번째 사각형의 면적은 " + rectangle2.width * rectangle2.height + "입니다.");
		System.out.println("두 번째 사각형의 둘레는 " + (rectangle2.width + rectangle2.height)*2 + "입니다.");
	}

}
