/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit.common;

/**
 *
 * @author dujinqiao
 */
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
