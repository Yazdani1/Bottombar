package yazdani.bottombar;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarBadge;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends AppCompatActivity {
    BottomBar mbottombar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbottombar=BottomBar.attach(this,savedInstanceState);

        mbottombar.setItemsFromMenu(R.menu.bottombar_menu, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {

                if (menuItemId==R.id.first)
                {
                    OneFragment one=new OneFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,one).commit();
                }

                else if (menuItemId==R.id.second)
                {
                    TwoFragment tw=new TwoFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,tw).commit();
                }
                else if (menuItemId==R.id.third)
                {
                    ThreeFragment th=new ThreeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,th).commit();
                }
                else if (menuItemId==R.id.four)
                {
                    FourFragment four=new FourFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,four).commit();
                }
                else if (menuItemId==R.id.five)
                {
                    FiveFragment five=new FiveFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,five).commit();
                }


            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {

            }
        });

        mbottombar.mapColorForTab(0,"#91204d");
        mbottombar.mapColorForTab(1,"#452632");
        mbottombar.mapColorForTab(2,"#7C5526");
        mbottombar.mapColorForTab(3,"#300B2E");
        mbottombar.mapColorForTab(4,"#9C27B0");

        BottomBarBadge badge;

        badge=mbottombar.makeBadgeForTabAt(3,"#9C27B0",50);
        badge.show();


    }
}
