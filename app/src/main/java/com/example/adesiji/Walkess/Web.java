package com.example.adesiji.Walkess;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by adesiji on 16/12/2015.
 */
public class Web extends AppCompatActivity {
    private static Button button_sbm;
    private static EditText url_text;
    private static WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
        openUrl();

    }
    public void openUrl(){
        // declare the variable
        button_sbm = (Button)findViewById(R.id.button);
        url_text = (EditText)findViewById(R.id.editText);
        browser = (WebView)findViewById(R.id.webView);

        button_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = url_text.getText().toString();
                browser.getSettings().setLoadsImagesAutomatically(true);
                browser.getSettings().setJavaScriptEnabled(true);
                browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

                // Call for the loading of url
                browser.loadUrl(url);
            }
        });
    }
}
