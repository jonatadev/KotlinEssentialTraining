public class Animal {
    private final String name;
    private final String kind;
    private final Integer weight;

    public Animal(String name, String kind, Integer weight) {
        this.name = name;
        this.kind = kind;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public Integer getWeight() {
        return weight;
    }

    public String show() {
        return name 
             + " is a " 
             + kind 
             + " and weights " 
             + weight 
             + " lbs."; 
    }
    
}
