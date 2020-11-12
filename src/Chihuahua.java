public class Chihuahua extends ShowDog{
    public Chihuahua(String name, int age, double weight){
        super(name, age, weight);
    }
    public Chihuahua(){
        super();
    }

    @Override public void speak(){
        super.speak();
        super.speak();
    }
}
