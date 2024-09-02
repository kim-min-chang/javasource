package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop2 implements Ishop {
    Scanner sc = new Scanner(System.in);

    private String title;

    // User 리스트 생성
    List<User> users = new ArrayList<>();

    // 상품 리스트 생성
    List<Product> products = new ArrayList<>();

    // cart 리스트 생성
    List<Product> cart = new ArrayList<>();

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // user 2명을 생성 후 users 배열 담기
        users.add(new User("홍길동", PayType.CARD));
        users.add(new User("성춘향", PayType.CASH));
    }

    @Override
    public void genProduct() {
        // Cellphone, SmartTv 5개 생성 후 products 배열 담기
        products.add(new CellPhone("아이폰13", 1500000, "KT"));
        products.add(new CellPhone("갤럭시 노트13", 1200000, "SKT"));
        products.add(new CellPhone("갤럭시 Z 플립", 1300000, "LG"));
        products.add(new SmartTv("삼성 울트라 HD", 1800000, "4k"));
        products.add(new SmartTv("LG 스마트", 1400000, "1080p"));

    }

    // 선택된 user의 index보관
    // User owner[] = new User[1];
    private int selUser;

    @Override
    public void start() {
        // 출력
        // Myshop : 메인 화면 - 계정선택
        // =============================
        // [1] 홍길동(CARD)
        // [2] 성춘향(CASH)
        // [x] 종료
        // 선택
        System.out.printf("%s : 메인화면 - 계정선택\n", title);
        System.out.println("===============================");
        // int i = 0;
        // for (User users : users) {
        // if (users != null) {
        // System.out.printf("[%d] %s (%s)\n", i + 1, users.getName(),
        // users.getPayType());
        // i++;
        // }
        // }
        for (int i = 0; i < users.size(); i++) {
            System.out.printf("[%d] %s (%s)\n", i + 1, users.get(i).getName(), users.get(i).getPayType());
        }
        System.out.println("[X] 종료");
        System.out.print("선택 >> ");
        String input = sc.nextLine();
        // owner[0] = users[Integer.parseInt(input)];
        switch (input) {
            case "1":
            case "2":
                selUser = Integer.parseInt(input) - 1;
                productlist();
                break;
            case "X":
            case "x":
                System.exit(0);
                break;

            default:
                System.out.println("입력을 확인해 주세요");
                start();
                break;
        }
        // 사용자 입력 : 1, 2, X
        // 사용자 입력이 1,2 인 경우 productlist()호출
        // X인 경우 : System.exit(0)

    }

    public void productlist() {
        // 출력
        // Myshop : 상품 목록 - 상품선택
        // =============================
        // [1] 상품
        // [2] 상품
        // [3][5]
        // [h] 메인화면
        // [c] 체크아웃
        // 선택>>
        System.out.printf("%s : 상품목록 - 상품선택\n", title);
        System.out.println("===============================");
        int i = 0;
        for (Product product : products) {
            System.out.printf("%d", i++);
            product.printDetail();
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("선택 >>");

        // for (int i = 0; i < products.length; i++) {
        // if (products[i].carrier != null) {
        // System.out.printf("[%d]%s 가격 : %d, 통신사 : %s\n", i + 1,
        // products[i].getpName(), products[i].getPrice(),
        // products[i].carrier);
        // } else {
        // System.out.printf("[%d]%s 가격 : %d, 해상도 : %s\n", i + 1,
        // products[i].getpName(), products[i].getPrice(),
        // products[i].resolution);
        // }
        // }

        // 메뉴받기
        // 0~4 or h or c
        // h : 메인화면 - 계정선택 호출
        // c : checkOut(){} 호출
        // 0~4 : cart 에 담기 공간 10개

        String input = sc.nextLine();
        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                int no = Integer.parseInt(input);
                cart.add(products.get(no));
                productlist();
                break;
            case "c":
            case "C":
                checkOut();
                break;
            case "h":
            case "H":
                start();
                break;
            default:
                System.out.println("입력을 확인해 주세요");
                productlist();
                break;
        }
    }

    public void checkOut() {
        // cart 화면에 출력
        int i = 0;
        // System.out.println(title + owner[0].getName() + " : 체크아웃");
        System.out.println(title + users.get(selUser).getName() + " : 체크아웃");
        System.out.println("===============================");
        int sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getpName(), product.getPrice());
                sum += product.getPrice();
            }

        }

        // System.out.println("결제 방법 = " + owner[0].getPayType());
        // 결제 방법 : CARD or CASH
        // 합계 금액
        // [p] 이전
        // [q] 결제완료
        // 입력값에 따라
        // p : 상품 목록 화면 보여주기
        // q : 종료
        System.out.println("결제 방법 : " + users.get(selUser).getPayType());
        System.out.println("합계 금액 = " + sum);
        System.out.println("[p] 이전");
        System.out.println("[q] 결제완료");
        String pay = sc.nextLine();
        switch (pay) {
            case "p":
            case "P":
                productlist();
                break;
            case "q":
            case "Q":
                System.exit(0);
                break;
            default:
                System.out.println("입력을 확인해 주세요");
                checkOut();
                break;
        }
    }

}