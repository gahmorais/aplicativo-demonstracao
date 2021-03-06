package br.com.gabrielmorais.aplicativodemonstracao.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

import br.com.gabrielmorais.aplicativodemonstracao.R;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;
    NavController navController;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById( R.id.navigation );
        drawerLayout = findViewById( R.id.drawer );
        toolbar = findViewById( R.id.toolbar );
        toolbar.setTitle( "Aplicativo demonstração" );
        setSupportActionBar( toolbar );

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle( MainActivity.this , drawerLayout , toolbar , R.string.openDrawer , R.string.closeDrawer );
        drawerLayout.addDrawerListener( toggle );
        toggle.syncState();

        navController = Navigation.findNavController( this, R.id.navHostFragment );
        NavigationUI.setupWithNavController( navigationView, navController );

        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
                toolbar.setTitle( destination.getLabel() );
            }
        });
    }
}