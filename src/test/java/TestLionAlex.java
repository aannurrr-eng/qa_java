import com.example.Feline;
import com.example.LionAlex;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLionAlex {
    private LionAlex lionAlex;

    @Mock
    private Feline feline;

    @Before
    public void startUp() throws Exception
    {
        lionAlex = new LionAlex(feline);
    }

    @Test
    public void getFriendsReturnsFriends()
    {
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        List<String> friends = lionAlex.getFriends();
        assertEquals(expectedFriends, friends);
    }

    @Test
    public void getPlaceOfLivingReturnsPlace()
    {
        String expectedPlace = "Нью-Йоркский зоопарк";
        String place = lionAlex.getPlaceOfLiving();
        assertEquals(expectedPlace, place);
    }

    @Test
    public void getKittensReturns0()
    {
        int expectedKittens = 0;
        int kittens = lionAlex.getKittens();
        assertEquals(expectedKittens, kittens);
    }
}
