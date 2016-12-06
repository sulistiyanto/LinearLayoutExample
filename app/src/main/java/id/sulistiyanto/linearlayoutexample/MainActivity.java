package id.sulistiyanto.linearlayoutexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.button1) void vertical() {
        startActivity(new Intent(MainActivity.this, VerticalActivity.class));
    }

    @OnClick(R.id.button2) void horizontal() {
        startActivity(new Intent(MainActivity.this, HorizontalActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
