package new_one;

public class Money {
    //돈 객체
    // 돈을 생성한다.
    // 돈을 준다
    private int money;

    Money(){
        this(100000000); //1억
    }
    Money(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
