package com.unicornsved.smartgarden.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.unicornsved.smartgarden.MainActivity;
import com.unicornsved.smartgarden.R;
import com.unicornsved.smartgarden.placeholder.PlaceholderContent;

public class FlowerInfoActivity extends AppCompatActivity {

    static int flowerPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_info);

        Bundle arguments = getIntent().getExtras();
        if(arguments != null){
            flowerPosition = arguments.getInt(PlaceholderContent.Flower.class.getSimpleName());
            ((ImageView) findViewById(R.id.imageFlower)).setImageResource(PlaceholderContent.ITEMS.get(flowerPosition).FlowIm);
            ((TextView) findViewById(R.id.flowerName)).setText(PlaceholderContent.ITEMS.get(flowerPosition).name);
            ((TextView) findViewById(R.id.flowerPlace)).setText(PlaceholderContent.ITEMS.get(flowerPosition).place);
            ((TextView) findViewById(R.id.flowerSensor)).setText(PlaceholderContent.ITEMS.get(flowerPosition).sensor);
            ((TextView) findViewById(R.id.flowerHumidity)).setText(PlaceholderContent.ITEMS.get(flowerPosition).getHumidity() + " %");
            ((TextView) findViewById(R.id.flowerTemp)).setText(PlaceholderContent.ITEMS.get(flowerPosition).getTemp()+ " C");
            ((TextView) findViewById(R.id.flowerSun)).setText(PlaceholderContent.ITEMS.get(flowerPosition).getSun() + " %");

        }
    }
}