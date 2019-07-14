package petrusproject.com.alc40androidchallenge1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        //assigning the webview object to the right webview by using the id
        WebView AclInfo = findViewById(R.id.about_alc_info);

        //setting the client webview
        AclInfo.setWebViewClient(new WebViewClient()
        {
            //SSL error handler
            public void onReceivedSslError(WebView view, SslErrorHandler sslErrorHandler, SslError sslError)
            {
                sslErrorHandler.proceed();
            }
        });
        //Loading the ALC website
        AclInfo.loadUrl("https://andela.com/alc/");
    }
}
