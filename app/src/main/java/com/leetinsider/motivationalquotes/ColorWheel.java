package com.leetinsider.motivationalquotes;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    //Fields aka Member Variables - Properties about the object
    private String [] mColorList = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
    //Methods - Actions object can take
    public int getColor(){
        String color;
        // Randomly Select a color
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColorList.length);
        // Update the background with our new color
        color = mColorList[randomNumber];
        // Transform color to an int so it can return back to main program
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    };
}