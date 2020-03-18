package tbc.dma.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        TextView hello = findViewById(R.id.textViewHello);
        TextView counter = findViewById(R.id.textViewCounter);

        Intent intent = getIntent();
        String helloText = intent.getStringExtra("HelloKey");
        String countValue = intent.getStringExtra("CounterKey");
        Log.d("TAG", "onCreate: "+countValue);
        hello.setText(helloText);
        counter.setText(countValue);

    }
}
