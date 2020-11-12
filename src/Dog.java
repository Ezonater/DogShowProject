public class Dog {
    private String name;
    private int age;
    private int medals;
    private double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Dog() {
        this.name = "Unknown";
        this.age = 0;
        this.weight = 0.0;
    }

    public void speak(){
        System.out.println("Woof");
    }

    @Override
    public String toString() {
        return name + ", Age: " + age + ", Weight: " + weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMedals() {
        return medals;
    }

    public void setMedals(int medals) {
        this.medals = medals;
    }

    public void setProperties(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
