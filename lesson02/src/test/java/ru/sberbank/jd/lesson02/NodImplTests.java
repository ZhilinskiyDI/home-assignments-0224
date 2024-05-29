
package ru.sberbank.jd.lesson02;

import org.junit.Assert;
import org.junit.Test;
import ru.sberbank.jd.lesson02.NodImpl;

public class NodImplTests {
    static NodImpl nodImpl = new NodImpl();

    @Test
    public void calculateTest() {
        Assert.assertEquals(1, nodImpl.calculate(8, 9));
        Assert.assertEquals(14, nodImpl.calculate(42,14));
        Assert.assertEquals(1, nodImpl.calculate(1, 0));
    }
}
