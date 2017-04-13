package pcfreittas.exemplowebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        WebView wv = (WebView) findViewById(R.id.webView2);
        WebSettings configurar = wv.getSettings();
        configurar.setJavaScriptEnabled(true);
        wv.addJavascriptInterface(this, "ads");
        wv.loadUrl("file:///android_asset/meu.html");
    }

    @JavascriptInterface
    public void showToast(String n, String i){
        Toast.makeText(this,"Nome: + n + Idade:"+i, Toast.LENGTH_LONG).show();
    }

}
