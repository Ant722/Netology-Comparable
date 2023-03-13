
import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        peoplAdd(people);
        System.out.println(people);
        Collections.sort(people, (o1,o2) -> { int maxWords = 4;
            Set<String> surname1 = new HashSet<>(List.of(o1.getSurname().split("\\P{IsAlphabetic}+")));
            Set<String> surname2 = new HashSet<>(List.of(o2.getSurname().split("\\P{IsAlphabetic}+")));
        if (surname1.size() != surname2.size() && (surname1.size() < maxWords || surname2.size() < maxWords)) {
                return Integer.compare(surname1.size(), surname2.size());
            }
        return o1.getAge() - o2.getAge();
        });
        Collections.reverse(people);
        System.out.println(people);
    }

    private static void peoplAdd(List<Person> people) {
        people.add(new Person("Гильермо", "дель Торо Гомес", 58));
        people.add(new Person("Дмитрий", "Мамин-Сибиряк", 60));
        people.add(new Person("Виктор", "Франкенштейн", 159));
        people.add(new Person("София", "Августа Фредерика Ангальт-Цербстская", 67));
        people.add(new Person("Пабло", "Руис Пикассо", 109));
        people.add(new Person("Уго", "Рафаэль Чавес Фриас ", 59));
        people.add(new Person("Эрнесто", "Гевара де ла Серна", 39));
        people.add(new Person("Серго", "Конокрад", 19));

    }
}