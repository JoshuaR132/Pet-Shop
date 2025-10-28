public class Dog extends Pet implements Strokeable {
    public Dog(String name, int age, double cost) {
        super(name, age, cost);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " says Woof!");
    }

    @Override
    public void stroke() {
        System.out.println(getName() + " enjoys being stroked.");
        makeNoise();
    }
}