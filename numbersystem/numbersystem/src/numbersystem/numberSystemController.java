package numbersystem;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class numberSystemController {



    @FXML  private RadioButton fromBinaryRadioButton;

    @FXML  private ToggleGroup fromToggleGroup;

    @FXML  private RadioButton fromOctalRadioButton;

    @FXML  private RadioButton fromDecimalRadioButton;

    @FXML  private RadioButton fromHexadecimalRadioButton;

    @FXML  private RadioButton toBinaryRadioButton;

    @FXML  private ToggleGroup toToggleGroup;

    @FXML  private RadioButton toOctalRadioButton;

    @FXML  private RadioButton toDecimalRadioButton;

    @FXML  private RadioButton toHexadecimalRadioButton;

    @FXML  private RadioButton celToKel;

    @FXML  private RadioButton kelToCel;

    @FXML  private RadioButton kelToFah;

    @FXML  private RadioButton fahToKel;

    @FXML  private RadioButton celToFah;

    @FXML  private ToggleGroup temperatureToggleGroup;

    @FXML  private RadioButton fahToCel;

    @FXML  private ToggleGroup fromMetricToggleGroup;

    @FXML  private RadioButton fromFeetRadioButton;

    @FXML  private RadioButton fromInchRadioButton;

    @FXML  private RadioButton fromMillimeterRadioButton;

    @FXML  private RadioButton fromCentimeterRadioButton;

    @FXML  private RadioButton fromYardRadioButton;

    @FXML  private RadioButton fromMileRadioButton;

    @FXML  private RadioButton fromKilometerRadioButton;

    @FXML  private RadioButton fromMeterRadioButton;

    @FXML  private ToggleGroup toMetricToggleGroup;

    @FXML  private RadioButton toMeterRadioButton;

    @FXML  private RadioButton toFeetRadioButton;

    @FXML  private RadioButton toInchRadioButton;

    @FXML  private RadioButton toMillimeterRadioButton;

    @FXML  private RadioButton toCentimeterRadioButton;

    @FXML  private RadioButton toYardRadioButton;

    @FXML  private RadioButton toMileRadioButton;

    @FXML  private RadioButton toKilometerRadioButton;

    @FXML  private Button temperatureButton;

    @FXML  private Button metricButton;


    @FXML  private TextField textField;

    @FXML  private TextArea resultField;

    @FXML  private Button convertButton;

    @FXML  private RadioButton ASCIIToChar;

    @FXML  private ToggleGroup ASCII;

    @FXML  private RadioButton charToASCII;

    @FXML  private Button clearButton;

    @FXML  private Button ASCIIConvertButton;


    private int counter = 0;




    @FXML
    void metricButtonPressed(ActionEvent event) {
        counter++;

        if(counter >= 2)
        {
            resultField.setText("");
        }


        try {
            metricButton.setDefaultButton(true);
            String inputField = textField.getText();
            Metric_Conversion metric_conversion = new Metric_Conversion(inputField);


            fromMileRadioButton.setToggleGroup(fromMetricToggleGroup);
            toMeterRadioButton.setToggleGroup(toMetricToggleGroup);


            if(fromMeterRadioButton.isSelected())
            {
                if (toMeterRadioButton.isSelected())
                {
                    resultField.setText("Please Choose other option from the TO/FROM  Metric radio buttons!!!");
                    textField.requestFocus();
                    textField.clear();

                }
                else if (toFeetRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.meterToFeet()));

                }
                else if (toInchRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.meterToInch()));

                }
                else if (toMillimeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.meterToMillimeter()));

                }
                else if (toCentimeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.meterToCentimeter()));
                }
                else if (toYardRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.meterToYard()));
                }
                else if (toMileRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.meterToMile()));
                }
                else if (toKilometerRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.meterToKilometer()));
                }

            }
            else if(fromFeetRadioButton.isSelected())
            {
                if (toMeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.feetToMeter()));
                }
                else if (toFeetRadioButton.isSelected())
                {
                    resultField.setText("Please Choose other option from the TO/FROM  Metric radio buttons!!!");
                    textField.requestFocus();
                    textField.clear();

                }
                else if (toInchRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.feetToInch()));
                }
                else if (toMillimeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.feetToMillimeter()));
                }
                else if (toCentimeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.feetToCentimeter()));
                }
                else if (toYardRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.feetToYard()));
                }
                else if (toMileRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.feetToMile()));
                }
                else if (toKilometerRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.feetToKilometer()));
                }

            }
            else if (fromInchRadioButton.isSelected())
            {
                if (toMeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.inchToMeter()));
                }
                else if (toFeetRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.inchToFeet()));
                }
                else if (toInchRadioButton.isSelected())
                {
                    resultField.setText("Please Choose other option from the TO/FROM  Metric radio buttons!!!");
                    textField.requestFocus();
                    textField.clear();

                }
                else if (toMillimeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.inchToMillimeter()));
                }
                else if (toCentimeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.inchToCentimeter()));
                }
                else if (toYardRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.inchToYard()));
                }
                else if (toMileRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.inchToMile()));
                }
                else if (toKilometerRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.inchToKilometer()));
                }

            }
            else if (fromMillimeterRadioButton.isSelected())
            {
                if (toMeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.millimeterToMeter()));
                }
                else if (toFeetRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.millimeterToFeet()));
                }
                else if (toInchRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.millimeterToInch()));
                }
                else if (toMillimeterRadioButton.isSelected())
                {
                    resultField.setText("Please Choose other option from the TO/FROM  Metric radio buttons!!!");
                    textField.requestFocus();
                    textField.clear();

                }
                else if (toCentimeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.millimeterToCentimeter()));
                }
                else if (toYardRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.millimeterToYard()));
                }
                else if (toMileRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.millimeterToMile()));
                }
                else if (toKilometerRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.millimeterToKilometer()));
                }

            }
            else if (fromCentimeterRadioButton.isSelected())
            {
                if (toMeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.centimeterToMeter()));
                }
                else if (toFeetRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.centimeterToFeet()));
                }
                else if (toInchRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.centimeterToInch()));
                }
                else if (toMillimeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.centimeterToMillimeter()));
                }
                else if (toCentimeterRadioButton.isSelected())
                {
                    resultField.setText("Please Choose other option from the TO/FROM  Metric radio buttons!!!");
                    textField.requestFocus();
                    textField.clear();

                }
                else if (toYardRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.centimeterToYard()));
                }
                else if (toMileRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.centimeterToMile()));
                }
                else if (toKilometerRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.centimeterToKilometer()));
                }

            }
            else if (fromYardRadioButton.isSelected())
            {
                if (toMeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.yardToMeter()));
                }
                else if (toFeetRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.yardToFeet()));
                }
                else if (toInchRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.yardToInch()));
                }
                else if (toMillimeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.yardToMillimeter()));
                }
                else if (toCentimeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.yardToCentimeter()));
                }
                else if (toYardRadioButton.isSelected())
                {
                    resultField.setText("Please Choose other option from the TO/FROM  Metric radio buttons!!!");
                    textField.requestFocus();
                    textField.clear();

                }
                else if (toMileRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.yardToMile()));
                }
                else if (toKilometerRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.yardToKilometer()));
                }

            }
            else if (fromMileRadioButton.isSelected())
            {
                if (toMeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.mileToMeter()));
                }
                else if (toFeetRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.mileToFeet()));
                }
                else if (toInchRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.mileToInch()));
                }
                else if (toMillimeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.mileToMillimeter()));
                }
                else if (toCentimeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.mileToCentimeter()));
                }
                else if (toYardRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.mileToYard()));
                }
                else if (toMileRadioButton.isSelected())
                {
                    resultField.setText("Please Choose other option from the TO/FROM  Metric radio buttons!!!");
                    textField.requestFocus();
                    textField.clear();

                }
                else if (toKilometerRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.mileToKilometer()));
                }

            }
            else if (fromKilometerRadioButton.isSelected())
            {
                if (toMeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.kilometerToMeter()));
                }
                else if (toFeetRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.kilometerToFeet()));
                }
                else if (toInchRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.kilometerToInch()));
                }
                else if (toMillimeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.kilometerToMillimeter()));
                }
                else if (toCentimeterRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.kilometerToCentimeter()));
                }
                else if (toYardRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.kilometerToYard()));
                }
                else if (toMileRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(metric_conversion.kilometerToMile()));
                }
                else if (toKilometerRadioButton.isSelected())
                {
                    resultField.setText("Please Choose other option from the TO/FROM  Metric radio buttons!!!");
                    textField.requestFocus();
                    textField.clear();
                }

            }




        } catch (NumberFormatException e)
        {
            textField.requestFocus();
        }

    }

    @FXML
    void temperatureButtonPressed(ActionEvent event) {
        try {
            counter++;

            if(counter >= 2)
            {
                resultField.setText("");
            }

            celToFah.setToggleGroup(temperatureToggleGroup);
            fahToCel.setToggleGroup(temperatureToggleGroup);

            String inputField = textField.getText();


            Temperature_Conversion temperature_conversion = new Temperature_Conversion(inputField);


            temperatureButton.setDefaultButton(true);
            if (celToFah.isSelected())
            {
                resultField.appendText(temperature_conversion.cel_fah());
            }
            else if (fahToCel.isSelected())
            {
                resultField.appendText(temperature_conversion.fah_cel());
            }
            else if (fahToKel.isSelected())
            {
                resultField.appendText(temperature_conversion.fah_kel());
            }
            else if (celToKel.isSelected())
            {
                resultField.appendText(temperature_conversion.cel_kel());
            }
            else if (kelToCel.isSelected())
            {
                resultField.appendText(temperature_conversion.kel_cel());
            }
            else if (kelToFah.isSelected())
            {
                resultField.appendText(temperature_conversion.kel_fah());
            }

        }catch (NumberFormatException e)
        {
            textField.requestFocus();

        }



    }



    @FXML
    void ASCIIConvertButtonPressed(ActionEvent event) {
        try {
            counter++;

            if(counter >= 2)
            {
                resultField.setText("");
            }

            ASCIIToChar.setToggleGroup(ASCII);
            charToASCII.setToggleGroup(ASCII);

            String inputField = textField.getText();


            ASCII_Char ascii = new ASCII_Char(inputField);


            ASCIIConvertButton.setDefaultButton(true);
            if (charToASCII.isSelected())
            {
                resultField.appendText(ascii.char_ascii());
            }
            if (ASCIIToChar.isSelected())
            {
                resultField.appendText(ascii.ascii_char());
            }

        }catch (NumberFormatException e)
        {
            textField.requestFocus();

        }

    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
        clearButton.setDefaultButton(true);
        resultField.clear();
        textField.clear();
    }










    @FXML
    void convertButtonPressed(ActionEvent event) {
        counter++;

        if(counter >= 2)
        {
            resultField.setText("");
        }


        try {
            convertButton.setDefaultButton(true);
            String inputField = textField.getText();
            numberSystemConverter method = new numberSystemConverter(inputField);


            fromBinaryRadioButton.setToggleGroup(fromToggleGroup);
            toHexadecimalRadioButton.setToggleGroup(toToggleGroup);

            // Binary Input Conversion.
            if (fromBinaryRadioButton.isSelected())
            {
                if (toBinaryRadioButton.isSelected())
                {
                    resultField.setText("Please Choose other option from the TO/FROM radio buttons!!!");
                    textField.requestFocus();
                    textField.clear();
                }
                if (toDecimalRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(method.binaryToDecimal()));
                }
                if (toOctalRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(method.binaryToOctal()));
                }

                if (toHexadecimalRadioButton.isSelected())
                {
                    resultField.appendText(String.valueOf(method.binaryToHexadecimal()));
                }
            }

            // Octal Input Conversion.
            else if(fromOctalRadioButton.isSelected())
            {
                if (toBinaryRadioButton.isSelected())
                {
                    resultField.setText(method.octalToBinary());
                }
                else if (toOctalRadioButton.isSelected())
                {
                    resultField.setText("Please Choose other option from the TO/FROM radio buttons!!!");
                    textField.requestFocus();
                    textField.clear();
                }
                else if (toDecimalRadioButton.isSelected())
                {
                    resultField.setText(method.octalToDecimal());
                }
                else if (toHexadecimalRadioButton.isSelected())
                {
                    resultField.setText(method.octalToHexadecimal());
                }
            }

            // Decimal Input Coversion.
            else if (fromDecimalRadioButton.isSelected())
            {
                if (toBinaryRadioButton.isSelected())
                {
                    resultField.setText(method.decimalToBinary());
                }
                else if (toOctalRadioButton.isSelected())
                {
                    resultField.setText(method.decimalToOctal());
                }
                else if (toDecimalRadioButton.isSelected())
                {
                    resultField.setText("Please Choose other option from the TO/FROM radio buttons!!!");
                    textField.requestFocus();
                    textField.clear();
                }
                else if (toHexadecimalRadioButton.isSelected())
                {
                    resultField.setText(method.decimalToHexadecimal());
                }
            }

            // Hexadecimal Input Conversion.
            else if (fromHexadecimalRadioButton.isSelected())
            {
                if (toBinaryRadioButton.isSelected())
                {
                    resultField.setText(method.hexadecimalToBinary());
                }
                else if (toOctalRadioButton.isSelected())
                {
                    resultField.setText(method.hexadecimalToOctal());
                }
                else if (toDecimalRadioButton.isSelected())
                {
                    resultField.setText(method.hexadecimalToDecimal());
                }
                else if (toHexadecimalRadioButton.isSelected())
                {
                    resultField.setText("Please Choose other option from the TO/FROM radio buttons!!!");
                    textField.requestFocus();
                    textField.clear();
                }
            }

        } catch (NumberFormatException e)
        {
            textField.requestFocus();
        }
    }



    @FXML
    void fromRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void toRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void charToASCIISelected(ActionEvent event) {

    }

    @FXML
    void celToFahSelected(ActionEvent event) {

    }

    @FXML
    void fahToCelSelected(ActionEvent event) {

    }


    @FXML
    void fromMetricRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void toMetricRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void celToKelSelected(ActionEvent event) {

    }

    @FXML
    void fahToKelSelected(ActionEvent event) {

    }

    @FXML
    void kelToCelSelected(ActionEvent event) {

    }

    @FXML
    void kelToFahSelected(ActionEvent event) {

    }


}
