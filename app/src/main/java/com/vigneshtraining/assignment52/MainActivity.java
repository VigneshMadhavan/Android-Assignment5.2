package com.vigneshtraining.assignment52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater M =getMenuInflater();
        M.inflate(R.menu.my_menu,menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //item.setIcon(android.R.drawable.btn_star_big_on);
        Toast.makeText(this, "Selected: "+item.getTitle(), Toast.LENGTH_SHORT).show();

       

        return super.onOptionsItemSelected(item);
    }


}
