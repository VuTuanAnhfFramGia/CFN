package framgia.vn.cfn.model.top;

/**
 * Created by framgia on 02/11/2016.
 */
public class Top {
    private String mLatestInfo;
    private String mLatestInfoShow;
    private String mCompanyInfo;
    private String mCompanyInfoShow;
    private String mDate;
    private String mDateShow;
    private String mVenueInfomation;
    private String mVenueInfomationShow;
    private String mLink;

    public Top(String latestInfo, String latestInfoShow, String companyInfo,
               String companyInfoShow, String date, String dateShow, String venueInfomation,
               String venueInfomationShow, String link) {
        mLatestInfo = latestInfo;
        mLatestInfoShow = latestInfoShow;
        mCompanyInfo = companyInfo;
        mCompanyInfoShow = companyInfoShow;
        mDate = date;
        mDateShow = dateShow;
        mVenueInfomation = venueInfomation;
        mVenueInfomationShow = venueInfomationShow;
        mLink = link;
    }

    public String getLatestInfo() {
        return mLatestInfo;
    }

    public String getLatestInfoShow() {
        return mLatestInfoShow;
    }

    public String getCompanyInfo() {
        return mCompanyInfo;
    }

    public String getCompanyInfoShow() {
        return mCompanyInfoShow;
    }

    public String getDate() {
        return mDate;
    }

    public String getDateShow() {
        return mDateShow;
    }

    public String getVenueInfomation() {
        return mVenueInfomation;
    }

    public String getVenueInfomationShow() {
        return mVenueInfomationShow;
    }

    public String getLink() {
        return mLink;
    }
}
