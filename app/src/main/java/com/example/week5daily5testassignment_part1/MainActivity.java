package com.example.week5daily5testassignment_part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {

        String testString = "Chicken Soup";

        String[] words = testString.split(" ");
        String pigLtnString = "";

        for (int i = 0; i < words.length; i++) {

            String aWord = words[i];

            String[] strings = aWord.split("(?=[aeiou])");

            String pigLtn = "";
            for (int j = 1; j < strings.length; j++){

                pigLtn = pigLtn + strings[j];

            }

            pigLtn = pigLtn + strings[0] + "ay";

            if(i == 0) {
                pigLtnString = pigLtnString + pigLtn;
            }
            else {
                pigLtnString = pigLtnString + " " + pigLtn;
            }
        }

        System.out.println(pigLtnString);
    }

}
