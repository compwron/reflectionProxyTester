package spike;

public class Toggle {
    private static Environment state;

    public static void setToHigh() {
        state = Environment.HIGH;
    }

    public static void setToLow() {
        state = Environment.LOW;
    }

    public static Environment state() {
        return state;
    }
}
