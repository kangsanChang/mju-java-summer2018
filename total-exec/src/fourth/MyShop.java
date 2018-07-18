package fourth;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	// 등록 회원
	private User users[] = new User[2];
	// 상품 정보
	private Product products[] = new Product[4];
	// 장바구니
	private ArrayList<Product> cart = new ArrayList<>();
	
	private Scanner scan = new Scanner(System.in);
	
	// 선택된 사용자의 인덱스 번호 저장
	private int selUser;
	// 쇼핑몰 이름
	private String title;
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}
	// 쇼핑몰 프로그램의 메인 기능

	@Override
	public void start() {
		System.out.println(title + " : 메인 화면 - 계정 선택");
		System.out.println("==============================");
		int i = 0;
		
		// 등록한 사용자 정보 출력
		for(User u : users) {
			System.out.printf("[%d]%s(%s)\n", i++, u.getuName(), u.getPayType());
		}
		
		System.out.println("[x] 종 료");
		System.out.print("선택 : ");
		String sel = scan.next();
		System.out.println("## "+ sel + "선택 ##");
		
		// 선택한 메뉴 처리
		switch(sel) {
		case "x":
			System.exit(0); break;
		default:
			selUser = Integer.parseInt(sel);// 사용자 번호 입력
			productList();
		}
	}

	@Override
	public void productList() {
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("==============================");
		int i = 0;
		
		// 등록한 상품의 정보 출력
		for(Product p : products) {
			System.out.print("["+i+"]");
			p.printDetail();
			System.out.println(); // 임시로 추가함
			i++;
		}
		
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		System.out.print("선택 : ");
		String sel = scan.next();
		System.out.println("## "+ sel + "선택 ##");
		
		// 선택한 메뉴에 따라 처리
		switch(sel) {
		case "h" :
			start(); break;
		case "c" :
			checkOut(); break;
		default:
			// 사용자가 선택한 상품번호(문자열)을 정수(int)로 변환
			int psel = Integer.parseInt(sel);
			//장바구니(ArrayList)에 선택한 상품 추가 
			cart.add(products[psel]);
			productList(); // 지가 지를 막판에 한번 더 부름
		}
	}

	@Override
	public void checkOut() {
		System.out.println(title + " : 체크아웃");
		System.out.println("===============================");
		int total = 0; // 장바구니 총액
		int i = 0;
		
		// 장바구니 안의 모든 상품 출력
		for(Product p : cart ) {
			System.out.printf("[%d]%s(%s)\n", i++, p.getpName(), p.getPrice());
			total += p.getPrice();
		}
		System.out.println("===============================");
		
		// 사용자가 선택한 결제 방법 출력
		System.out.println("결제 방법: " + users[selUser].getPayType());
		
		// 장바구니 가격 합계
		System.out.println("합계: "+ total + " 원 입니다.");
		System.out.println("[p]이전, [q]결제 완료");
		System.out.print("선택 : ");
		String sel = scan.next();
		
		// 메뉴 선택 처리
		switch(sel) {
		case "q":
			System.out.println("## 결제가 완료 되었습니다. 종료합니다. ##");
			System.exit(0);
			break;
			
		case "p":
			productList();
			break;
			
		default :
			checkOut();
		}
	}

	@Override
	public void genUser() {
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("김철수", PayType.CASH);
	}

	@Override
	public void genProduct() {
		products[0] = new CellPhone("갤노트7", 900000, "SKT");
		products[1] = new CellPhone("아이폰7", 1000000, "KT");
		products[2] = new SmartTV("삼성 3D Smart TV", 5000000, "4K");
		products[3] = new SmartTV("LG Smart TV", 4000000, "Full HD");
	}
}
