package spike;

public class Toggle {
    private static States state;

    public static boolean isHigh() {
        return state.equals(States.HIGH);
    }

    public static void setToHigh() {
        state = States.HIGH;
    }

    public static void setToLow() {
        state = States.LOW;
    }
}
