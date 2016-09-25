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
public class RPG {

    public static void main(String[] args) {
        demoSwordsMan();
        demoMagician();
    }

    static void demoSwordsMan() {
        SwordsMan swordsMan = new SwordsMan();
        swordsMan.setName("Lici");
        swordsMan.setBlood(200);
        swordsMan.setLevel(1);
        System.out.printf("swordsMan : %s , %d , %d %n", swordsMan.getName(), swordsMan.getBlood(), swordsMan.getLevel());
    }

    static void demoMagician() {
        Magician magician = new Magician();
        magician.setName("Lici");
        magician.setBlood(200);
        magician.setLevel(1);
        System.out.printf("magician : %s , %d , %d %n", magician.getName(), magician.getBlood(), magician.getLevel());
    }

}
