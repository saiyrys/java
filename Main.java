package codeforces_solutions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner alex = new Owner("Alexey");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));
        
        Animal barsik = new Cat("barsik", 10.0, alex, LocalDate.now(), List.of(chumka), Color.BLACK, "siamskiy");
        System.out.println(barsik.getName());
        System.out.println(barsik.getVaccinations());
        barsik.setVaccinations(List.of(chumka, new Vaccination("столбняк", LocalDate.now())));
        System.out.println(barsik.getVaccinations());
        
        Dog barbos = new Dog("barbos", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE);

        FlyingAnimal bird = new FlyingAnimal("eagle", 5.0, alex, LocalDate.now(), null, Color.BLACK);
        bird.fly(); // Выведет сообщение, что орел летит
        
        SwimmingAnimal fish = new SwimmingAnimal("goldfish", 0.2, alex, LocalDate.now(), null, Color.ORANGE);
        fish.swim(); // Выведет сообщение, что золотая рыбка плавает
        
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(barbos);
        animals.add(bird);
        animals.add(fish);
        
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                System.out.println(((Cat) animal).getBreed());
            }
            System.out.println(animal.getName());
        }
        
        barsik.lifeCycle();
    }
}
