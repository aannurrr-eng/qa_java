import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    private Cat cat;
    @Mock
    private Feline feline;

    @Before
    public void startUp()
    {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundReturnsCatSound()
    {
        String sound = cat.getSound();
        String expectedSound = "Мяу";
        assertEquals(expectedSound, sound);
    }

    @Test
    public void getFoodReturnsPredatorFood() throws Exception
    {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        List<String> food = cat.getFood();
        assertEquals(expectedFood, food);
    }
}
