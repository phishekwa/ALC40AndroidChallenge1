package petrusproject.com.alc40androidchallenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button aboutALC;
    Button myProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Opening the About ALC website
        aboutALC = findViewById(R.id.about_alc);
        aboutALC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutAlcIntent = new Intent(MainActivity.this,AboutALC.class);
                startActivity(aboutAlcIntent);
            }
        });

        //Opening my Profile
        myProfile = findViewById(R.id.my_profile);
        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myProfileIntent = new Intent(MainActivity.this,MyProfile.class);
                startActivity(myProfileIntent);
            }
        });
    }
}
