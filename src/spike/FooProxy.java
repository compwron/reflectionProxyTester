package spike;

import java.lang.reflect.InvocationTargetException;

public class FooProxy {
    FooIfc foo = null;

    public FooIfc getImplementationBean() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (foo == null) {
            if (Toggle.isHigh()) {
                foo = (FooIfc) Class.forName(FooImplementationReflections.HIGH.path).getConstructor().newInstance();
            } else {
                foo = (FooIfc) Class.forName(FooImplementationReflections.LOW.path).getConstructor().newInstance();
            }
        }
        return foo;
    }
}
