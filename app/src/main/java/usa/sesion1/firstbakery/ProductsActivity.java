package usa.sesion1.firstbakery;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProductsActivity extends AppCompatActivity {

    Drawable drawable1, drawable2, drawable3, drawable4, drawable5;
    ImageView image1, image2, image3, image4, image5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        Toast.makeText(getApplicationContext(), "Products", Toast.LENGTH_LONG ).show();
        /*
        //--------------------------------------------------------
        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.prd1, getTheme());

        image1 = (ImageView) findViewById(R.id.imageView1);
        image1.setImageDrawable(drawable1);

        //--------------------------------------------------------
        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.prd2, getTheme());

        image2 = (ImageView) findViewById(R.id.imageView2);
        image2.setImageDrawable(drawable2);

        //--------------------------------------------------------
        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.prd3, getTheme());

        image3 = (ImageView) findViewById(R.id.imageView3);
        image3.setImageDrawable(drawable3);

        //--------------------------------------------------------
        Resources res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.prd4, getTheme());

        image4 = (ImageView) findViewById(R.id.imageView4);
        image4.setImageDrawable(drawable4);

        //--------------------------------------------------------
        Resources res5 = getResources();
        drawable5 = res5.getDrawable(R.drawable.prd5, getTheme());

        image5 = (ImageView) findViewById(R.id.imageView5);
        image5.setImageDrawable(drawable5);


        */
    }
}