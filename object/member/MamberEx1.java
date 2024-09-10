package member;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class MamberEx1 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        // list에 member 추가
        list.add(new Mamber("hong123", "홍길동", "서울", "hong@naver.com"));
        list.add(new Mamber("hong124", "홍길동", "서울", "hong@naver.com"));
        list.add(new Mamber("hong125", "홍길동", "서울", "hong@naver.com"));
        list.add(new Mamber("hong126", "홍길동", "서울", "hong@naver.com"));

        for (Member member : list) {
            System.out.println(member.getId() + "\t");
            System.out.println(member.getName() + "\t");
            System.out.println(member.getAddr() + "\t");
            System.out.println(member.getEmail());
        }
    }

}
