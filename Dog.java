package codeforces_solutions;

import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal{
    public Dog(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

}