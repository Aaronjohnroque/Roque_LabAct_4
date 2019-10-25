package com.example.roque_labact_4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] verTitle, country, industry, ceo, sum;
    ListView lstversions;

    int[] logo = {R.drawable.ccb, R.drawable.aboc, R.drawable.boa, R.drawable.icbc, R.drawable.jpmorgan};

    ArrayList<AndroidVersion> versions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Top Global Companies");

        verTitle = getResources().getStringArray(R.array.verTitle);
        country = getResources().getStringArray(R.array.verCountry);
        industry = getResources().getStringArray(R.array.verIndustry);
        ceo = getResources().getStringArray(R.array.verCeo);
        sum = getResources().getStringArray(R.array.verSum);

        for(int i = 0; i < verTitle.length; i++){
            versions.add(new AndroidVersion(logo[i], verTitle[i], country[i], industry[i], ceo[i], sum[i]));
        }

        AndroidAdapter adapter = new AndroidAdapter(this, R.layout.item, versions);
        lstversions = findViewById(R.id.tvAndroid);
        lstversions.setAdapter(adapter);
        lstversions.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view,final int i, long id) {
        //Toast.makeText(this, verNames[i], Toast.LENGTH_LONG).show();
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setIcon(logo[i]);
        dialog.setTitle(verTitle[i]);
        dialog.setMessage( sum [i]);
        dialog.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, verTitle[i], Toast.LENGTH_LONG).show();
            }
        });
        dialog.create().show();

    }
}
