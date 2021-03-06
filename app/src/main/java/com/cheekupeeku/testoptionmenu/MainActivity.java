package com.cheekupeeku.testoptionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item,menu);
        /*
        menu.add("Home");
        menu.add("About us");
        menu.add("Contact us");
        menu.add("Login");
        menu.add("New user?");
        */
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.menuHome){
            Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.menuNewUser){
            Toast.makeText(this, "New user clicked", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.menuOwner){
            Toast.makeText(this, "Owner clicked", Toast.LENGTH_SHORT).show();
        }
        /*
        String title = item.getTitle().toString();
        if(title.equals("Home")){
            Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show();
        }
        else if(title.equals("About us")){
            Toast.makeText(this, "About us clicked", Toast.LENGTH_SHORT).show();
        }
        else if (title.equals("Contact us")){
            Toast.makeText(this, "Contact clicked", Toast.LENGTH_SHORT).show();
        }
        else if(title.equals("Login")){
            Toast.makeText(this, "Login clicked", Toast.LENGTH_SHORT).show();
        }
        else if(title.equals("New user?")){
            Toast.makeText(this, "New user clicked", Toast.LENGTH_SHORT).show();
        }
        */
        return super.onOptionsItemSelected(item);
    }
}