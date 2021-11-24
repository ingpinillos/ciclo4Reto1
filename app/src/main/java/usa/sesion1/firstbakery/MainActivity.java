package usa.sesion1.firstbakery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boton1;
    TextView texto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto1.setText("Fisrt Bakery..!");
                Toast.makeText(getApplicationContext(), "oprimio un boton", Toast.LENGTH_LONG ).show();
            }
        });
        texto1 = (TextView) findViewById(R.id.texto1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.products:
                Toast.makeText(getApplicationContext(), "Productos", Toast.LENGTH_LONG ).show();
                /*
                Intent productScreen = new Intent(this, productsActivity.class);
                startActivity(productScreen);
                */
                return true;
            case R.id.services:
                Toast.makeText(getApplicationContext(), "Servicios", Toast.LENGTH_LONG ).show();
                /*
                Intent serviceScreen = new Intent(this, servicesActivity.class);
                startActivity(serviceScreen);
                 */
                return true;
            case R.id.branches:
                Toast.makeText(getApplicationContext(), "Sucursales", Toast.LENGTH_LONG ).show();
                /*
                Intent brancheScreen = new Intent(this, branchesActivity.class);
                startActivity(brancheScreen);
                */
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
