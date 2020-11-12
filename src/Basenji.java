public class Basenji extends ShowDog{
    public Basenji(String name, int age, double weight){
        super(name, age, weight);
    }
    public Basenji(){
        super();
    }

    @Override public void speak() {
        // empty on purpose since a Basenji does not speak
    }
}
