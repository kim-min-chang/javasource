import java.util.Arrays;

public class CardEx2 {
    public static void main(String[] args) {
        // card 인스턴스를 10개 생성해야된다.

        // Card card1 = new Card("Spade", 1);
        // Card card2 = new Card("Spade", 2);
        // Card card3 = new Card("Spade", 3);
        // Card card4 = new Card("Spade", 4);
        // Card card5 = new Card("Spade", 5);
        // Card card6 = new Card("Spade", 6);
        // Card card7 = new Card("Spade", 7);
        // Card card8 = new Card("Spade", 8);
        // Card card9 = new Card("Spade", 9);
        // Card card10 = new Card("Spade", 10);

        // // 배열 (int는 초기화 안하면 0)
        // int arr[] = new int[3];
        // System.out.println(Arrays.toString(arr));
        // arr[0] = 15;
        // arr[1] = 20;
        // arr[2] = 30;
        // System.out.println(Arrays.toString(arr));

        int arr[] = { 15, 20, 30 };
        System.out.println(Arrays.toString(arr));

        // 객체 배열
        // Card 객체 담기
        // Card cards[] = new Card[3];
        // 초기화 안했을때 null 값으로 나옴
        // System.out.println(Arrays.toString(cards));
        // cards[0] = new Card("spade", 1);
        // cards[1] = new Card("heart", 1);
        // cards[2] = new Card("diamond", 1);
        // System.out.println(Arrays.toString(cards));

        // Card cards[] = {
        // new Card("spade", 1),
        // new Card("heart", 1),
        // new Card("diamond", 1)
        // };
        Card card1 = new Card("spade", 1);
        Card card2 = new Card("heart", 1);
        Card card3 = new Card("diamond", 1);

        Card cards[] = { card1, card2, card3 };

        for (Card card : cards) {
            System.out.println("kind " + card.getKind() + " number " + card.getNumber());
        }
    }

}
