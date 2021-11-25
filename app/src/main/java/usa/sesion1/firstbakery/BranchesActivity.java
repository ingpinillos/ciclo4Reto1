package usa.sesion1.firstbakery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class BranchesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branches);
        Toast.makeText(getApplicationContext(), "Branches", Toast.LENGTH_LONG ).show();
    }
}