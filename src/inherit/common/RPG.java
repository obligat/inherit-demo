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
        SwordsMan swordsMan = new SwordsMan();
        swordsMan.setName("Lici");
        swordsMan.setBlood(200);
        swordsMan.setLevel(1);

        Magician magician = new Magician();
        magician.setName("Huba");
        magician.setBlood(100);
        magician.setLevel(1);

        showBlood(swordsMan);
        showBlood(magician);

        drawFight(swordsMan);
        drawFight(magician);
    }

    static void showBlood(Role role) {
        System.out.printf("%s blood :%d %n", role.getName(), role.getBlood());
    }

    static void drawFight(Role role) {
        System.out.println(role.getName());
        role.fight();
        role.toString();
    }
}
