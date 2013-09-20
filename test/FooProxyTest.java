import org.junit.Test;
import spike.FooHighImpl;
import spike.FooLowImpl;
import spike.Toggle;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;

public class FooProxyTest {
    @Test
    public void shouldReturnFooHighImplWhenToggleIsSetToHigh() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Toggle.setToHigh();
        FooProxy proxy = new FooProxy();
        assertEquals(new FooHighImpl(), proxy.getImplementationBean());
    }

    @Test
    public void shouldReturnFooLowImplWhenToggleIsSetToHigh() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Toggle.setToLow();
        FooProxy proxy = new FooProxy();
        assertEquals(new FooLowImpl(), proxy.getImplementationBean());
    }
}