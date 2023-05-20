package com.example.tictactoe270;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int player=1; //player 1 is cross
    int [][]winning={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    int []gamestate={-1,-1,-1,-1,-1,-1,-1,-1,-1};

    public void load(View view){
        ImageView v=(ImageView) view;
        int tag=Integer.parseInt(v.getTag().toString());
        if (player==1) {
            v.setImageResource(R.drawable.pinclipart_com_closing_clip_art_992857__1_);
            gamestate[tag]=player;
            Toast.makeText(this,tag+""+"Cross",Toast.LENGTH_SHORT).show();
            player=0;
        }
        else{
            v.setImageResource(R.drawable._2518786_141845487620_2);
            gamestate[tag]=player;
            Toast.makeText(this,tag+""+"Zero",Toast.LENGTH_SHORT).show();
            player=1;
        }
        for(int i=0;i< winning.length;i++){
            if (gamestate[winning[i][0]]==gamestate[winning[i][1]] && gamestate[winning[i][1]]==gamestate[winning[i][2]] && gamestate[winning[i][0]]>-1){
                Toast.makeText(this, "Winner is "+(player==0?1:0), Toast.LENGTH_SHORT).show();
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}