package com.leetinsider.motivationalquotes;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MotivationalActivity extends AppCompatActivity {
    // Assign local variables from other classes
    private QuoteVault mQuoteVault = new QuoteVault();
    private ColorWheel mColorWheel = new ColorWheel();

    // Assign View Variables
    private TextView mQuoteTextView;
    private Button mShowQuoteButton;
    private RelativeLayout mRelativeLayout;
    String quote = mQuoteVault.getQuote();
    int color = mColorWheel.getColor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivational);

        // Assign Views from layout to variables
        mQuoteTextView = (TextView) findViewById(R.id.quoteTextView);
        mShowQuoteButton = (Button) findViewById(R.id.showQuoteButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        // Update the quote on launch so the user does not get the same quote on each boot
        updateQuote();

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateQuote();
            }
        };

        mShowQuoteButton.setOnClickListener(listener);

    }

    public void updateQuote(){
        String quote = mQuoteVault.getQuote();
        int color = mColorWheel.getColor();
        mQuoteTextView.setText(quote);
        mRelativeLayout.setBackgroundColor(color);
        mShowQuoteButton.setTextColor(color);
    }

}
