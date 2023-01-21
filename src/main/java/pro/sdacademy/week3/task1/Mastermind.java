package pro.sdacademy.week3.task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mastermind {
    // compare 3, 4 or 5 numbers
    // user have 5 chances
    private static int hp = 5;
    public static void run() {
        // random numbers (min-max required)
        // place inputs
        // compare numbers with number exist and his position
        // prints outputs with
        // - COLD - no matches
        // - WARM - match found but not in the same position
        // - HOT  - all matches are met
        // 5 lives only
    }

    private static int[] randomize(Level level, int maxNumber) {
        int[] rand = new int[level.getCount()];
        for (int i = 0; i < level.getCount(); i++) {
            rand[i] = (int) Math.random() * maxNumber;
        }
        return rand;
    }
    private static int[] fetchOutputs(Level level) {
        List<Integer> outputs = new ArrayList<>(level.getCount());

        Scanner scanner = new Scanner(System.in);
        String[] raw = scanner.nextLine().split("\\s");
        for (String r : raw) {
            r = r.trim();
            if (!r.isEmpty()) {
                try {
                    outputs.add(Integer.parseInt(r));
                } catch (IndexOutOfBoundsException e) {
                    System.err.println(e.getMessage());
                    System.err.println("Try again!");
                    fetchOutputs(level);
                }
            }
        }
        var o = new int[]{};
        for (Number x : outputs) {
            o[outputs.indexOf(x)] = x.intValue();
        }

        return o;
    }
    private static boolean compareTo(int[] rand, int[] user) {
        List<State> states = new ArrayList<>();
        List<Integer> randoms = Arrays.stream(rand).mapToObj(i -> i).collect(Collectors.toList());
        List<Integer> users = Arrays.stream(user).mapToObj(i -> i).collect(Collectors.toList());

        for (int u : users) {
            State state = State.COLD;
            if (randoms.contains(u)) {
                state = State.WARM;
                if (randoms.indexOf(u) == users.indexOf(u)) {
                    state = State.HOT;
                }
            }
            states.add(state);
        }

        return states.stream().allMatch(s -> s == State.HOT);
    }
}
