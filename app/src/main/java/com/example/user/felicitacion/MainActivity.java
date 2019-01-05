package com.example.user.felicitacion;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creamos un objeto de tipo typeFace para identificar la fuente
        Typeface miFuente=Typeface.createFromAsset(getAssets(),"Beauty and the Beast Sample.ttf"); //aqui tengo la fuente
        TextView titulo = (TextView) findViewById(R.id.titulo);  //aqui tengo la etiqueta
        titulo.setTypeface(miFuente);

        //ponemos en marcha el reproductor de musica, x eso hay que instanciar un objeto de tipo media player
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.happy_birthday);
        mediaPlayer.start();
    }
}
