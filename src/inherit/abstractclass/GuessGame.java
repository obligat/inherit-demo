
package inherit.abstractclass;

public abstract class GuessGame {

    public void go() {
        int number = (int) (Math.random() * 10);
        int guess;
        do {
            print("Please input number to guess :");
            guess = nextInt();
        } while (guess != number);
        println("You guessed it !");
    }

    public void println(String text) {
        print(text + "\n");
    }

    public abstract void print(String text);

    public abstract int nextInt();
}
