package api;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {

    public static void main(String[] args) {
        // LinkedList 와 ArraryList 수행속도 비교
        ArrayList<String> a1 = new ArrayList<>(2000000);
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("========순차적 추가========");
        System.out.println("ArraryList : " + add1(a1));
        System.out.println("LinkedList : " + add1(linkedList));
        System.out.println();
        System.out.println("======== 중 간 추가========");
        System.out.println("ArraryList : " + add2(a1));
        System.out.println("LinkedList : " + add2(linkedList));
        System.out.println();
        System.out.println("======== 중 간 삭제========");
        System.out.println("ArraryList : " + remove2(a1));
        System.out.println("LinkedList : " + remove2(linkedList));
        System.out.println();
        System.out.println("========순차적 삭제========");
        System.out.println("ArraryList : " + remove1(a1));
        System.out.println("LinkedList : " + remove1(linkedList));
    }

    static long add1(List<String> list) {
        // currentTimeMillis() : millisecond
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i + "");
        }
        long end = System.currentTimeMillis();
        return end - start;

    }

    static long add2(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(500, "X");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    static long remove1(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    static long remove2(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

}
