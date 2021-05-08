package quote.broadcast.kamranriyaz.covid_19test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_about);
    }

    public void fbClick(View view) {
        Intent fI = new Intent(Intent.ACTION_SENDTO);
        fI.setData(Uri.parse("mailto:kamranriyaz2@gmail.com"));
        startActivity(fI);
    }
}
