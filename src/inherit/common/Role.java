
package inherit.common;

public abstract class Role {

    String name;
    protected int level;
    private int blood;

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void fight();
    
    public String toString(){
        return String.format("%s %d %d ",this.name,this.level,this.blood);
    }

}
