package model;

import java.io.Serializable;
import java.util.List;
@SuppressWarnings("serial")
public class ActivityList implements Serializable{
	private String activityListNum; // 액티비티 등록번호
	private String pkgActivityNum; // 여행상품등록번호
	public String getActivityListNum() {
		return activityListNum;
	}
	public void setActivityListNum(String activityListNum) {
		this.activityListNum = activityListNum;
	}
	public String getPkgActivityNum() {
		return pkgActivityNum;
	}
	public void setPkgActivityNum(String pkgActivityNum) {
		this.pkgActivityNum = pkgActivityNum;
	}
}
