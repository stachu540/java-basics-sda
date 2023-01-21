package pro.sdacademy.week2;

import java.util.*;
import java.util.stream.Collectors;

public class AppCollections {
    public static void main(String[] args) {
        System.out.println("--- TASK 1 ---");
        task1();
        System.out.println("--- TASK 2 ---");
        task2();
        System.out.println("--- TASK 3 ---");
        task3();
        System.out.println("--- TASK 4 ---");
        task4();
        System.out.println("--- TASK 5 ---");
        task5();
    }

    private static void task1() {
        System.out.println("NO RESULTS YET");
//        ArrayList<Integer> diff1 = new ArrayList<>();
//        diff1.add(0);
//        diff1.add(1);
//        diff1.add(5);
//        diff1.add(4);
//
//        ArrayList<Integer> diff2 = new ArrayList<>();
//        diff2.add(0);
//        diff2.add(3);
//        diff2.add(5);
//        diff2.add(7);
//
//        for (int i = 0; i < 4; i++) {
//            int n1 = diff1.get(i);
//            int n2 = diff2.get(i);
//            if (n1 == n2) {
//                System.out.println(String.format("%d == %d", n1, n2));
//            } else {
//                System.out.println(String.format("%d != %d", n1, n2));
//            }
//        }
    }

    private static void task2() {
        System.out.println("NO RESULTS YET");
    }

    private static void task3() {
        System.out.println("NO RESULTS YET");
    }

    private static void task4() {
        Set<Integer> set1 = Set.of(0,1,3,5,6,7);
        Set<Integer> set2 = Set.of(1,2,3,4,5,9);

        // suma zbiorów
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(String.format("A v B = %s", union));

        Set<Integer> intersection = set1.stream()
                        .distinct().filter(set2::contains)
                        .collect(Collectors.toSet());
        union.retainAll(set2);
        System.out.println(String.format("A ^ B = %s", intersection));

        Set<Integer> diff1 = task4Result(set1, set2);
        System.out.println(String.format("A \\ B = %s", diff1));

        Set<Integer> diff2 = task4Result(set2, set1);
        System.out.println(String.format("B \\ A = %s", diff2));
    }

    private static  <T> Set<T> task4Result(Set<T> left, Set<T> right) {
        Set<T> diff = new HashSet<>();
        for (T t : left) {
            if (!right.contains(t)) {
                diff.add(t);
            }
        }
        return diff;
    }

    private static void task5() {
        Map<String, Integer> shopList1 = Map.of(
                "eggs", 5,
                "butter", 1,
                "sausages", 3
        );

        System.out.println("Shopping list 1:");
        task5Print(shopList1);

        Map<String, Integer> shopList2 = Map.of(
                "eggs", 4,
                "tomatoes", 10
        );

        System.out.println("Shopping list 2:");
        task5Print(shopList2);

        Map<String, Integer> shopListUnion = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> e : shopList1.entrySet()) {
            int number = e.getValue();
            if (shopListUnion.containsKey(e.getKey())) {
                number = shopListUnion.get(e.getKey()) + e.getValue();
            }
            shopListUnion.put(e.getKey(), number);
        }

        for (Map.Entry<String, Integer> e : shopList2.entrySet()) {
            int number = e.getValue();
            if (shopListUnion.containsKey(e.getKey())) {
                number = shopListUnion.get(e.getKey()) + e.getValue();
            }
            shopListUnion.put(e.getKey(), number);
        }

        System.out.println("United shopping list:");
        task5Print(shopListUnion);
    }

    private static void task5Print(Map<String, Integer> data) {
        for (Map.Entry<String, Integer> e : data.entrySet()) {
            System.out.println(String.format("- \"%s\": %d", e.getKey(), e.getValue()));
        }
    }
}
