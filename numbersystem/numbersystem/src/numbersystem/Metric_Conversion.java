package numbersystem;

public class Metric_Conversion {
    private final String inputField;

    public Metric_Conversion(String inputField) {
        this.inputField = inputField;
    }





    public String meterToFeet()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(3.281 * meter);
    }
    public String meterToInch()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(39.37 * meter);
    }
    public String meterToMillimeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(1000 * meter);
    }
    public String meterToCentimeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(100 * meter);
    }
    public String meterToYard()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(1.094 * meter);
    }
    public String meterToMile()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 1609);
    }
    public String meterToKilometer()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 1000);
    }





    public String feetToMeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 3.281);
    }
    public String feetToInch()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(12 * meter);
    }
    public String feetToMillimeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(305 * meter);
    }
    public String feetToCentimeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(30.48 * meter);
    }
    public String feetToYard()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 3);
    }
    public String feetToMile()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 5280);
    }
    public String feetToKilometer()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 3281);
    }






    public String inchToMeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 39.37);
    }
    public String inchToFeet()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 12);
    }
    public String inchToMillimeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(25.4 * meter);
    }
    public String inchToCentimeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(25.4 * meter);
    }
    public String inchToYard()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 36);
    }
    public String inchToMile()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 63360);
    }
    public String inchToKilometer()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 39370);
    }




    public String millimeterToMeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 1000);
    }
    public String millimeterToFeet()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 305);
    }
    public String millimeterToInch()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 25.4);
    }
    public String millimeterToCentimeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 10);
    }
    public String millimeterToYard()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 914);
    }
    public String millimeterToMile()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 1.609e+6);
    }
    public String millimeterToKilometer()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 1e+6);
    }






    public String centimeterToMeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 100);
    }
    public String centimeterToFeet()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 30.48);
    }
    public String centimeterToInch()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 2.54);
    }
    public String centimeterToMillimeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(10 * meter);
    }
    public String centimeterToYard()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 91.44);
    }
    public String centimeterToMile()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 160934);
    }
    public String centimeterToKilometer()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 100000);
    }




    public String yardToMeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 1.094);
    }
    public String yardToFeet()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(3 * meter);
    }
    public String yardToInch()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(36 * meter);
    }
    public String yardToMillimeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(914 * meter);
    }
    public String yardToCentimeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(91.44 * meter);
    }
    public String yardToMile()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 1760);
    }
    public String yardToKilometer()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 1094);
    }






    public String mileToMeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(1609 * meter);
    }
    public String mileToFeet()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(5280 * meter);
    }
    public String mileToInch()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(63360 * meter);
    }
    public String mileToMillimeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(1.609e+6 * meter);
    }
    public String mileToCentimeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(160934 * meter);
    }
    public String mileToYard()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(1760 * meter);
    }
    public String mileToKilometer()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(1.609 * meter);
    }





    public String kilometerToMeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(1000 * meter);
    }
    public String kilometerToFeet()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(3281 * meter);
    }
    public String kilometerToInch()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(39370 * meter);
    }
    public String kilometerToMillimeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(1e+6 * meter);
    }
    public String kilometerToCentimeter()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(100000 * meter);
    }
    public String kilometerToYard()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(1094 * meter);
    }
    public String kilometerToMile()
    {
        float meter = Float.parseFloat(inputField);
        return String.valueOf(meter / 1.609);
    }


}
