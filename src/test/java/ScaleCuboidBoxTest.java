import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScaleCuboidBoxTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetVolume() {
        ScaleCuboidBox boxTest = new ScaleCuboidBox(1,2,3);
        assertEquals(6, boxTest.getVolume());
    }
}