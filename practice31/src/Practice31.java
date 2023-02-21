//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Date date;
		date = new Date();
		
		System.out.print("태어난 년도를 입력하세요: ");
		date.year = sc.nextInt();
		System.out.print("태어난 월를 입력하세요: ");
		date.month = sc.nextInt();
		System.out.print("태어난 날짜를 입력하세요: ");
		date.day = sc.nextInt();
		
		System.out.print("당신의 생일은 " + date.year + "년 " + date.month + "월 " + date.day + "일 입니다.");
	}

}
