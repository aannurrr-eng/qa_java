import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionMane {

    private final String sex;
    private final boolean expectedHaveMane;
    private Lion lion;

    @Mock
    private Feline feline;

    public TestLionMane(String sex, boolean expectedHaveMane)
    {
        this.sex = sex;
        this.expectedHaveMane = expectedHaveMane;
    }

    @Parameterized.Parameters (name = "{0}")
    public static Object[][] getData()
    {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Before
    public void StartUp() throws Exception
    {
        MockitoAnnotations.openMocks(this);
        lion = new Lion(feline, sex);
    }

    @Test
    public void doesHaveManeTest()
    {
        boolean haveMane = lion.doesHaveMane();
        assertEquals(expectedHaveMane, haveMane);
    }

}
