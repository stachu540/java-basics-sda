package pro.sdacademy.week3.task1;

public enum Level {
    EASY(3),
    MEDIUM(4),
    HARD(5);

    private final int count;

    Level(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }
}
