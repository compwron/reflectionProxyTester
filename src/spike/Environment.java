package spike;

public enum Environment {
    HIGH("spike.FooHigh"), LOW("spike.FooLow");

    public String path;

    Environment(String path) {
        this.path = path;
    }
}
