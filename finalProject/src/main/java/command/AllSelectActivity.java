package command;

import java.io.Serializable;
import java.util.List;

import model.Activitys;
import model.Restore;
@SuppressWarnings("serial")
public class AllSelectActivity implements Serializable{
	private String pkgNum; // 여행상품 등록번호
	private List<Activitys> activitys;
	private List<Restore> restores; // 여행상품 이미지파일이름
	public String getPkgNum() {
		return pkgNum;
	}
	public void setPkgNum(String pkgNum) {
		this.pkgNum = pkgNum;
	}
	public List<Activitys> getActivitys() {
		return activitys;
	}
	public void setActivitys(List<Activitys> activitys) {
		this.activitys = activitys;
	}
	public List<Restore> getRestores() {
		return restores;
	}
	public void setRestores(List<Restore> restores) {
		this.restores = restores;
	}
}
