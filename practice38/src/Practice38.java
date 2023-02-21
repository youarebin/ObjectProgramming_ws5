//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Person one = new Person();
		Person two = new Person();
		Person three = new Person();
		
		one.name = "김동덕";
		two.name = "홍길동";
		three.name = "성춘향";
		one.address = "서울";
		two.address = "경북";
		three.address = "전남";
		
		System.out.print(one.name + " 나이는?");
		one.age = sc.nextInt();
		System.out.print(two.name + " 나이는?");
		two.age = sc.nextInt();
		System.out.print(three.name + " 나이는?");
		three.age = sc.nextInt();
		
		System.out.println("객체별 정보입니다.");
		System.out.println("김동덕: " + one.age + "세, " + one.address);
		System.out.println("홍길동: " + two.age + "세, " + two.address);
		System.out.println("성춘향: " + three.age + "세, " + three.address);
		
		if(one.age > two.age && one.age > three.age)
		{
			if(two.age > three.age)
				System.out.println("나이가 중간인 사람은 " + two.name + "입니다.");
			else
				System.out.println("나이가 중간인 사람은 " + three.name + "입니다.");
		}
		if(two.age > one.age && two.age > three.age)
		{
			if(one.age > three.age)
				System.out.println("나이가 중간인 사람은 " + one.name + "입니다.");
			else
				System.out.println("나이가 중간인 사람은 " + three.name + "입니다.");
		}
		if(three.age > two.age && three.age > two.age)
		{
			if(two.age > one.age)
				System.out.println("나이가 중간인 사람은 " + two.name + "입니다.");
			else
				System.out.println("나이가 중간인 사람은 " + one.name + "입니다.");
		}
		
	}

}
