package devsbox.suraofojilot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AllView extends AppCompatActivity {

    TextView title, upo;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_view);

        // Load an ad into the AdMob banner view.//////////////////////////////////////////////
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);
        ///////////////////////////////////////////////////////////////////////////////////////

        title = (TextView) findViewById(R.id.headingtextView);
        upo = (TextView) findViewById(R.id.alltextView);

        title.setText(getIntent().getStringExtra("titel_name"));
        upo.setText(getIntent().getStringExtra("upodetail_name"));

        back = (ImageView) findViewById(R.id.backImageView);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}
