import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        // oldMethod();
        animalSample();
    }

    private static void animalSample() {
        Dog animal1 = new Dog("Buddy", 3, "Labrador");
        System.out.println("Nombre: "+ animal1.getName());
        animal1.makeNoise();
        animal1.eat("Concentrado");
        animal1.bark();
        animal1.sleep();

        Cat animal2 = new Cat("Garfield", 10);
        System.out.println("Nombre: "+ animal2.getName());
        animal2.makeNoise();
        animal2.eat("ratones");
        animal2.scratch();
        animal2.sleep();

    }

    private static void oldMethod() {
        var book1 = new Book();
        var book2 = new Book("Programacion en Java", "Pedro Martinez", 900);
        var book3 = new Book("Learn English", "Jhon Doe", 500,
                LocalDate.of(2015, 10, 22),
                "English School", "Aprendizaje");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        var person = new Person("Cesar", "Diaz");
    }


}
