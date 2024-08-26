// this : 자기자신
// super : 부모

public class Student {
    // 속성
    // 학번 s12345678
    // 이름 홍길동
    // 주소 서울시 종로구
    // 핸드폰 010-1234-1234

    private String id;
    private String name;
    private String address;
    private String mobile;

    // 생성자
    // 클래스 이름(){}
    // 생성자를 명시하지 않는다면 컴파일러가 default 생성자를 자동으로 생성함
    // 생성자의 목적
    // 인스턴스 초기화 메서드

    // 생성자 오버로딩

    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name) {
        // this.id = id;
        this(id);
        this.name = name;
    }

    public Student(String id, String name, String address) {
        // this.id = id;
        // this.name = name;
        this(id, name);
        this.address = address;
    }

    public Student(String id, String name, String address, String mobile) {
        // this.id = id;
        // this.name = name;
        // this.address = address;
        this(id, name, address);
        this.mobile = mobile;
    }

    // 메소드
    // 특정 작업을 수행하는 일련의 문장들을 하나로 묶는것
    // 재사용성, 중복된 코드 제거, 프로그램 구조 구조화

    // return 메소드명(){}
    // 정수형, 실수형, 논리형, 문자형, 배열, void
    public String getName() {
        return name;
    }

}
