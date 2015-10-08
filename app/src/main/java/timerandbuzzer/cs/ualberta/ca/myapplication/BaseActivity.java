package timerandbuzzer.cs.ualberta.ca.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

/**
 * Created by teppie on 06/10/15.
 */
public class BaseActivity extends Activity {//////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);//////////////////
        super.onCreate(savedInstanceState);
    }

}