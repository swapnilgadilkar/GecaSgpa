package com.example.swapn.gecacgpa;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{


    public static String branch;



    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);




        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId())
            {
                case R.id.branch_Mech:
                    displayMessage("Mechanical Engineering");
                    drawerLayout.closeDrawers();
                    branch = "Mechanical";
                    return true;
                case R.id.branch_Civil:
                    displayMessage("Civil Engineering");
                    drawerLayout.closeDrawers();
                    branch = "Civil";
                    return true;
                case R.id.branch_Elec:
                    displayMessage("Electrical Engineering");
                    drawerLayout.closeDrawers();
                    branch = "Electrical";
                    return true;
                case R.id.branch_Mca:
                    displayMessage("MCA Engineering");
                    drawerLayout.closeDrawers();
                    branch = "MCA";
                    return true;
                case R.id.branch_ETC:
                    displayMessage("ETC Engineering");
                    drawerLayout.closeDrawers();
                    branch = "ETC";
                    return true;
                case R.id.branch_It:
                    displayMessage("IT Engineering");
                    drawerLayout.closeDrawers();
                    branch = "IT";
                    return true;
                case R.id.branch_Comp:
                    displayMessage("CSE Engineering");
                    drawerLayout.closeDrawers();
                    branch = "CSE";
                    return true;

                case R.id.about_us:
                    drawerLayout.closeDrawers();
                    Intent abt = new Intent(MainActivity.this,AboutUs.class);
                    startActivity(abt);
                    return true;

            }
            navigationView.setCheckedItem(R.id.slct_dept);
            return false;
        }
    });
}
    public void displayMessage(String message)
    {
        //Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this,Mech_Sem.class);

        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
            {
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }



    //

}
