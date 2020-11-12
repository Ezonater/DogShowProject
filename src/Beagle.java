public class Beagle extends ShowDog{
    public Beagle(String name, int age, double weight){
        super(name, age, weight);
    }

    public Beagle(){
        super();
    }

    @Override public void speak() {
        System.out.println("Howl!");
    }
}
