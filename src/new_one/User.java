package new_one;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class User { //implements Cloneable
    Deck deck = new Deck();
    Card[] userCardDeck = new Card[Card.NumberMax]; //카드 저장소

    //@Override
    public String toString(int i) { // 재정의해야함.
        String[] shape = {" ", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK"; //숫자 10은 X로 표현

        System.out.printf("%s", shape[userCardDeck[i].getShape()]);
        System.out.printf(",%c", numbers.charAt(userCardDeck[i].getNubmer()));

        return "";
    }



}


//    Node next;
//    Node previous;
//    Object obj = userCardDeck;
    // 딜러가 카드를 주면 유저끼리 게임을 진행
    // 유저는 카드를 추가로 받는다 (받을수 있다)
    //if()
    // 유저는 카드를 오픈한다.
//유저 무한넥스트로 가다가 턴마다 점수가 가장 높은사람 호출