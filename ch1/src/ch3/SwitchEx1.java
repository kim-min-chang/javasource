package ch3;

public class SwitchEx1 {
    public static void main(String[] args) {
        // switch : if ~else if ~else 대체 가능

        // break 가 없다면 다음 케이스로 계속 이어감(break있는 곳까지)
        int random = (int) (Math.random() * 6) + 1;

        switch (random) {
            case 1: // random == 1
                System.out.println("주사위 1 나옴");
                break;
            case 2: // random == 2
                System.out.println("주사위 2 나옴");
                break;
            case 3: // random == 3
                System.out.println("주사위 3 나옴");
                break;
            case 4: // random == 4
                System.out.println("주사위 4 나옴");
                break;
            case 5: // random == 5
                System.out.println("주사위 5 나옴");
                break;
            default: // else
                System.out.println("주사위 6 나옴");
                break;
        }
    }

}
