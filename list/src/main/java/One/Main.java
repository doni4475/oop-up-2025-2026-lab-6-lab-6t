package One;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Баксик");
        Cat cat = new Cat("Василіса");

        System.out.println(dog.getName() + ": " + dog.makeSound());
        System.out.println(cat.getName() + ": " + cat.makeSound());
    }
}