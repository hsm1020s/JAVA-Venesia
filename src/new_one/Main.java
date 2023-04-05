package new_one;
public class Main {
    public static void main(String[] args) {
        Casino_Game blackjack = new Casino_Game();
        try {
            blackjack.play(); //게임실행
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println(e.getMessage()+" 널포인터예외");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage()+" 나머지예외");
        }

    }
}