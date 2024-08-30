package api;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        // java.lang.String
        // - 변경이 불가능한(immutable) 클래스
        // 한번 생성된 인스턴스는 읽기만 가능한 상태

        String str = "a";
        str = str + "bcd"; // 기존의 str 을 파괴하고 다시 인스턴스 생성 후 연결
        String str5 = "fg";
        str = str + str5; // 기존의 str 을 파괴하고 다시 인스턴스 생성 후 연결

        // 문자열 변경이 가능
        // java.lang.StringBuilder
        // java.lang.StringBuffer

        // 문자열 리터럴 지정 : 저장이 된 후 동일한 문자열이 들어오는 경우에는 한번만 저장이 됨.
        String str1 = "abc";
        String str4 = "abc";
        // 생성자 사용
        String str2 = new String("abc");
        char ch[] = { 'a', 'b', 'c' };
        String str3 = new String(ch);

        System.out.println(str1 == str4); // true
        System.out.println(str1 == str2); // false

        // 1. 문자열 비교 : equals
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4)); // equalsIgnoreCase : 대소문자 구분 x

        // 2. charAt(int index)
        System.out.println("charAt(1) : " + str1.charAt(1)); // b

        str1 = new String("Hello!! Java");

        // 3. length()
        System.out.println("str1 길이 " + str1.length());

        // str1 ==> char배열로 변환
        // [H, e, l, l,o....]
        char ch1[] = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            ch1[i] = str1.charAt(i);
        }
        System.out.println(Arrays.toString(ch1));

        // 4. toCharArray() : 문자열을 char 배열로 변환
        char ch2[] = str1.toCharArray();
        System.out.println(Arrays.toString(ch2));

        // 5. indexof(찾을문자) : 주어진 문자의 시작 위치 리턴 / 못찾으면 : -1 => index는 0부터 시작
        // 5. indexof(찾을문자,시작위치) : 주어진 문자의 시작 위치 리턴 / 못찾으면 : -1 => index는 0부터 시작
        System.out.println("indexof(e) : " + str1.indexOf("e"));
        System.out.println("indexof(Java) : " + str1.indexOf("Java"));
        System.out.println("indexof(b) : " + str1.indexOf("b"));
        System.out.println("indexof(e) : " + str1.indexOf('e'));
        System.out.println("indexof(e) : " + str1.indexOf('e', 4));

        // 6. lastIndexOf(찾을문자) : 주어진 문자의 끝위치 리턴
        System.out.println("lastIndexOf(e) : " + str1.lastIndexOf("e"));
        System.out.println("lastIndexOf(Java) : " + str1.lastIndexOf("Java"));

        // 7. contains(문자열) : 문자열이 포함되어 있는지 확인
        System.out.println("contains(e) : " + str1.contains("e"));
        System.out.println("contains(f) : " + str1.contains("f"));

        // 8. startsWith(문자열) / endsWith(문자열) : 지정된 문자열로 시작/끝 나는지 확인 후 true / false
        str2 = "Java.lang.String";
        System.out.println("startsWith(Java) : " + str2.startsWith("Java"));
        System.out.println("startsWith(lang) : " + str2.startsWith("lang"));
        str3 = "file.txt";
        System.out.println("endsWith(txt) : " + str3.endsWith("txt"));

        // 9. concat(문자열) : 문자열 뒤로 연결
        System.out.println("concat(str2) : " + str1.concat(str2));

        // 10. replace(old문자, new문자) : old 문자를 new 문자열로 변경 후 새로운 문자열로 리턴 -> 원본은 변화 X
        str1 = "Hellollo";
        System.out.println("replace(str1) : " + str1.replace("ll", "LL")); // HeLLoLLo
        System.out.println("replaceAll(str1) : " + str1.replaceAll("ll", "LL")); // HeLLoLLo
        System.out.println("replaceFrist(str1) : " + str1.replaceFirst("ll", "LL")); // HeLLollo => 제일 처음 찾은것만
        System.out.println(str1);// Hellollo

        // 11. split("패턴 or 분리기호") : 문자열을 분리자로 나누어 문자 배열로 리턴
        String animals = "cat,dog,bear";
        String[] arr = animals.split(",");
        for (String s : arr) {
            System.out.println(s); // cat/ dog / bear
        }
        arr = animals.split(",", 2); // limit의 영향으로 2개로 분리
        for (String s : arr) {
            System.out.println(s); // cat / dog,bear
        }

        // 12. substring(시작위치) : 시작위치부터 끝까지 잘라내기
        // 12. substring(시작위치, 끝위치) : 시작위치포함, 끝위치의 문자는 포함되지 않음
        str1 = "java.lang.Object";
        System.out.println("substring(시작위치) : " + str1.substring(10));
        System.out.println("substring(시작위치, 끝위치) : " + str1.substring(5, 9));

        // 13. toUpperCase() / toLowerCase() : 대문자 / 소문자 로 변환
        System.out.println("toUpperCase() :" + str1.toUpperCase());
        System.out.println("toLowerCase() :" + str1.toLowerCase());

        // 14. trim() : 양쪽 공백만 제거(가운데 공백은 제거 X)
        // " Hello World ".equals("Hello World") -> false
        // "Hello World ".equals("Hello World") -> false
        str1 = "               Hello World                ";
        System.out.println(str1);
        System.out.println(str1.trim());

        // 15. valueOf() : 기본형(char, int, float, double, boolean) 값들을 String으로 변환
        System.out.println("String.valueOf(0) : " + String.valueOf(0)); // 0 => "0"
        System.out.println("String.valueOf(true) : " + String.valueOf(true)); // true => "true"
        System.out.println("String.valueOf(10.5) : " + String.valueOf(10.5)); // 10.5 => "10.5"

        int i = 100;
        String newStr = String.valueOf(i); // 성능은 valueOf 가 좋긴 하나 편리함을 따지면 +"" 더 많이 사용함
        newStr = i + "";

        // Integer.parseInt("33")
        // String 을 기본형 값으로 변환 => "100" -> 100
        int j = Integer.parseInt(newStr);
        System.out.println("j =  " + j);

        // NumberFormatException
        // j = Integer.parseInt("33.5");
        double d = Double.parseDouble("33.5");
        System.out.println("d = " + d);

        // "true" => true
        boolean b = Boolean.parseBoolean("true");
        System.out.println("b = " + b);

        // int(기본타입) => Integer(참조타입)
        // float => Float / boolean => Boolean / double => Double / char => Character
        float f1 = 3.14f;
        Float f2 = 3.14f;

        str1 = "Hello World";
        // 거꾸로 출력
        // dlroW olleH
        for (int k = str1.length() - 1; k >= 0; k--) {
            System.out.print(str1.charAt(k));
        }

        System.out.println();

        // reverse()
        StringBuffer sb = new StringBuffer(str1);
        System.out.println(sb.reverse());

    }

}
