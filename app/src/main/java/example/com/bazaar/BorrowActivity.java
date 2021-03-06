package example.com.bazaar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class BorrowActivity extends Home {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //inflate your activity layout here!
        View contentView = inflater.inflate(R.layout.activity_borrow, null, false);
        drawer.addView(contentView, 0);
        fab.setVisibility(View.INVISIBLE);
    }
    public void openPayment(View view) {
        Intent intent = new Intent(this, PaymentMainActivity.class);
        startActivity(intent);
    }
}
