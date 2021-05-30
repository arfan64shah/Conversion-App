package numbersystem;

public class ASCII_Char {
    private final String inputField;

    public ASCII_Char(String inputField) {
        this.inputField = inputField;
    }

    public String ascii_char()
    {
        return String.valueOf((int)inputField.charAt(0));
    }

    public String char_ascii()
    {
        int input = Integer.parseInt(inputField);
        return String.valueOf((char)input);
    }
}
