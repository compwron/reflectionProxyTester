import spike.FooIfc;
import spike.Toggle;

import java.lang.reflect.InvocationTargetException;

public class FooProxy {
    FooIfc foo = null;

    public FooIfc getImplementationBean() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (foo == null) {
            if (Toggle.isHigh()) {
                foo = (FooIfc) Class.forName("spike.FooHighImpl").getConstructor().newInstance();
            } else {
                foo = (FooIfc) Class.forName("spike.FooLowImpl").getConstructor().newInstance();
            }
        }
        return foo;
    }
}
