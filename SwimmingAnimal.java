import java.security.acl.Owner;
import java.time.LocalDate;
import java.util.List;

import codeforces_solutions.Animal;

public class SwimmingAnimal {
    public class SwimmingAnimal extends Animal {
    public SwimmingAnimal(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }
    @Override
    public void swim() {
        System.out.println(this.TYPE + " плавает в воде.");
    }
}
}
