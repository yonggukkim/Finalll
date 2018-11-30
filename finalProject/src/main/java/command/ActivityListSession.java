package command;

import java.io.Serializable;
@SuppressWarnings("serial")
public class ActivityListSession implements Serializable{
	private String activityNum;
	private String activityName;
	private String activityCate;
	private String activityImage;
	private String activityCompany;
	private String activityTel;
	public String getActivityNum() {
		return activityNum;
	}
	public void setActivityNum(String activityNum) {
		this.activityNum = activityNum;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityCate() {
		return activityCate;
	}
	public void setActivityCate(String activityCate) {
		this.activityCate = activityCate;
	}
	public String getActivityImage() {
		return activityImage;
	}
	public void setActivityImage(String activityImage) {
		this.activityImage = activityImage;
	}
	public String getActivityCompany() {
		return activityCompany;
	}
	public void setActivityCompany(String activityCompany) {
		this.activityCompany = activityCompany;
	}
	public String getActivityTel() {
		return activityTel;
	}
	public void setActivityTel(String activityTel) {
		this.activityTel = activityTel;
	}
}
