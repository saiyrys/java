import java.security.acl.Owner;
import java.time.LocalDate;
import java.util.List;

import codeforces_solutions.Animal;

public class FlyingAnimal {
    public class FlyingAnimal extends Animal {
    public FlyingAnimal(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }
    }
}
