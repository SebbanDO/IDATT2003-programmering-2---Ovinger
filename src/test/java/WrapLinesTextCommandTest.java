import edu.ntnu.idi.idatt.textcommand.Wrap.WrapLinesTextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WrapLinesTextCommandTest {

    @Test
    public void testWrapsEachLine() {
        WrapLinesTextCommand cmd = new WrapLinesTextCommand("<p>", "</p>");
        assertEquals("<p>first line</p>\n<p>second line</p>",
                cmd.execute("first line\nsecond line"));
    }
}
