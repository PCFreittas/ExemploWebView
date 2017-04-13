package pcfreittas.exemplowebview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wv = (WebView) findViewById(R.id.webView1);
        wv.loadUrl("http://www.google.com.br");

        wv.setWebViewClient(new WebViewClient(){
           public  void carregar(WebView view, String url){
               view.loadUrl(url);
           }
        });

    }

    public void chamarTela2(View v){
        Intent it = new Intent(this, Tela2Activity.class);
        startActivity(it);
    }

}
