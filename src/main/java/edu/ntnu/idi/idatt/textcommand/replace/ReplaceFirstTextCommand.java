package edu.ntnu.idi.idatt.textcommand.Replace;


public class ReplaceFirstTextCommand extends ReplaceTextCommand {

    public ReplaceFirstTextCommand(String target, String replacement) {
        super(target, replacement);
    }

    @Override
    public String execute(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        return text.replaceFirst(getTarget(), getReplacement());
    }
}

