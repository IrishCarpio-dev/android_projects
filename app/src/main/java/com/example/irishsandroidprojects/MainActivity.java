package com.example.irishsandroidprojects;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Getting Started App", "My very first project, the default 'Hello World app.'", R.drawable.getting_started),
                new Project("Quote App", "Making the simple change to the layout, with my own personal motivational quote for software developers", R.drawable.quote),
                new Project("BMI Calculator","A real life working BMI calculator where I learned about Variables, Methods and Conditional Logic'", R.drawable.calculator),
                new Project("Inches Converter App", "A basic converter to convert inches to meters (my own personal calculator app made on my own)", R.drawable.tape),
                new Project("The Hungry Developer App", "A menu app for fictional restaurant, learning about Activities, Classes & Objects, Arrays, Intents and ListViews", R.drawable.hungry_developer)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);


    }
}