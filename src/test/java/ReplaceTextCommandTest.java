import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import edu.ntnu.idi.idatt.textcommand.ReplaceTextCommand;

public class ReplaceTextCommandTest {

    @Test
    public void testReplacesAllOccurrences() {
        ReplaceTextCommand cmd = new ReplaceTextCommand("target", "replacement");
        assertEquals("text with replacement and replacement",
                cmd.execute("text with target and target"));
    }

    @Test
    public void testNullTextThrowsException() {
        ReplaceTextCommand cmd = new ReplaceTextCommand("target", "replacement");
        assertThrows(IllegalArgumentException.class, () -> cmd.execute(null));
    }
}