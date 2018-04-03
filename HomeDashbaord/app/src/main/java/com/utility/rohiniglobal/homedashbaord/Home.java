package com.utility.rohiniglobal.homedashbaord;

import android.animation.Animator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity implements View.OnClickListener{
    CardView subscriptionCard, blogCard, statisticsCard, contactCard ;
    Intent i ;
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ll = (LinearLayout) findViewById(R.id.ll);
        subscriptionCard = (CardView) findViewById(R.id.subscriptionId);
        blogCard = (CardView) findViewById(R.id.blogId);
        statisticsCard = (CardView) findViewById(R.id.statisticsId);
        contactCard = (CardView) findViewById(R.id.contactId);
        subscriptionCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}