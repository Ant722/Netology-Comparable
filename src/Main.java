
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        peoplAdd(people);
        System.out.println(people);
        Collections.sort(people, new PersonComparator(4).reversed());
        System.out.println(people);
        people.removeIf(person -> person.getAge()<18);
        System.out.println(people);
    }

    private static void peoplAdd(List<Person> people) {
        people.add(new Person("Гильермо", "дель Торо Гомес", 58));
        people.add(new Person("Жук", "Кило эль Грамм ", 9));
        people.add(new Person("Дмитрий", "Мамин-Сибиряк", 60));
        people.add(new Person("Виктор", "Франкенштейн", 159));
        people.add(new Person("София", "Августа Фредерика Ангальт-Цербстская", 67));
        people.add(new Person("Пабло", "Руис Пикассо", 109));
        people.add(new Person("Уго", "Рафаэль Чавес Фриас ", 59));
        people.add(new Person("Эрнесто", "Гевара де ла Серна", 39));
        people.add(new Person("Серго", "Конокрад", 19));
        people.add(new Person("Лис", "Хитрый-хитрый", 3));
        people.add(new Person("Симка", "Васко да Горка", 15));
    }
}