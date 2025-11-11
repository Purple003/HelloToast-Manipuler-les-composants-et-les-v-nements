package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count = 0; // variable compteur
    private TextView textCount; // référence vers le TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // lie le XML

        // liaison avec les éléments XML
        textCount = findViewById(R.id.text_count);
        Button buttonToast = findViewById(R.id.button_toast);
        Button buttonCount = findViewById(R.id.button_count);

        // bouton pour afficher un message Toast
        buttonToast.setOnClickListener(v -> {
            Toast.makeText(this, "Bonjour !", Toast.LENGTH_SHORT).show();
        });

        // bouton pour incrémenter le compteur
        buttonCount.setOnClickListener(v -> {
            count++;
            textCount.setText(String.valueOf(count));
        });
    }
}
