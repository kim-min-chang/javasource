package api;

public class StringEx2 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));

    }

    static int count(String src, String target) {
        // src에서 target의 문자열이 몇번 나오는지 카운트 한 후 리턴
        int count = 0;
        int pos = 0;
        // pos = src.indexOf(target); // 5
        // if (pos != -1) count += 1;
        // pos += target.length(); // 7

        // pos = src.indexOf(target, pos); // 9
        // if (pos != -1) count += 1;
        // pos += target.length(); // 11

        // pos = src.indexOf(target);
        // if (pos != -1) count += 1;
        // pos += target.length();

        while ((pos = src.indexOf(target, pos)) != -1) {
            count += 1;
            pos += target.length();
        }
        return count;
    }
}