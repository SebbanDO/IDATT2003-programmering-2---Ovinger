import edu.ntnu.idi.idatt.textcommand.Wrap.WrapSelectionTextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WrapSelectionTextCommandTest {

    @Test
    public void testWrapsSelection() {
        WrapSelectionTextCommand cmd = new WrapSelectionTextCommand("<p>", "</p>", "selection");
        assertEquals("text with <p>selection</p>",
                cmd.execute("text with selection"));
    }

    @Test
    public void testWrapsAllOccurrencesOfSelection() {
        WrapSelectionTextCommand cmd = new WrapSelectionTextCommand("<p>", "</p>", "selection");
        assertEquals("text with <p>selection</p> and another <p>selection</p>",
                cmd.execute("text with selection and another selection"));
    }
}
