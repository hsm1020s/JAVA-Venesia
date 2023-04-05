package new_one;

public class Card {
    static final int ShapeMax = 4;
    static final int NumberMax = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    private int shape;
    private int number;

    public int getShape() {
        return shape;
    }

    public void setShape(int shape) {
        this.shape = shape;
    }

    public int getNubmer() {
        return number;
    }

    public void setNubmer(int nubmer) {
        this.number = nubmer;
    }

    public Card() { //기본값 생성자
        this(SPADE, 1);
    }

    public Card(int shape, int nubmer) { //생성자
        this.shape = shape;
        this.number = nubmer;
    }

    @Override
    public String toString(){
        String[] shape = {" ","CLOVER","HEART","DIAMOND","SPADE"};
        String numbers = "0A23456789XJQK"; //숫자 10은 X로 표현
        return "kind :"+ shape[this.shape]+", number : "+numbers.charAt(this.number) ;
    }
}
