package com.leetinsider.motivationalquotes;

import java.util.Random;

public class QuoteVault {
    //Fields aka Member Variables - Properties about the object
    private String [] mQuoteList = {
            "Fall seven times, stand up eight",
            "As one door closes, another one will open",
            "Its not how fast you get there, as long as you do",
            "By failing to prepare, you are preparing to fail",
            "What lies before us and what lies behind us are small matters comapred to what" +
                    " lies within us",
            "Nature does not hurry, yet everything is accomplished",
            "Believe you can and your already half way there",
            "Everything will be okay in the end. If its not, then its not the end",
            "Its never too late to be what you might have been",
            "Ambition is the path to success. Persistence is the vehicle your arrive in",
            "Intelligence without wisdom is like a bird without wings"
    };
    //Methods - Actions object can take
    public String getQuote(){
        String quote;
        // Randomly Select a Quote
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mQuoteList.length);
        // Update the screen with our new quote
        quote = mQuoteList[randomNumber];

        return quote;
    };
}
