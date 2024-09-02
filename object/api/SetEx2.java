package api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 1 ~ 46 임의의 숫자 6개 추출
        Set<Integer> set = new HashSet<>();
        while (set.size() < 6) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);

        }
        System.out.println(set); // [23, 7, 40, 26, 28, 15]
        // 정렬 구현되어 있지 않음
        // set.sort() x
        // Collections.sort() x

        // Set => List 변환

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);

    }

}
