package framgia.vn.cfn;

import android.app.Application;

import framgia.vn.cfn.model.Constant;
import framgia.vn.cfn.utils.SettingUtils;
import framgia.vn.cfn.utils.SpManager;

/**
 * Created by toannguyen201194 on 02/11/2016.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SpManager.getInstance().init(this, Constant.CONFIG_LANG);
        String lang = SettingUtils.getLanguage();
        SettingUtils.setLocale(lang, getResources());
    }
}
