package se.lexicon;

import se.lexicon.model.Car;

import java.util.*;

public class CollectionExercises {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();
        ex11();
        ex12();
    }

    public static void ex1() {
        ArrayList<String> weeksList = new ArrayList<>();
        weeksList.add("Monday");
        weeksList.add("Tuesday");
        weeksList.add("Wednesday");
        weeksList.add("Thursday");
        weeksList.add("Friday");
        weeksList.add("Saturday");
        weeksList.add("Sunday");

        System.out.println(weeksList);
        System.out.println("//------------------------//");
    }

    public static void ex2() {
        ArrayList<String> weeksList = new ArrayList<>();
        weeksList.add("Monday");
        weeksList.add("Tuesday");
        weeksList.add("Wednesday");
        weeksList.add("Thursday");
        weeksList.add("Friday");
        weeksList.add("Saturday");
        weeksList.add("Sunday");

        for (String week : weeksList) {
            System.out.println(week);
        }
        System.out.println("//------------------------//");
    }

    public static void ex3() {
        ArrayList<String> weeksList = new ArrayList<>();
        weeksList.add("Monday");
        weeksList.add("Tuesday");
        weeksList.add("Wednesday");
        weeksList.add("Friday");
        weeksList.add("Saturday");
        weeksList.add("Sunday");

        System.out.println(weeksList);

        weeksList.add(3, "Thursday");

        System.out.println(weeksList);
        System.out.println("//------------------------//");
    }

    public static void ex4() {
        ArrayList<String> weeksList = new ArrayList<>();
        weeksList.add("Monday");
        weeksList.add("Tuesday");
        weeksList.add("Wednesday");
        weeksList.add("Friday");
        weeksList.add("Saturday");
        weeksList.add("Sunday");

        System.out.println(weeksList);

        List<String> newWeeks = weeksList.subList(0, 3);

        System.out.println(newWeeks);
        System.out.println("//------------------------//");
    }

    public static void ex5() {
        HashSet<String> setWeeks = new HashSet<>();
        setWeeks.add("Monday");
        setWeeks.add("Tuesday");
        setWeeks.add("Wednesday");
        setWeeks.add("Friday");
        setWeeks.add("Saturday");
        setWeeks.add("Sunday");

        System.out.println(setWeeks);

        ArrayList<String> listWeeks = new ArrayList<>(setWeeks);

        System.out.println(listWeeks);
        System.out.println("//------------------------//");
    }
    public static void ex6() {
        HashSet<String> setNames = new HashSet<>();
        setNames.add("Mark");
        setNames.add("Karl");
        setNames.add("Andy");
        setNames.add("Mark");
        setNames.add("Sara");
        setNames.add("Lisa");
        setNames.add("Lina");

        System.out.println(setNames);
        System.out.println("//------------------------//");
    }
    public static void ex7() {
        HashSet<String> setNames = new HashSet<>();
        setNames.add("Mark");
        setNames.add("Karl");
        setNames.add("Andy");
        setNames.add("Mark");
        setNames.add("Sara");
        setNames.add("Lisa");
        setNames.add("Lina");

        System.out.println(setNames);

        ArrayList<String> listNames = new ArrayList<>(setNames);
        Collections.sort(listNames);

        System.out.println(listNames);
        System.out.println("//------------------------//");
    }
    public static void ex8() {
        HashSet<String> setNames = new HashSet<>();
        setNames.add("Mark");
        setNames.add("Karl");
        setNames.add("Andy");
        setNames.add("Mark");
        setNames.add("Sara");
        setNames.add("Lisa");
        setNames.add("Lina");

        System.out.println(setNames);

        TreeSet<String> sortNames = new TreeSet<>(setNames);

        System.out.println(sortNames);

        System.out.println("//------------------------//");
    }
    public static void ex9() {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "Volvo");
        cars.put(2, "Ford");
        cars.put(3, "Mazda");
        cars.put(4, "Suzuki");
        cars.put(5, "BMW");

        System.out.println(cars);
        System.out.println("//------------------------//");
    }
    public static void ex10() {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "Volvo");
        cars.put(2, "Ford");
        cars.put(3, "Mazda");
        cars.put(4, "Suzuki");
        cars.put(5, "BMW");

        System.out.println(cars.keySet());
        System.out.println("//------------------------//");
    }
    public static void ex11() {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "Volvo");
        cars.put(2, "Ford");
        cars.put(3, "Mazda");
        cars.put(4, "Suzuki");
        cars.put(5, "BMW");

        System.out.println(cars.values());
        System.out.println("//------------------------//");
    }

    public static void ex12() {
        HashMap<Integer, Car> cars = new HashMap<>();
        Car car1 = new Car();
        car1.setId(1);
        car1.setBrand("Toyota");
        car1.setModel("Camry");
        Car car2 = new Car();
        car2.setId(2);
        car2.setBrand("BMW");
        car2.setModel("3 Series");
        Car car3 = new Car();
        car3.setId(3);
        car3.setBrand("Ford");
        car3.setModel("Mustang");

        cars.put(1, car1);
        cars.put(2, car2);
        cars.put(3, car3);

        for (Car car : cars.values()) {
            System.out.println(car.getModel());
        }
        System.out.println("//------------------------//");
    }
}
