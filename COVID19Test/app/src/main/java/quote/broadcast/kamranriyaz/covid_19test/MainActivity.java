package quote.broadcast.kamranriyaz.covid_19test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //int valFever , valCough, valDbreathing, valSmell, valTaste, valGIP, valConfusion, valTravel;
    CheckBox cbFever, cbCough,cbDbreathing, cbSmell, cbTaste, cbGIP, cbConfusion, cbTravel;
    //private Object CheckBox;
    MediaPlayer m1,m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbFever = findViewById(R.id.FeverCheckBox);
        cbCough = findViewById(R.id.DryCoughCheckBox);
        cbDbreathing = findViewById(R.id.DifficultyBreathingCheckBox);
        cbSmell = findViewById(R.id.LackOfSmellCheckBox);
        cbTaste = findViewById(R.id.LackOfTastecheckBox);
        cbGIP = findViewById(R.id.GastrointestinalCheckBox);
        cbConfusion = findViewById(R.id.ConfusionCheckBox);
        cbTravel = findViewById(R.id.TravelHistoryCheckBox);



        AlertDialog openingDialog = new AlertDialog.Builder(this).setTitle("CAUTION!")
                .setIcon(android.R.drawable.ic_dialog_alert)

                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //set what would happen when positive button is clicked


                    }
                })
//set negative button
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //set what should happen when negative button is clicked
                        finish();
                        //Toast.makeText(getApplicationContext(),"Nothing Happened",Toast.LENGTH_LONG).show();
                    }
                })


                .setMessage("DISCLAIMER: Use this App at your own risk. \nCovid-19 infections are riskier if you have underlying health conditions such as diabetes, chronic lung disease or asthma, heart failure or heart disease, sickle cell anemia, cancer (or are undergoing chemotherapy), kidney disease with dialysis, a body mass index (BMI) over 40 (extremely obese) or an autoimmune disorder." +
                        "\nAlso if you are pregnant or your age is greater than 60 please consult your physician." +
                        "\nDO YOU AGREE? ").show();



    }

  public void ConsultMsg(){
      Toast.makeText(this,"Go for COVID-19 Test!",Toast.LENGTH_LONG).show();
      //m1.start();


  }
   /* public void FeverCBclick(View view) {
        Toast.makeText(getApplicationContext(),"Nothing Happened",Toast.LENGTH_LONG).show();
    }*/

    public void ConsultClick(View view) {
        //Toast.makeText(getApplicationContext(),"Nothing Happened",Toast.LENGTH_LONG).show();
   if(cbFever.isChecked() == true && cbCough.isChecked() == true && cbDbreathing.isChecked() == true){
       final MediaPlayer m1 = MediaPlayer.create(this,R.raw.a1);
       m1.start();
       ConsultMsg();
   }

   else if(cbFever.isChecked() == true && cbDbreathing.isChecked() == true) {
       final MediaPlayer m1 = MediaPlayer.create(this,R.raw.a1);
       m1.start();
       ConsultMsg();
   }
   else if(cbSmell.isChecked() == true && cbTaste.isChecked() == true){
       final MediaPlayer m1 = MediaPlayer.create(this,R.raw.a1);
       m1.start();
       ConsultMsg();
   }

   else if(cbGIP.isChecked() == true && cbFever.isChecked() && cbCough.isChecked() && cbDbreathing.isChecked()){
       final MediaPlayer m1 = MediaPlayer.create(this,R.raw.a1);
       m1.start();
       ConsultMsg();
   }

   else if (cbDbreathing.isChecked() == true) {
       final MediaPlayer m1 = MediaPlayer.create(this,R.raw.a1);
       m1.start();
       ConsultMsg();
   }

   else if (cbConfusion.isChecked() == true && cbDbreathing.isChecked()) {
       final MediaPlayer m1 = MediaPlayer.create(this,R.raw.a1);
       m1.start();
       ConsultMsg();
   }

   else if(cbTravel.isChecked() == true){
       final MediaPlayer m1 = MediaPlayer.create(this,R.raw.a1);
       m1.start();
       ConsultMsg();
   }

   else if (cbFever.isChecked() && cbCough.isChecked()){
       final MediaPlayer m1 = MediaPlayer.create(this,R.raw.a1);
       m1.start();
       ConsultMsg();
   }



   else {

       final MediaPlayer m2 = MediaPlayer.create(this,R.raw.a2);
       m2.start();
       Toast.makeText(this,"It can be other condition!",Toast.LENGTH_LONG).show();
   }



    }

    public void AboutClick(View view) {
        Intent About = new Intent(this,AboutActivity.class);
        startActivity(About);

    }
}

