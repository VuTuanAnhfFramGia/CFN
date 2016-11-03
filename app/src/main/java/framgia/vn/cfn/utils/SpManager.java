package framgia.vn.cfn.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by toannguyen201194 on 02/11/2016.
 */
public class SpManager {
    private static SpManager sInstance;
    private SharedPreferences.Editor mEditor;
    private SharedPreferences mSettings;

    public static SpManager getInstance() {
        if (sInstance == null)
            sInstance = new SpManager();
        return sInstance;
    }

    public void init(Context context, String name) {
        mSettings = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        mEditor = mSettings.edit();
    }

    public String getString(String key, String defaultValue) {
        return mSettings.getString(key, defaultValue);
    }

    public void putString(String key, String value) {
        mEditor.putString(key, value).commit();
    }
}
