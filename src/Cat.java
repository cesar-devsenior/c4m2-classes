public class Cat extends Animal {

    public Cat(String name, Integer age) {
        super(name, age);
    }

    public void eat(String food) {
        System.out.println(getName() + " está comiendo " + food);
    }

    public void scratch() {
        System.out.println("Lo dañé");
    }

    @Override
    public void makeNoise() {
        System.out.println("Miau");
    }

}
