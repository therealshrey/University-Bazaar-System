package example.com.bazaar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Exchange_item_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange_item_details);


        int position = getIntent().getExtras().getInt("id");
        ImageView imageView = (ImageView) findViewById(R.id.full_image);


        //imageView.setImageResource(Buy_items.images[position]);
        Picasso.with(getApplicationContext()).load(Buy_items.images[position]).into(imageView);

    }
    protected void openExchangeActivity(View view)
    {
        Intent intent = new Intent(this, ExchangeBuyerSideActivity.class);
        startActivity(intent);
    }
}
