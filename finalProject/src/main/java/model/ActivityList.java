package model;

import java.io.Serializable;
import java.util.List;
@SuppressWarnings("serial")
public class ActivityList implements Serializable{
	private List<Activitys> ActivityNum; // 액티비티 등록번호
	private List<Pkg> pkgNum; // 여행상품등록번호
	public List<Activitys> getActivityNum() {
		return ActivityNum;
	}
	public void setActivityNum(List<Activitys> activityNum) {
		ActivityNum = activityNum;
	}
	public List<Pkg> getPkgNum() {
		return pkgNum;
	}
	public void setPkgNum(List<Pkg> pkgNum) {
		this.pkgNum = pkgNum;
	}
}
