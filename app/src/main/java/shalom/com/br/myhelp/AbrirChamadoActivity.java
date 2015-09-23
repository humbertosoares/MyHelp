package shalom.com.br.myhelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class AbrirChamadoActivity extends AppCompatActivity {

    private EditText unidade;
    private Spinner categoriaSpinner;
    BootUpReceiver bradCast = new BootUpReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abrir_chamado);
        this.unidade = (EditText) findViewById(R.id.unidadeEditText);


        ArrayAdapter<CharSequence> categAdapter = ArrayAdapter.createFromResource(
                this, R.array.categorias,
                android.R.layout.simple_spinner_item);

        this.categoriaSpinner = (Spinner)findViewById(R.id.categSpinner);
        this.categoriaSpinner.setAdapter(categAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_abrir_chamado, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
