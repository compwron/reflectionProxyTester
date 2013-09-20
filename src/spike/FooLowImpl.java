package spike;

public class FooLowImpl implements FooIfc {
    int thing = 1;

    public void setThing(int thing) {
        this.thing = thing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FooLowImpl fooLow = (FooLowImpl) o;

        if (thing != fooLow.thing) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return thing;
    }
}
