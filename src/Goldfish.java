public class Goldfish extends Pet {
    public Goldfish(String name, int age, double cost) {
        super(name, age, cost);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("They’re a goldfish!");
    }
}