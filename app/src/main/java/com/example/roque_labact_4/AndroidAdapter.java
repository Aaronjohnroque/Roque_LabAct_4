package com.example.roque_labact_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AndroidAdapter extends ArrayAdapter<AndroidVersion> {
    private Context context;
    private int resource;

    public AndroidAdapter(@NonNull Context context, int resource, @NonNull List<AndroidVersion> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }
    @NonNull
    @Override
    public View getView(int i, @Nullable View convertView, @NonNull ViewGroup parent){
        int logo = getItem(i).getLogo();
        String version = getItem(i).getverTitle();
        String country = getItem(i).getverCountry();
        String industry = getItem(i).getverIndustry();
        String ceo = getItem(i).getVerCeo();



        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resource, parent, false);

        ImageView img = convertView.findViewById(R.id.ivLogo);
        TextView verTitle = convertView.findViewById(R.id.tvTitle);
        TextView verCountry = convertView.findViewById(R.id.tvCountry);
        TextView verIndustry = convertView.findViewById(R.id.tvIndustry);
        TextView verCeo = convertView.findViewById(R.id.tvCeo);


        img.setImageResource(logo);
        verTitle.setText(version);
        verCountry.setText(country);
        verIndustry.setText(industry);
        verCeo.setText(ceo);


        return convertView;
    }
}