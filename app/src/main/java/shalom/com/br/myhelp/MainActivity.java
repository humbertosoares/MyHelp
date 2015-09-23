package shalom.com.br.myhelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText unidade;
    private EditText categoria;
    private EditText descricao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.unidade = (EditText) findViewById(R.id.unidadeEditText);
        this.descricao = (EditText) findViewById(R.id.descricaoEditText);



    }

    public void selecionarOpcao(View view){
        switch (view.getId()){
            case R.id.chamado:
                startActivity(new Intent(this, AbrirChamadoActivity.class));
                break;
            case R.id.cancelar:
                String mensagem = "Falta Implementar ";
                Toast.makeText(getApplicationContext(), mensagem,
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
