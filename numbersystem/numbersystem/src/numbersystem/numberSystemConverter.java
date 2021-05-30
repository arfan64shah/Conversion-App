package numbersystem;

public class numberSystemConverter {
    private final String inputField;


    public numberSystemConverter(String inputField) {
        this.inputField = inputField;
    }


    // Binary Input Conversion.

    public String binaryToOctal()
    {
        int binary = Integer.parseInt(inputField, 2);

        return  Integer.toOctalString(binary);
    }


    public String binaryToDecimal()
    {


        return   String.valueOf(Integer.parseInt(inputField, 2));
    }

    public String binaryToHexadecimal()
    {
        int decimal = Integer.parseInt(inputField, 2);

        return (Integer.toHexString(decimal)).toUpperCase();
    }



    // Octal input Conversion.

    public String octalToBinary()
    {
        int octal = Integer.parseInt(inputField, 8);
        return Integer.toBinaryString(octal);

    }

    public String octalToDecimal()
    {
        return String.valueOf(Integer.parseInt(inputField,8));

    }

    public String octalToHexadecimal()
    {
        int decimal = Integer.parseInt(inputField, 8);

        return Integer.toHexString(decimal).toUpperCase();
    }



    // Decimal input Conversion.

    public String decimalToBinary()
    {
        return Integer.toBinaryString(Integer.parseInt(inputField));
    }

    public String decimalToOctal()
    {
        return Integer.toOctalString(Integer.parseInt(inputField));
    }

    public String decimalToHexadecimal()
    {
        return Integer.toHexString(Integer.parseInt(inputField)).toUpperCase();
    }



    // Hexadecimal input Conversion.

    public String hexadecimalToBinary()
    {
        int decimal = Integer.parseInt(inputField, 16);

        return  Integer.toBinaryString(decimal);
    }

    public String hexadecimalToOctal()
    {
        int decimal = Integer.parseInt(inputField, 16);

        return Integer.toOctalString(decimal);
    }

    public String hexadecimalToDecimal()
    {
        return String.valueOf(Integer.parseInt(inputField,16));
    }



}
