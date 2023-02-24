
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        peoplAdd(people);
        System.out.println(people);
        Collections.sort(people, new ComparP(4).reversed());
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