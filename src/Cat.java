public class Cat extends Pet implements Strokeable {
    public Cat(String name, int age, double cost) {
        super(name, age, cost);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " says Meow!");
    }

    @Override
    public void stroke() {
        System.out.println(getName() + " wanders off and ignores you.");
    }
}