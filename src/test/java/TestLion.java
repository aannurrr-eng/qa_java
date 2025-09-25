import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    private Lion lion;

    @Mock
    private Feline feline;

    @Before
    public void StartUp() throws Exception
    {
        lion = new Lion(feline, "Самец");
    }

    @Test
    public void getKittensReturns1()
    {
        int expectedKittens = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedKittens);
        int kittens = lion.getKittens();
        assertEquals(expectedKittens, kittens);
    }

    @Test
    public void getFoodReturnsPredatorFood() throws Exception
    {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> food = lion.getFood();
        assertEquals(expectedFood, food);
    }

    @Test(expected = Exception.class)
    public void lionWithWrongSexThrowsException() throws Exception
    {
        lion = new Lion(feline, "Сам");
    }
}
