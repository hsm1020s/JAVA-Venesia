package new_one;

import static java.lang.Integer.valueOf;

public class Bank {
    // 돈이 없는 사람에게 돈을 빌려준다.
    //
    //
    House house = new House();
    Car car = new Car();
    private int money;



    Bank(){
        this(1000000000); // 10억
    }
    Bank(int money){
        this.money=money;
    }

    // 유저 객체가 들어올텐데
    // 어떻게 돈을 주지

    int Loans(User[] user,int index){ //4명 //유저인덱스//
        user[index].usermoney.getMoney();// 돈 가져와서 뭐하게
        //유저 오면 담보 맡기고 돈 주면 됌

        //임시로 리턴값 정해놓음 (
        return valueOf("1");//만드는중
    }
}
