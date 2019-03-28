package com.sudoajay.lodingAnimationExample;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * A simple data class of colors for this example.
 *
 */
public class ColorList {


    private List<Integer> list ;

    public ColorList(){

        // create object and fill it
        list= new ArrayList<>();
        list.add(Color.BLACK);
        list.add(Color.BLUE);
                list.add(Color.CYAN);
                list.add( Color.rgb(255, 165, 0));
                list.add( Color.GREEN);
                list.add( Color.rgb(0, 128, 0));
                list.add( Color.MAGENTA);
                list.add( Color.rgb(255, 192, 203));
                list.add( Color.YELLOW);
                list.add( Color.GRAY);
                list.add( Color.LTGRAY);
                list.add(Color.DKGRAY);
                list.add(Color.rgb(0, 255, 0) );
                list.add( Color.rgb(128, 128, 0));
                list.add( Color.rgb(128, 0, 128));
                list.add( Color.rgb(0, 128, 128));
                list.add( Color.rgb(0, 0, 128));
                list.add( Color.rgb(218, 165, 32));
                list.add( Color.rgb(85, 107, 47));
                list.add(Color.rgb(240, 230, 140));
                list.add(Color.rgb(70, 130, 180));
                list.add(Color.rgb(153, 50, 204));
                list.add(Color.WHITE);

    }

    public  Integer getNextColor() {

        return list.get(new Random(list.size()-1).nextInt());
    }


}