package com.ms.square.android.expandabletextview.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.ms.square.android.mymodule.app.R;

/**
 * Created by Í∆Œ∞ on 2015/7/5.
 */
public class MainActivity extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        ExpandableTextView expTv1 = (ExpandableTextView) findViewById(R.id.expand_text_view);
        expTv1.setOnExpandStateChangeListener(new ExpandableTextView.OnExpandStateChangeListener() {
            @Override
            public void onExpandStateChanged(TextView textView, boolean isExpanded) {
               //Toast.makeText(getActivity(), isExpanded ? "Expanded" : "Collapsed", Toast.LENGTH_SHORT).show();
            }
        });

        expTv1.setText(getString(R.string.dummy_text1));
    }

}
