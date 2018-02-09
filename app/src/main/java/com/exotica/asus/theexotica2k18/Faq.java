package com.exotica.asus.theexotica2k18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Faq extends AppCompatActivity {

    ExpandableListView expandableListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        expandableListView = (ExpandableListView) findViewById(R.id.expview);
        List<String> Headings = new ArrayList<String>();
        List<String> L1 = new ArrayList<String>();
        List<String> L2 = new ArrayList<String>();
        List<String> L3 = new ArrayList<String>();
        List<String> L4 = new ArrayList<String>();
        List<String> L5 = new ArrayList<String>();
        List<String> L6 = new ArrayList<String>();
        List<String> L7 = new ArrayList<String>();
        HashMap<String, List<String>> Childlist = new HashMap<String, List<String>>();
        String heading_items[] = getResources().getStringArray(R.array.questions);
        String l1[] = getResources().getStringArray(R.array.answer1);
        String l2[] = getResources().getStringArray(R.array.answer2);
        String l3[] = getResources().getStringArray(R.array.answer3);
        String l4[] = getResources().getStringArray(R.array.answer4);
        String l5[] = getResources().getStringArray(R.array.answer5);
        String l6[] = getResources().getStringArray(R.array.answer6);
        String l7[] = getResources().getStringArray(R.array.answer7);
        for (String title : heading_items) {
            Headings.add(title);
        }
        for (String title : l1) {
            L1.add(title);
        }
        for (String title : l2) {
            L2.add(title);
        }
        for (String title : l3) {
            L3.add(title);
        }
        for (String title : l4) {
            L4.add(title);
        }
        for (String title : l5) {
            L5.add(title);
        }
        for (String title : l6) {
            L6.add(title);
        }
        for (String title : l7) {
            L7.add(title);
        }
        Childlist.put(Headings.get(0), L1);
        Childlist.put(Headings.get(1), L2);
        Childlist.put(Headings.get(2), L3);
        Childlist.put(Headings.get(3), L4);
        Childlist.put(Headings.get(4), L5);
        Childlist.put(Headings.get(5), L6);
        Childlist.put(Headings.get(6), L7);

        MyAdapter myAdapter = new MyAdapter(this, Headings, Childlist);
        expandableListView.setAdapter(myAdapter);

    }
    }

