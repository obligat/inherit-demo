package inherit.equals;

public class Cat {

    private String name;
    private String birthday;
    
    public Cat(String name, String birthday){
        this.name=name;
        this.birthday=birthday;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public  boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof Cat)) {
            return false;
        }

        Cat cat = (Cat) other;

        if (!getName().equals(cat.getName())) {
            return false;
        }

        if (!getBirthday().equals(cat.getBirthday())) {
            return false;
        }
        return true;
    }
    
    public static void main(String [] args ){
        
        Cat cat1 = new Cat("mao","1990-1-2");
        Cat cat2 = new Cat("mao","1990-1-2");
        Cat cat3 = new Cat("mi","1998-2-3");
        
        System.out.println(cat1.equals(cat2));
    }
}
