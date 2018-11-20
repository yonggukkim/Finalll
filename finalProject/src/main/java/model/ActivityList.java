package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class ActivityList implements Serializable{
	private String ActivityNum; // 액티비티 등록번호
	private String pkgNum; // 여행상품등록번호
	public String getActivityNum() {
		return ActivityNum;
	}
	public void setActivityNum(String activityNum) {
		ActivityNum = activityNum;
	}
	public String getPkgNum() {
		return pkgNum;
	}
	public void setPkgNum(String pkgNum) {
		this.pkgNum = pkgNum;
	}
}
