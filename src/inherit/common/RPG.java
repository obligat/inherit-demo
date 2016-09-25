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
        Role swordsMan = new SwordsMan();
//    wrong    Magician magician = (Magician) swordsMan;
        swordsMan.setName("Lici");
        swordsMan.setBlood(200);
        swordsMan.setLevel(1);
        System.out.printf("swordsMan : %s , %d , %d %n", swordsMan.getName(), swordsMan.getBlood(), swordsMan.getLevel());
    }

    static void demoMagician() {
        Magician magician = new Magician();
//Exception in thread "main" java.lang.ClassCastException: inherit.common.Role cannot be cast to inherit.common.Magician
// Magician magician =  new Role();
//Magician magician =  (Magician) new Role(); 
        Role role = magician;
        magician.setName("Huba");
        magician.setBlood(100);
        magician.setLevel(1);
        System.out.printf("magician : %s , %d , %d %n", magician.getName(), magician.getBlood(), magician.getLevel());
    }

}
