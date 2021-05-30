package numbersystem;

public class Temperature_Conversion {
    private final String inputField;

    public Temperature_Conversion(String inputField) {
        this.inputField = inputField;
    }

    public String cel_fah()
    {
        float input = Float.parseFloat(inputField);
        return String.valueOf(((input*9)/5)+32);
    }

    public String fah_cel()
    {
        float input = Float.parseFloat(inputField);
        return String.valueOf(((input-32)*5)/9);
    }

    public String cel_kel()
    {
        float input = Float.parseFloat(inputField);
        return String.valueOf(input + 273.15);
    }

    public String fah_kel()
    {
        float input = Float.parseFloat(inputField);
        return String.valueOf((input - 32)*5/9 + 273.15);
    }

    public String kel_cel()
    {
        float input = Float.parseFloat(inputField);
        return String.valueOf(input - 273.15);
    }

    public String kel_fah()
    {
        float input = Float.parseFloat(inputField);
        return String.valueOf((input - 273.15) * 9/5 + 32);
    }
}
