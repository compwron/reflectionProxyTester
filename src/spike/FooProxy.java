package spike;

import java.lang.reflect.InvocationTargetException;

public class FooProxy {
    FooIfc foo = null;

    public FooIfc getImplementationBean() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (foo == null) {
            foo = (FooIfc) Class.forName(Toggle.state().path).getConstructor().newInstance();
        }
        return foo;
    }
}
