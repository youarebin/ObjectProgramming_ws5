//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Date birthday = new Date();
		Date adultday = new Date();
		
		System.out.print("태어난 년도를 입력하세요: ");
		birthday.year = sc.nextInt();
		System.out.print("태어난 월를 입력하세요: ");
		birthday.month = sc.nextInt();
		System.out.print("태어난 날짜를 입력하세요: ");
		birthday.day = sc.nextInt();

		adultday.year = birthday.year + 20;
		adultday.month = birthday.month;
		adultday.day = birthday.day;
		
		System.out.println("당신의 생일은 " + birthday.year + "년 " + birthday.month + "월 " + birthday.day + "일 입니다.");
		System.out.println(" 당신의 성년일은 " + adultday.year + "년 " + adultday.month + "월 " + adultday.day + "일 입니다.");
		System.out.println("당신의 생일은 " + birthday.year + "년 " + birthday.month + "월 " + birthday.day + "일 입니다.");

	}

}
