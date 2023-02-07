package module14;

public class Typer extends Thread {
    static Object text = new Object();
    String msg;

    Typer(String msg) {
        this.msg = msg;
    }

    public void run() {
        synchronized (text) {
            for (int i = 0; i < msg.length(); i++) {
                System.out.println(msg.charAt(i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}
