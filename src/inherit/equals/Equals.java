package inherit.equals;

public class Equals {
    
    private String name;
    private String birthday;
    
    public Equals(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getName() {
        return name;
    }
    
    public String getBirthday() {
        return birthday;
    }
    
    public static void main(String[] args) {
        Equals one = new Equals("a", "1");
        Equals two = new Equals("b", "3");
        System.out.println(one.equals(two));
    }
}
