package com.example.tecinfo.append;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id = menuItem.getItemId();

        if (id == R.id.configuracao){
            Toast.makeText(getApplicationContext(), "Abrir Configuarações", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.calculadoramedia){
            Toast.makeText(getApplicationContext(), "Abrir Calculadora Média", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.calculadora){
            Toast.makeText(getApplicationContext(), "Calculadora", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.chamadafalsa) {
            Toast.makeText(getApplicationContext(), "Call false", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.perfil){
            Toast.makeText(getApplicationContext(), "Perfil", Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
