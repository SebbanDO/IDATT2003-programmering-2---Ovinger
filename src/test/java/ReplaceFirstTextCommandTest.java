import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import edu.ntnu.idi.idatt.textcommand.ReplaceFirstTextCommand;


public class ReplaceFirstTextCommandTest {

    @Test
    public void testReplacesOnlyFirstOccurrence() {
        ReplaceFirstTextCommand cmd = new ReplaceFirstTextCommand("target", "replacement");
        assertEquals("text with replacement and target",
                cmd.execute("text with target and target"));

    }
}
