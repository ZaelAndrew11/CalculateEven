package cl.aguzman.calculateeven;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements EvenCallback{

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.valueEt);
        Button button = (Button) findViewById(R.id.resultBtn);
        textView = (TextView) findViewById(R.id.responseTv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                new EvenCalculation(MainActivity.this).evenCalculation(value);
            }
        });
    }

    @Override
    public void evenResult(String value) {
        textView.setText("El número es par "+ value);
    }

    @Override
    public void blankInput() {
        textView.setText("No es par :(");
    }
}
