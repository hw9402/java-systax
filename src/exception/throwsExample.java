package exception;

public class throwsExample {

    void abc() {
        try {
            bcd();
        } catch (InterruptedException e) {
            // 예외 처리 구문
        }
    }

    void bcd() throws InterruptedException {
        Thread.sleep(1000);
    }
}
