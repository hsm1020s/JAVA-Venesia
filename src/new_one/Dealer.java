package new_one;


public class Dealer{
   // LinkedList list = new LinkedList();
    Deck deck = new Deck(); //deck 에 cardArr에 있는것을 다 여기로 가져와야함
    User[] user = new User[Card.ShapeMax]; //4명
    Rule rule = new Rule(); //룰체크 객체
    Card[] dealerCardDeck = new Card[deck.getCardsNumMax()]; //딜러 덱 저장소
    public Dealer() { //덱에 있는 모든 카드들 옮김
        System.arraycopy(deck.cardArr, 0, dealerCardDeck, 0, deck.getCardsNumMax());
        for (int i = 0; i < user.length; i++) {
            user[i]=new User();
            for(int j=0;j<Card.NumberMax;j++){
                user[i].userCardDeck[j]=new Card();
            }
        }
    }
    public void giveuser(){
        int count=0;
        for(int i=0;i<Card.NumberMax;i++){ //13번
            for(int j=0;j<Card.ShapeMax;j++){
                user[j].userCardDeck[i].setNubmer(dealerCardDeck[count].getNubmer());// 널포인터
                user[j].userCardDeck[i].setShape(dealerCardDeck[count].getShape());// 널포인터
                // 4*13 장 있음 = 52장 있음
                // i는 0~12까지 j는 0~3까지 반복 -> 4명한테 한번씩 준다
                //System.out.println(user[j].userCardDeck[i].getNubmer());
                count++;
            }
            rule.check(user,i);
        }
    }
//    public void Linked_usersetting(){
//
//        for (int i = 0; i < Card.ShapeMax; i++) {
//            list.add(user[i]);
//        } //유저객체 다 넣음
//        System.out.println(list.get(2));
//        //유저객체 넣지않아서 null로 나옴
//        //유저객체 넣고 뭐로 접근 ?
//    } //딜러객체에서 유저에게 전달 (next->반복->



    public void dealermixdeck() {
        Card temp = null;
        for (int i = 0; i < deck.getCardsNumMax(); i++) {
            int index = (int) (Math.random() * (deck.getCardsNumMax() - 1)) + 1; // 1~52까지
            temp = dealerCardDeck[i];
            dealerCardDeck[i] = dealerCardDeck[index];
            dealerCardDeck[index] = temp;
        }
    }

    public void printtmp() {
        for (int i = 0; i < deck.getCardsNumMax(); i++) {
            System.out.println(dealerCardDeck[i].toString());
        }

    } // number shape 말고 문자열로 출력해야함

    @Override
    public String toString() {
        String[] shape = {" ", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK"; //숫자 10은 X로 표현
        for (int i = 0; i < deck.getCardsNumMax(); i++) {
            System.out.printf("number :%c", numbers.charAt(dealerCardDeck[i].getNubmer()));
            System.out.printf("shape  :%s\n", shape[dealerCardDeck[i].getShape()]);
        }
        return "";
    }
}//딜러 클래스 끝