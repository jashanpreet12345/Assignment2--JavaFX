import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField inputField;

    @FXML
    private Button calculateButton;

 
    @FXML
    private void handleCalculateButton() {
        
        String inputText = inputField.getText();
        String[] inputValues = inputText.split("\\s+"); 

        double[] values = new double[inputValues.length];
        for (int i = 0; i < inputValues.length; i++) {
            values[i] = Double.parseDouble(inputValues[i]);
        }

        
        double total = Excel.calculateTotal(values);
        double average = Excel.calculateAverage(values);
        double maximum = Excel.calculateMaximum(values);
        double minimum = Excel.calculateMinimum(values);

      
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}
