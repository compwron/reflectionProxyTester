package spike;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;

public class FooProxyTest {
    @Test
    public void shouldReturnFooHighImplWhenToggleIsSetToHigh() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Toggle.setToHigh();
        FooProxy proxy = new FooProxy();
        assertEquals(FooHigh.class, proxy.getImplementationBean().getClass());
    }

    @Test
    public void shouldReturnFooLowImplWhenToggleIsSetToHigh() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Toggle.setToLow();
        FooProxy proxy = new FooProxy();
        assertEquals(FooLow.class, proxy.getImplementationBean().getClass());
    }

    @Test
    public void allReflectionUsagesShouldBeInstantiable() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        for (Environment reflection : Environment.values()){
            Class.forName(reflection.path).getConstructor().newInstance();
        }
    }
}
