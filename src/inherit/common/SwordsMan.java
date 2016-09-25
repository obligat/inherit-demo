
package inherit.common;

public class SwordsMan extends Role {

    @Override
    public String toString() {
        return "swordsMan " + super.toString();
    }

    @Override
    public void fight() {
        System.out.println("Fighting with your sword !");
    }
}
