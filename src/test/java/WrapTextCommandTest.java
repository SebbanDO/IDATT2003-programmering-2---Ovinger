import edu.ntnu.idi.idatt.textcommand.Wrap.WrapTextCommand;
import edu.ntnu.idi.idatt.textcommand.Wrap.WrapLinesTextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WrapTextCommandTest {

    @Test
    public void testWrapsText() {
        WrapTextCommand cmd = new WrapTextCommand("<p>", "</p>");
        assertEquals("<p>text to be wrapped</p>", cmd.execute("text to be wrapped"));
    }

    @Test
    public void testNullTextThrowsException() {
        WrapTextCommand cmd = new WrapTextCommand("<p>", "</p>");
        assertThrows(IllegalArgumentException.class, () -> cmd.execute(null));
    }

}