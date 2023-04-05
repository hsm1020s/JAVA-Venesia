package new_one;

public class Casino_Game {
    Dealer dealer = new Dealer();//게임이 룰이랑 유저 가지고 있어야함
//    User user = new User();
//    Rule rule = new Rule();
    public void play(){
        dealer.dealermixdeck();
      //  dealer.printtmp();
        dealer.giveuser();

        // 룰 객체의 메서드가 딜러와 유저의 카드를 모두 받아준다
        // 카드를 턴마다 받아서 비교후 승자를 찾아낸다.
        // 그 전에 딜러와 유저가 턴을 돌면서 카드를 받아야함.
    }
}
