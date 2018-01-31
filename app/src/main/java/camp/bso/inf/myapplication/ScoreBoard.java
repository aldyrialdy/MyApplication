package camp.bso.inf.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ScoreBoard extends AppCompatActivity {

    Button minpersib, pluspersib;
    Button minpersija, pluspersija;
    Button reset, berita, map;
    TextView skorpersib, skorpersija;
    int skorValPersib, skorValPersija;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);
        minpersib = (Button) findViewById(R.id.minuspersib);
        pluspersib = (Button) findViewById(R.id.pluspersib);
        minpersija = (Button) findViewById(R.id.minuspersija);
        pluspersija = (Button) findViewById(R.id.pluspersija);
        skorpersib = (TextView) findViewById(R.id.text1);
        skorpersija = (TextView) findViewById(R.id.text3);
        reset = (Button) findViewById(R.id.reset);
        berita = (Button) findViewById(R.id.berita);
        map = (Button) findViewById(R.id.map);

        skorValPersib = 0;
        skorValPersija = 0;


        minpersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorValPersib = skorValPersib-1;
                skorpersib.setText(String.valueOf(skorValPersib));
            }
        });

        pluspersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorValPersib = skorValPersib+1;
                skorpersib.setText(String.valueOf(skorValPersib));

            }
        });

        minpersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorValPersija = skorValPersija-1;
                skorpersija.setText(String.valueOf(skorValPersija));
            }
        });

        pluspersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorValPersija = skorValPersija+1;
                skorpersija.setText(String.valueOf(skorValPersija));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorpersib.setText(String.valueOf(0));
                skorpersija.setText(String.valueOf(0));
            }
        });

        berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "https://sport.detik.com/sepakbola/liga-indonesia/3712578/berhenti-di-menit-83-persija-ungguli-persib-1-0";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:-6.957350, 107.712083");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

    }
}
