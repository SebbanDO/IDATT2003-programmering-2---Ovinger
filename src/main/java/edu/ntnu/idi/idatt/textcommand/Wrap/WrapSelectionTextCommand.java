package edu.ntnu.idi.idatt.textcommand.Wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {

    private String selection;

    public WrapSelectionTextCommand (String opening, String end, String selection) {
        super(opening, end);
        if (selection == null) {
            throw new IllegalArgumentException("Selection cannot be null");
        }
        this.selection = selection;
    }

    public String getSelection() {
        return selection;
    }

    @Override
    public String execute(String text) {
        if(text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }

        String wrapped = getOpening() + selection + getEnd();
        return text.replace(selection, wrapped);
    }
}
