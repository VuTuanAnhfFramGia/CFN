package framgia.vn.cfn.utils;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

import java.util.Locale;

import framgia.vn.cfn.model.Constant;

/**
 * Created by toannguyen201194 on 02/11/2016.
 */
public class SettingUtils implements Constant {
    public static String getLanguage() {
        return SpManager.getInstance().getString(CONFIG_LANG, LANG_EN);
    }

    public static void setLanguage(String language) {
        SpManager.getInstance().putString(CONFIG_LANG, language);
    }

    public static void setLocale(String lang, Resources resources) {
        Locale myLocale = new Locale(lang);
        DisplayMetrics dm = resources.getDisplayMetrics();
        Configuration conf = resources.getConfiguration();
        conf.locale = myLocale;
        resources.updateConfiguration(conf, dm);
    }
}
