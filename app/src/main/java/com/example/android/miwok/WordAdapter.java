package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.translation_view, parent, false);
        }
        Word current_word = getItem(position);
        ImageView display = (ImageView)listView.findViewById(R.id.descriptive_image);
        display.setImageResource(current_word.getImageResource());

        if(current_word.Visibiity()==0){
            display.setVisibility(View.VISIBLE);
        }
        else {
            display.setVisibility(View.GONE);
        }
        TextView mivok = (TextView) listView.findViewById(R.id.miwok_translation);
        mivok.setText(current_word.getMivokTranslation());

        TextView english = (TextView) listView.findViewById(R.id.english_translation);
        english.setText(current_word.getDefaultText());
        return listView;

    }

    public WordAdapter(Activity context, ArrayList<Word> list) {
        super(context, 0, list);
    }
}
