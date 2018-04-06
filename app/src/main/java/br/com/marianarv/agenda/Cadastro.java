package br.com.marianarv.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public class Cadastro extends AppCompatActivity {
    EditText nome;
    EditText telefone;
    EditText email;
    Button salvar;
    List<Contato> listaContato = new ArrayList<Contato>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = (EditText) findViewById(R.id.nome);
        telefone = (EditText) findViewById(R.id.telefone);
        email = (EditText) findViewById(R.id.email);
        salvar = (Button) findViewById(R.id.action_add);

        public void onClick(View view) {
            Contato contato = new Contato();

            contato.setNome(nome.getText().toString());
            contato.setTelefone(telefone.getText().toString());
            contato.setEmail(email.getText().toString());

            listaContato.add(contato);

            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

    }
}
