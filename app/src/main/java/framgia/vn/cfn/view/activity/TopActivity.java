package framgia.vn.cfn.view.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import framgia.vn.cfn.R;
import framgia.vn.cfn.model.top.Top;
import framgia.vn.cfn.view.adapter.TopRecyclerViewAdapter;
import framgia.vn.cfn.view.viewcustom.ToolbarCustom;

public class TopActivity extends BaseActivity {
    private RecyclerView mRecyclerView;
    private TopRecyclerViewAdapter mTopRecyclerViewAdapter;
    private List<Top> mTopList = new ArrayList<>();
    private TabLayout mTabLayout;
    private ToolbarCustom mToolbarCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        createData();
        initViews();
    }

    private void initViews() {
        mTopRecyclerViewAdapter = new TopRecyclerViewAdapter(this, mTopList);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mTopRecyclerViewAdapter);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout_setting);
        mToolbarCustom = (ToolbarCustom) findViewById(R.id.toolbar);
        if (mToolbarCustom != null) {
            mToolbarCustom.setOnItemSelectListenerSpinner(this);
        }
        createTab();
    }

    private void createTab() {
        mTabLayout.addTab(createTab("TOP", R.drawable.ic_account));
        mTabLayout.addTab(createTab("Resume", R.drawable.ic_description));
        mTabLayout.addTab(createTab("Message", R.drawable.ic_local_post_office));
        mTabLayout.addTab(createTab("Schedule", R.drawable.ic_event));
        mTabLayout.addTab(createTab("Settings", R.drawable.ic_settings));
    }

    private TabLayout.Tab createTab(String text, int resIdImage) {
        TabLayout.Tab tab = mTabLayout.newTab();
        tab.setCustomView(R.layout.tab_custom_item);
        View view = tab.getCustomView();
        assert view != null;
        TextView textView = (TextView) view.findViewById(R.id.text_tab_custom);
        textView.setText(text);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, resIdImage, 0, 0);
        return tab;
    }

    private void createData() {
        mTopList.add(new Top(
            "最新情報",
            "応募受付中の場合のみ、参加企業が追加されたタイミングで日付を更新し表示する",
            "出展企業情報",
            "参画社数＋掲載求人数をカウントし、更新日付として表示",
            "開催日",
            "イベント開催日を表示",
            "開催地情報",
            "Adminから設定された開催地住所を表示",
            "https://github.com/framgia/DISCO-Android"));
        mTopList.add(new Top(
            "最新情報",
            "応募受付中の場合のみ、参加企業が追加されたタイミングで日付を更新し表示する",
            "出展企業情報",
            "参画社数＋掲載求人数をカウントし、更新日付として表示",
            "開催日",
            "イベント開催日を表示",
            "開催地情報",
            "Adminから設定された開催地住所を表示",
            "https://github.com/framgia/DISCO-Android"));
    }
}
