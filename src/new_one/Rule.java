package new_one;

public class Rule {
    public void check(User[] user,int index) { //유저랑 카드덱인덱스번호 들어옴
        int rank=0,count=0;
        System.out.println();
        //System.out.println(index+"번 작동 +");

        //랭크가 초기화되었고 랭크에는 각 유저당 최대값을 저장해야함
        for (int i = 0; i < user.length; i++) { // 최대값 저장 반복문
            if(rank<=user[i].userCardDeck[index].getNubmer()){
                rank=user[i].userCardDeck[index].getNubmer();
                count=i; //랭크의 교체가 발생할때마다 i값 변경 ???
            }
//            System.out.printf("모양%s",user[i].userCardDeck[index].getShape());
//            System.out.printf(" , 숫자 user[%d] = %d\n",i,user[i].userCardDeck[index].getNubmer());
            System.out.printf("user[%d]=",i);
            System.out.println(user[i].toString(index));
        }
        //최고값을 가지고있는 유저를 찾아야함.
        System.out.printf("%d 번쨰 유저가 이겼습니다. %d점\n",count+1,rank);



    }//check end
}
//        for (int i = 0; i < user.length; i++) {
//            if(rank[i]<=user[i].userCardDeck[index].getNubmer()){
//                rank[i]=user[i].userCardDeck[index].getNubmer();
//                System.out.println("rank[i] = " + rank[i]);
//            }
//        }
//        System.out.print("===========================");
//        for (int j = 0; j < user.length; j++) {
//            if(rank[j]==user[j].userCardDeck[index].getNubmer()){
//                System.out.println();
//                System.out.println(rank[j]+"ㅇㅇㅇ");
//                System.out.printf("%d번쨰 유저가 이번 라운드에서 이겼습니다.\n",j+1);
//                System.out.print("===========================");
//                break;
//            }
//
//        }//end for