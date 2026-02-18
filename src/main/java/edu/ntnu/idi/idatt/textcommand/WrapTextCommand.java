package edu.ntnu.idi.idatt.textcommand;

public class WrapTextCommand implements TextCommand {

    private String opening;
    private String end;

    public WrapTextCommand (String opening, String end) {
        if (opening == null || end == null) {
            throw new IllegalArgumentException("Opening and end cannot be null");
        }
        this.opening = opening;
        this.end = end;
    }

    public String getOpening() {
        return opening;
    }

    public String getEnd() {
        return end;
    }


    @Override
    public String execute(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        return opening + text + end;
    }

}
