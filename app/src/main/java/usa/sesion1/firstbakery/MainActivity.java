package usa.sesion1.firstbakery;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button) findViewById(R.id.button1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Algún día vamos a re dirigir a WhatsApp", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.products:
                Toast.makeText(getApplicationContext(), "Products", Toast.LENGTH_LONG).show();
                Intent productScreen = new Intent(this, ProductsActivity.class);
                startActivity(productScreen);
                return true;
            case R.id.services:
                Toast.makeText(getApplicationContext(), "Services", Toast.LENGTH_LONG).show();
                Intent serviceScreen = new Intent(this, ServicesActivity.class);
                startActivity(serviceScreen);
                return true;
            case R.id.branches:
                Toast.makeText(getApplicationContext(), "Branches", Toast.LENGTH_LONG).show();
                Intent branchScreen = new Intent(this, BranchesActivity.class);
                startActivity(branchScreen);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}

