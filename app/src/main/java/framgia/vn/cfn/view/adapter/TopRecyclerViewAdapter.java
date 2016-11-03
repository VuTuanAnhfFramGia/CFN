package framgia.vn.cfn.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;

import framgia.vn.cfn.R;
import framgia.vn.cfn.model.top.Top;

/**
 * Created by framgia on 02/11/2016.
 */
public class TopRecyclerViewAdapter
    extends RecyclerView.Adapter<TopRecyclerViewAdapter.TopViewHolder> {
    private List<Top> mTopList;
    private LayoutInflater mLayoutInflater;

    public TopRecyclerViewAdapter(Context context, List<Top> topList) {
        mTopList = topList;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public TopViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TopViewHolder(
            mLayoutInflater.inflate(R.layout.top_recycler_view_item, parent, false));
    }

    @Override
    public void onBindViewHolder(TopViewHolder holder, int position) {
        Top top = mTopList.get(position);
        holder.mTextViewLatestInfo.setText(top.getLatestInfo());
        holder.mTextViewLatestInfoShow.setText(top.getLatestInfoShow());
        holder.mTextViewCompanyInfo.setText(top.getCompanyInfo());
        holder.mTextViewCompanyInfoShow.setText(top.getCompanyInfoShow());
        holder.mTextViewDate.setText(top.getDate());
        holder.mTextViewDateShow.setText(top.getDateShow());
        holder.mTextViewVenueInfomation.setText(top.getVenueInfomation());
        holder.mTextViewVenueInfomationShow.setText(top.getVenueInfomationShow());
        holder.mTextViewLink.setText(top.getLink());
    }

    @Override
    public int getItemCount() {
        return mTopList == null ? 0 : mTopList.size();
    }

    class TopViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextViewLatestInfo, mTextViewLatestInfoShow;
        private TextView mTextViewCompanyInfo, mTextViewCompanyInfoShow;
        private TextView mTextViewDate, mTextViewDateShow;
        private TextView mTextViewVenueInfomation, mTextViewVenueInfomationShow;
        private TextView mTextViewLink;

        TopViewHolder(View itemView) {
            super(itemView);
            TableRow tableRowLatestInfo = (TableRow) itemView.findViewById(R.id.row_latest_info);
            mTextViewLatestInfo = (TextView) tableRowLatestInfo.findViewById(R.id.text_1);
            mTextViewLatestInfoShow = (TextView) tableRowLatestInfo.findViewById(R.id.text_2);
            //
            TableRow tableRowCompanyInfo = (TableRow) itemView.findViewById(R.id.row_company_info);
            mTextViewCompanyInfo = (TextView) tableRowCompanyInfo.findViewById(R.id.text_1);
            mTextViewCompanyInfoShow = (TextView) tableRowCompanyInfo.findViewById(R.id.text_2);
            //
            TableRow tableRowDate = (TableRow) itemView.findViewById(R.id.row_date);
            mTextViewDate = (TextView) tableRowDate.findViewById(R.id.text_1);
            mTextViewDateShow = (TextView) tableRowDate.findViewById(R.id.text_2);
            //
            TableRow tableRowVenueInfomation =
                (TableRow) itemView.findViewById(R.id.row_venue_infomation);
            mTextViewVenueInfomation = (TextView) tableRowVenueInfomation.findViewById(R.id.text_1);
            mTextViewVenueInfomationShow =
                (TextView) tableRowVenueInfomation.findViewById(R.id.text_2);
            mTextViewLink = (TextView) tableRowVenueInfomation.findViewById(R.id.text_3);
            mTextViewLink.setVisibility(View.VISIBLE);
        }
    }
}
