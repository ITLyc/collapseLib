package lyc.com.collapse_log;

import android.app.Application;

import lyc.com.collapselib.CrashHandler;

/**
 * Created by Administrator on 2017/9/1 0001.
 */

public class BaseActivity extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(getApplicationContext());
    }
}
