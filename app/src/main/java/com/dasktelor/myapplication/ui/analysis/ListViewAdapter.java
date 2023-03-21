package com.dasktelor.myapplication.ui.analysis;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;

import com.dasktelor.myapplication.R;
import com.dasktelor.myapplication.data.Analysis;

public class ListViewAdapter extends ArrayAdapter<Analysis> {
    public ListViewAdapter(Context context, Analysis[] arr) {
        super(context, R.layout.analysis_item, arr);


    }

}
