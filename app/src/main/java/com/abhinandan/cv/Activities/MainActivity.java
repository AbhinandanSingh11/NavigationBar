package com.abhinandan.cv.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.abhinandan.cv.Custom.CustomViewPager;
import com.abhinandan.cv.Fragments.Dialer;
import com.abhinandan.cv.Adapters.FragmentAdapter;
import com.abhinandan.cv.Fragments.Contacts;
import com.abhinandan.cv.Fragments.Dashboard;
import com.abhinandan.cv.Fragments.Home;
import com.abhinandan.cv.Fragments.Timeline;
import com.abhinandan.cv.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView Home,Clock,Dashboard,Dialer,Contacts,clickedHome,clickedClock,clickedDashboard,clickedDialer,clickedContacts;
    private ArrayList<Fragment> fragmentList;
    private CustomViewPager container;
    private CircleImageView profileImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(getResources().getColor(R.color.white,getApplication().getTheme()));




        container = findViewById(R.id.containerViewPager);
        container.setPagingEnabled(false);

        profileImageView = findViewById(R.id.ProfilePhotos);

        Glide.with(getApplicationContext())
                .load(getResources().getDrawable(R.drawable.header,getApplication().getTheme()))
                .fitCenter()
                .placeholder(R.drawable.header)
                .into(profileImageView);


        Home = findViewById(R.id.HomeImage);
        Clock = findViewById(R.id.TimeImage);
        Dashboard = findViewById(R.id.DashboardImage);
        Dialer = findViewById(R.id.ImageDialer);
        Contacts = findViewById(R.id.ImageContacts);


        clickedHome = findViewById(R.id.ClickedHome);
        clickedClock = findViewById(R.id.ClickedClock);
        clickedDashboard = findViewById(R.id.ClickedDashboard);
        clickedContacts = findViewById(R.id.ClickedContacts);
        clickedDialer = findViewById(R.id.ClickedDialer);

        SetUpViewPager(container);


        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickedHome.setVisibility(View.VISIBLE);
                clickedClock.setVisibility(View.INVISIBLE);
                clickedContacts.setVisibility(View.INVISIBLE);
                clickedDashboard.setVisibility(View.INVISIBLE);
                clickedDialer.setVisibility(View.INVISIBLE);
                container.setCurrentItem(0);
            }
        });

        Clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickedHome.setVisibility(View.INVISIBLE);
                clickedClock.setVisibility(View.VISIBLE);
                clickedContacts.setVisibility(View.INVISIBLE);
                clickedDashboard.setVisibility(View.INVISIBLE);
                clickedDialer.setVisibility(View.INVISIBLE);
                container.setCurrentItem(1);
            }
        });

        Dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickedHome.setVisibility(View.INVISIBLE);
                clickedClock.setVisibility(View.INVISIBLE);
                clickedContacts.setVisibility(View.INVISIBLE);
                clickedDashboard.setVisibility(View.VISIBLE);
                clickedDialer.setVisibility(View.INVISIBLE);
                container.setCurrentItem(2);

            }
        });

        Dialer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickedHome.setVisibility(View.INVISIBLE);
                clickedClock.setVisibility(View.INVISIBLE);
                clickedContacts.setVisibility(View.INVISIBLE);
                clickedDashboard.setVisibility(View.INVISIBLE);
                clickedDialer.setVisibility(View.VISIBLE);
                container.setCurrentItem(4);
            }
        });

        Contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickedHome.setVisibility(View.INVISIBLE);
                clickedClock.setVisibility(View.INVISIBLE);
                clickedContacts.setVisibility(View.VISIBLE);
                clickedDashboard.setVisibility(View.INVISIBLE);
                clickedDialer.setVisibility(View.INVISIBLE);
                container.setCurrentItem(3);
            }
        });
    }

    void SetUpViewPager(ViewPager viewPager){
        fragmentList = new ArrayList<>();
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),FragmentAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,fragmentList);
        fragmentList.add(new Home());
        fragmentList.add(new Timeline());
        fragmentList.add(new Dashboard());
        fragmentList.add(new Contacts());
        fragmentList.add(new Dialer());

        viewPager.setAdapter(fragmentAdapter);
        viewPager.setCurrentItem(0);

    }

}
