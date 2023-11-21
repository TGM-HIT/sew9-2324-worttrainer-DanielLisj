import Model.WordPair;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordPairTest {

    @DisplayName("Testen ob das Wort gueltig ist")
    @Test
    public void testWord()  {
        WordPair pair = new WordPair("test","https://elearning.tgm.ac.at/course/view.php?id=1562");
        assertThrows(IllegalArgumentException.class, () -> {pair.setWord(null);});
        assertThrows(IllegalArgumentException.class, () -> {pair.setWord("");});
    }

    @DisplayName("Testen ob die URL gueltig ist")
    @Test
    public void testURL()   {
        WordPair pair = new WordPair("test","https://elearning.tgm.ac.at/course/view.php?id=1562");
        assertThrows(IllegalArgumentException.class, () -> {pair.setURL(null);});
        assertThrows(IllegalArgumentException.class, () -> {pair.setURL("");});
        assertThrows(IllegalArgumentException.class, () -> {pair.setURL("test");});
    }
}