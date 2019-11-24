package com.example.farmerapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.example.farmerapp.ui.CategoriesFragment;
import com.example.farmerapp.ui.CustomerCareFragment;
import com.example.farmerapp.ui.FAQFragment;
import com.example.farmerapp.ui.FrequentlyBoughtFragment;
import com.example.farmerapp.ui.HomeFragment;
import com.example.farmerapp.ui.ManageAddressFragment;
import com.example.farmerapp.ui.MyAccountFragment;
import com.example.farmerapp.ui.MyOrdersFragment;
import com.example.farmerapp.ui.MyStoreFragment;
import com.example.farmerapp.ui.NotificationFragment;

import android.view.MenuItem;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.farmerapp.ui.PaymentOptionsFragment;
import com.example.farmerapp.ui.ReferAndEarnFragment;
import com.example.farmerapp.ui.WishListFragment;
import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener  {
    private AppBarConfiguration mAppBarConfiguration;
    public static ImageView notificationIcon;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        notificationIcon = findViewById(R.id.notificationIcon);
        builder = new AlertDialog.Builder(this);
        notificationIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displaySelectedScreen(R.id.notificationIcon);
            }
        });
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //add this line to display menu1 when the activity is loaded
        displaySelectedScreen(R.id.nav_home);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_my_orders) {
            displaySelectedScreen(R.id.action_my_orders);
        } else if (id == R.id.action_wishlist) {
            displaySelectedScreen(R.id.action_wishlist);
        } else if (id == R.id.action_my_store) {
            displaySelectedScreen(R.id.action_my_store);
        }
        return super.onOptionsItemSelected(item);
    }
    private void displaySelectedScreen(int itemId) {
        //creating fragment object
        Fragment fragment = null;
        //initializing the fragment object which is selected
        switch (itemId) {
            case R.id.nav_home:
                fragment = new HomeFragment();
                break;
            case R.id.nav_my_account:
                fragment = new MyAccountFragment();
                break;
            case R.id.nav_categories:
                fragment = new CategoriesFragment();
                break;
//            case R.id.nav_notification:
//                fragment = new NotificationFragment();
//                break;
            case R.id.nav_manage_address:
                fragment = new ManageAddressFragment();
                break;
            case R.id.nav_payment_option:
                fragment = new PaymentOptionsFragment();
                break;
            case R.id.nav_refer_and_earn:
                fragment = new ReferAndEarnFragment();
                break;
            case R.id.nav_customer_care:
                fragment = new CustomerCareFragment();
                break;
            case R.id.nav_faq:
                fragment = new FAQFragment();
                break;
            case R.id.nav_frequently_bought:
                fragment = new FrequentlyBoughtFragment();
                break;
            case R.id.nav_logout:
                showAlert();
                break;
            case R.id.notificationIcon:
                fragment = new NotificationFragment();
                break;
            case R.id.action_my_orders:
                fragment = new MyOrdersFragment();
                break;
            case R.id.action_wishlist:
                fragment = new WishListFragment();
                break;
            case R.id.action_my_store:
                fragment = new MyStoreFragment();
                break;
        }
        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    private void showAlert() {
        builder.setMessage("Are you sure? You want to logout?") .setTitle("Logout!!!");
        builder.setMessage("Do you want to close this application ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(HomeActivity.this,
                                LoginActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
        alert.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.black));
        alert.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.black));
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        //calling the method displayselectedscreen and passing the id of selected menu
        displaySelectedScreen(item.getItemId());
        //make this method blank
        return true;
    }
}