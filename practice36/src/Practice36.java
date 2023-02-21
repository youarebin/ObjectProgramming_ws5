//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Movie movie1 = new Movie();
		Movie movie2 = new Movie();
		
		System.out.println("영화정보를 입력하세요.");
		System.out.print("영화제목은? ");
		movie1.title = sc.next();
		System.out.print("평점은? ");
		movie1.score = sc.nextInt();
		System.out.print("감독은? ");
		movie1.director = sc.next();
		System.out.print("개봉 년도는? ");
		movie1.year = sc.nextInt();
		
		System.out.println("\n영화정보를 입력하세요.");
		System.out.print("영화제목은? ");
		movie2.title = sc.next();
		System.out.print("평점은? ");
		movie2.score = sc.nextInt();
		System.out.print("감독은? ");
		movie2.director = sc.next();
		System.out.print("개봉 년도는? ");
		movie2.year = sc.nextInt();
		
		System.out.println("\n입력한 영화의 정보입니다.");
		System.out.println("제목: " + movie1.title);
		System.out.println("평점: " + movie1.score);
		System.out.println("감독: " + movie1.director);
		System.out.println("개봉년도: " + movie1.year + "년");
		
		System.out.println("\n입력한 영화의 정보입니다.");
		System.out.println("제목: " + movie2.title);
		System.out.println("평점: " + movie2.score);
		System.out.println("감독: " + movie2.director);
		System.out.println("개봉년도: " + movie2.year + "년");
		//score
		if(movie1.score > movie2.score)
			System.out.println("\n영화 " + movie1.title + "이 영화 " + movie2.title + "보다 평점이 높습니다.");
		else if(movie1.score == movie2.score)
			System.out.println("\n영화 " + movie1.title + "이 영화 " + movie2.title + "와 평점이 같습니다.");
		else
			System.out.println("\n영화 " + movie1.title + "이 영화 " + movie2.title + "보다 평점이 낮습니다.");
		//year
		if(movie1.year > movie2.year)
			System.out.println("영화 " + movie1.title + "이 영화 " + movie2.title + "보다 나중에 개봉되었습니다.");
		else if(movie1.year == movie2.year)
			System.out.println("영화 " + movie1.title + "이 영화 " + movie2.title + "와 같은 년도에 개봉되었습니다.");
		else
			System.out.println("영화 " + movie1.title + "이 영화 " + movie2.title + "보다 먼저 개봉되었습니다.");
	}

}
