package new_one;
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        try {
            game.play(); //게임실행
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println(e.getMessage()+" 널포인터예외");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage()+" 나머지예외");
        }

    }
}