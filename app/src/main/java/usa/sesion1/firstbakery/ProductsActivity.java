package usa.sesion1.firstbakery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class ProductsActivity extends AppCompatActivity {

    Drawable drawable1, drawable2, drawable3, drawable4;
    ImageView image1, image2, image3, image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        //--------------------------------------------------------
        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.prd1, getTheme());

        image1 = (ImageView) findViewById(R.id.imagen1.imagenview);
        image1.setImageDrawable(drawable1);

        //--------------------------------------------------------
        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.prd2, getTheme());

        image2= (ImageView) findViewById(R.id.imagen2.imagenview);
        image2.setImageDrawable(drawable2);

        //--------------------------------------------------------
        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.prd3, getTheme());

        image3= (ImageView) findViewById(R.id.imagen3.imagenview);
        image3.setImageDrawable(drawable3);

        //--------------------------------------------------------
        Resources res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.prd4, getTheme());

        image4= (ImageView) findViewById(R.id.imagen3.imagenview);
        image4.setImageDrawable(drawable4);

    }
}