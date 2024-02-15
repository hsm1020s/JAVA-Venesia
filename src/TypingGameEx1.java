import java.util.*;

class TypingGameEx1 {

    volatile boolean play = true;
    List<String> words = Collections.synchronizedList(new ArrayList<>());
    String[] data = {"태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카"};
    int interval = 300; // 0.3초

    WordGenerator wg = new WordGenerator();

    public static void main(String args[]) {
        TypingGameEx1 game = new TypingGameEx1();
        game.startGame();

        Scanner scanner = new Scanner(System.in);
        while (game.play) {
            if (game.words.size() >= 2) {
                System.out.println("단어를 기다리는 중...");
                try {
                    Thread.sleep(500); // 단어가 추가될 때까지 잠시 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }

            System.out.print(">> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                game.play = false;
                game.wg.interrupt();
                System.out.println("게임을 종료합니다.");
            } else if (game.words.remove(input)) {
                System.out.println(input + "을(를) 제거했습니다.");
                synchronized (game) {
                    game.notify(); // WordGenerator 스레드에 단어가 제거되어 새 단어를 추가할 수 있음을 알림
                }
            } else {
                System.out.println(input + "은(는) 리스트에 없습니다.");
            }
        }
    }

    public void startGame() {
        wg.start();
    }

    class WordGenerator extends Thread {
        public void run() {
            try {
                while (!Thread.interrupted()) {
                    synchronized (TypingGameEx1.this) {
                        if (words.size() >= 2) {
                            System.out.println(words);
                            TypingGameEx1.this.wait(); // 단어가 이미 2개 있으면, 새 단어 추가를 잠시 멈춤
                        }
                        if (play && words.size() < 2) {
                            int randomIndex = (int) (Math.random() * data.length);
                            String newWord = data[randomIndex];
                            words.add(newWord);
                        }
                    }
                    Thread.sleep(interval);
                }
            } catch (InterruptedException e) {
                System.out.println("WordGenerator가 중단되었습니다.");
            }
        }
    }
}
