import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ComparP implements Comparator<Person> {
    private int maxWords;

    @Override
    public int compare(Person o1, Person o2) {
        Set<String> surname1 = new HashSet<>(List.of(o1.getSurname().split("\\P{IsAlphabetic}+")));
        Set<String> surname2 = new HashSet<>(List.of(o2.getSurname().split("\\P{IsAlphabetic}+")));
        if (surname1.size() != surname2.size() && (surname1.size() < maxWords || surname2.size() < maxWords)) {
            return Integer.compare(surname1.size(), surname2.size());
        }
        return o1.getAge() - o2.getAge();
    }

    public ComparP(int maxWords) {
        this.maxWords = maxWords;
    }
}
