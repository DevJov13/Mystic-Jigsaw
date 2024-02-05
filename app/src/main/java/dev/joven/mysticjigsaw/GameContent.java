package dev.joven.mysticjigsaw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GameContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_content);


        getWindow().setFlags(1024, 1024);

        WebView contentapp = findViewById(R.id.GameContent);
        contentapp.setWebViewClient(new WebViewClient());
        contentapp.getSettings().setJavaScriptEnabled(true);
        contentapp.loadUrl("file:///android_asset/Picture-Puzzle/index.html");

    }
}