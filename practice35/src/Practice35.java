//컴퓨터학과_20220740_가유빈

public class Practice35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount infor = new BankAccount();
		BankAccount infor2 = new BankAccount();

		infor.name = "김동덕";
		infor.accoutNo = "1234-5678";
		infor.balance = 100;
		infor.rate = 0.0;
		
		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		System.out.println("이름 : " + infor.name);
		System.out.println("계좌 번호 : " + infor.accoutNo);
		System.out.println("잔액 : " + infor.balance + "원");
		System.out.println("이자율 : " + infor.rate + "%");
		
		infor2.name = "홍길동";
		infor2.accoutNo = "9999-2531";
		infor2.balance = 2000;
		infor2.rate = 2.15;
		
		System.out.println("\n두 번째 은행 계좌의 정보입니다.");
		System.out.println("이름 : " + infor2.name);
		System.out.println("계좌 번호 : " + infor2.accoutNo);
		System.out.println("잔액 : " + infor2.balance + "원");
		System.out.println("이자율 : " + infor2.rate + "%");
	}

}
