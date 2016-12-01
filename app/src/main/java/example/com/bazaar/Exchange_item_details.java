package example.com.bazaar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static example.com.bazaar.Exchange_items.itemList;

public class Exchange_item_details extends AppCompatActivity {

    private static String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange_item_details);



        TextView desc = (TextView) findViewById(R.id.exchange_desTextView);
        TextView price = (TextView) findViewById(R.id.exchange_priceTextView);
        TextView name = (TextView) findViewById(R.id.exchange_nameTextView);

        int position = getIntent().getExtras().getInt("id");
        ImageView imageView = (ImageView) findViewById(R.id.full_image);


        //imageView.setImageResource(Buy_items.images[position]);
        String imageUrl =   itemList.get(position).getSellItem_imageURL();
        Uri myImageUri = Uri.parse(imageUrl);

        Picasso.with(Exchange_item_details.this).load(myImageUri).fit().centerCrop().into(imageView);

        desc.setText(itemList.get(position).getItemDes());

        price.setText(itemList.get(position).getItemPrice());
        name.setText(itemList.get(position).getItemDescription());
        setUserName(itemList.get(position).getUserName());

    }
    protected void openExchangeActivity(View view)
    {
        Intent intent = new Intent(this, ExchangeBuyerSideActivity.class);
        startActivity(intent);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName()
    {
        return userName;

    }
}
