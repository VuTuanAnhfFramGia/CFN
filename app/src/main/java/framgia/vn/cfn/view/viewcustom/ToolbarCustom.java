package framgia.vn.cfn.view.viewcustom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import framgia.vn.cfn.R;
import framgia.vn.cfn.controller.listener.OnItemListener;
import framgia.vn.cfn.model.Constant;
import framgia.vn.cfn.utils.SettingUtils;

import static framgia.vn.cfn.model.Constant.ID_LANG_EN;
import static framgia.vn.cfn.model.Constant.ID_LANG_JP;

/**
 * Created by toannguyen201194 on 02/11/2016.
 */
public class ToolbarCustom extends Toolbar {
    private TextView mTxtToolbar;
    private Spinner mSpinner;
    private ViewGroup mViewGroup;
    private OnItemListener mOnItemListener;

    public ToolbarCustom(Context context) {
        super(context);
        initialize();
    }

    public ToolbarCustom(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public ToolbarCustom(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
    }

    public void setOnItemSelectListenerSpinner(OnItemListener listener) {
        this.mOnItemListener = listener;
    }

    private void initialize() {
        ViewGroup viewGroup = (ViewGroup) inflate(getContext(), R.layout.toolbar_custom, this);
        mViewGroup = (ViewGroup) viewGroup.getChildAt(0);
        mTxtToolbar = (TextView) viewGroup.findViewById(R.id.text_toolbar);
        mSpinner = (Spinner) mViewGroup.findViewById(R.id.spinner);
        setupSpinner();
        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (mOnItemListener != null) {
                    mOnItemListener.onItemSelectedListener(position);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    private void setupSpinner() {
        String[] arr = getResources().getStringArray(R.array.change_language);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(), android.R.layout
            .simple_spinner_item, arr);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(arrayAdapter);
        mSpinner.setSelection(getCurrent());
    }

    private int getCurrent() {
        String lang = SettingUtils.getLanguage();
        switch (lang) {
            case Constant.LANG_JP:
                return ID_LANG_JP;
            case Constant.LANG_EN:
                return ID_LANG_EN;
            default:
                return ID_LANG_JP;
        }
    }
}