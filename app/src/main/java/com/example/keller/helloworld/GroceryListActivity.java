package com.example.keller.helloworld;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class GroceryListActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocerylist);

        configureHomeButton();
    }

    private void configureHomeButton(){
        //Button homeButton = findViewById(R.id.homeButton);
        /*homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                finish();
            }
        });*/
    }

}
