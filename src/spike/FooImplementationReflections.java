package spike;

public enum FooImplementationReflections {
    HIGH("spike.FooHighImpl"), LOW("spike.FooLowImpl");

    public String path;

    FooImplementationReflections(String path) {
        this.path = path;
    }
}
