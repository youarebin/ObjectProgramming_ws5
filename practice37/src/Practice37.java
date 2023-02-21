//컴퓨터학과_20220740_가유빈
public class Practice37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane df = new Plane();
		Plane jeju = new Plane();
		Plane seoul = new Plane();
		
		df.id = 0;
		df.model = "모름";
		df.capacity = 0;
		
		jeju.id = 1030615;
		jeju.model = "보잉 737";
		jeju.capacity = 75;
		
		seoul.id = 2464737;
		seoul.model = "보잉 747";
		seoul.capacity = 150;
		
		System.out.println("디폴트 비행기의 정보입니다.");
		System.out.println("식별번호: " + df.id + "편");
		System.out.println("모델: " + df.model);
		System.out.println("승객수: " + df.capacity + "명");
		
		System.out.println("제주행 비행기의 정보입니다.");
		System.out.println("식별번호: " + jeju.id + "편");
		System.out.println("모델: " + jeju.model);
		System.out.println("승객수: " + jeju.capacity + "명");
		
		System.out.println("서울행 비행기의 정보입니다.");
		System.out.println("식별번호: " + seoul.id + "편");
		System.out.println("모델: " + seoul.model);
		System.out.println("승객수: " + seoul.capacity + "명");
	}

}
