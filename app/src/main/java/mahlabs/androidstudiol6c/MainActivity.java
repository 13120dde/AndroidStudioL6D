package mahlabs.androidstudiol6c;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextViewCustom tvColor, tvColor2;
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instantiateComponents();
        addListener();

    }

    private void addListener() {
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            tvColor.colorize();
            tvColor2.colorize();
            }
        });
    }

    private void instantiateComponents() {
        tvColor = (TextViewCustom) findViewById(R.id.tvColor);
        tvColor2 = (TextViewCustom) findViewById(R.id.tvColor2);
        btnStart= (Button) findViewById(R.id.btnStart);

    }

    private void changeBackground(int values) {
        tvColor.setBackgroundColor(values);
        tvColor2.setBackgroundColor(values);
    }

}
