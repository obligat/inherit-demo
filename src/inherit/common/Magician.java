
package inherit.common;

public class Magician extends Role {

    @Override
    public void fight() {
        System.out.println("Fighting with your magic !");
    }

    public void cure() {
        System.out.println("Cure with your magic .");
    }

    @Override
    public String toString() {
        return "magician " + super.toString();
    }
}
