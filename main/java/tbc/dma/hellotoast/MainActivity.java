package tbc.dma.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        Button toast = findViewById(R.id.button_toast);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnotherActivity.class);
                intent.putExtra("CounterKey",  String.valueOf(mCount) );
                intent.putExtra("HelloKey", "Hello!");
                startActivity(intent);

            }
        });
        Button count = findViewById(R.id.button_count);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countUp();
            }
        });
    }
    public void countUp() {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(String.valueOf(mCount));
    }
}
