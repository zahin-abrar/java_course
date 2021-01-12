package chapter10;

public class Zoo {

    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound(); ///Because makesound method is overridden in Dog class
        feed(sasha);

        //Change instantiation
        sasha = new Cat(); // This is legal because dog and cat are both of type animal (inherits). And sasha is specified as type animal.
        sasha.makeSound();
        feed(sasha);

        /*
        Because sasha is of type animal not cat so it does not have access to scratch.
        So can not make direct call to sasha.scratch. Need to typecast in this case.
         */
        ((Cat) sasha).scratch();
        feed(sasha);

    }

    /**
     *
     * @param animal takes an animal. We can pass an animal object or any subclass of animal
     */
    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Dog food");
        }

        else if (animal instanceof Cat) {
            System.out.println("Cat food!");
        }
    }
}
