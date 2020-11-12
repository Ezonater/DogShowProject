public class ShowDog extends Dog implements Comparable<ShowDog>{
    private int medals;

    public ShowDog() {
        medals = 0;
    }

    public ShowDog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override public int compareTo(ShowDog other) {
        return (other.medals - medals);
    }

    public int getMedals() { return medals; }

    public void awardMedal() { ++medals; }

    @Override public String toString() {
        return super.toString() + "\nMedals: " + medals + "\n";
    }
}
