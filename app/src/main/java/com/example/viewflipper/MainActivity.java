package com.example.viewflipper;

import android.graphics.Color;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 无 title
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // 全屏
        getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN ,WindowManager.LayoutParams. FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
       Toast toast= Toast.makeText(MainActivity.this,"我是toast",Toast.LENGTH_LONG);
        toast.show();
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(5000);
        LinearLayout layout = (LinearLayout) toast.getView();
        TextView tv=(TextView)layout.findViewById(android.R.id.message);
        tv.setTextColor(Color.RED);

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.pic2);
        layout.addView(image, 0);

    }
}
