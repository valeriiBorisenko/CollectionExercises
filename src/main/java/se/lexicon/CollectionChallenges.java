package se.lexicon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionChallenges {
    public static void main(String[] args) {
        ex1();
        ex2();
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

        ArrayList<String> weekendList = new ArrayList<>();
        weekendList.add("Saturday");
        weekendList.add("Sunday");

        Iterator<String> iterator = weeksList.iterator();

        while (iterator.hasNext()) {
            String day = iterator.next();

            if (!weekendList.contains(day)) {
                iterator.remove();
            }
        }


        System.out.println(weeksList);
        System.out.println(weekendList);
    }

    public static void ex2() {
        HashMap<String,String> info = new HashMap<>();
        info.put("karl@gmail.com", "Karl");
        info.put("lisa@gmail.com", "Lisa");
        info.put("anders@gmail.com", "Anders");
        info.put("lev@gmail.com", "Lev");

        HashSet<String> newInfo = new HashSet<>(info.keySet());

        System.out.println(info);
        System.out.println(newInfo);
    }

    public static void ex3() {

    }
}
