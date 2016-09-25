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
public class SwordsMan extends Role {

    @Override
    public String toString(){
        return String.format("swordsMan %s %d %d ", this.name,this.level,this.getBlood());
    }
    
    @Override
    public void fight() {
        System.out.println("Fighting with your sword !");
    }
}
