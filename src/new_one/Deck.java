package new_one;
public class Deck {
    private final int CardsNumMax=52;
    Card card= new Card(); //사용자정의타입

    Card cardArr[]=new Card[CardsNumMax]; //덱 카드 저장소

    Deck(){
        int i=0;
        for(int k=Card.ShapeMax;k>0;k--){
            for(int n=0;n<Card.NumberMax;n++){
                cardArr[i++] = new Card(k,n+1);
            }//2 forend
        }// 1 forend
    }// Deck생성자


    public int getCardsNumMax() {
        return CardsNumMax;
    }
} //deck end

