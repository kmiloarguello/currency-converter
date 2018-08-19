package xyz.camiloarguello.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void changeToUSD(View view){
        EditText copTextField = findViewById(R.id.copTextField);

        // Call a function to convert from String to Double
        Double copMoney = convertToDouble(copTextField.getText().toString());

        // Assuming that One USD is equal to 3000 COP
        // Just convert it splitting by 3000
        Double usdMoney = ( copMoney / 3000 );

        // Show it in a Toast with 2 decimal places
        Toast.makeText(MainActivity.this, "USD " + String.format("%.2f", usdMoney) ,Toast.LENGTH_LONG).show();
    }
    public static double convertToDouble(String copField){
        String cop = copField;

        // Remove comas and blank spaces
        String noComa = cop.replaceAll(",","").trim();
        String noSpace = noComa.replaceAll(" ", "");

        // Parse the result to Double
        double result = Double.parseDouble(noSpace);
        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
