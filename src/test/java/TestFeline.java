import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFeline {

    private Feline feline;

    @Before
    public void startUp()
    {
        feline = new Feline();
    }

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception
    {
        List<String> food = feline.eatMeat();
        List <String>expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, food);
    }

    @Test
    public void getFamilyReturnsFeline()
    {
        String family = feline.getFamily();
        String expectedFamily = "Кошачьи";
        assertEquals (expectedFamily, family);
    }

    @Test
    public void getKittensReturns1()
    {
        int kittensCount = feline.getKittens();
        int expectedKittensCount = 1;
        assertEquals(expectedKittensCount, kittensCount);
    }

    @Test
    public void getKittensReturnsParameter()
    {
        int expectedKittensCount = 5;
        int kittensCount = feline.getKittens(expectedKittensCount);
        assertEquals(expectedKittensCount, kittensCount);
    }
}
