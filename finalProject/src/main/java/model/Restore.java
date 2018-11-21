package model;

import java.io.Serializable;
import java.util.Date;
@SuppressWarnings("serial")
public class Restore implements Serializable{
	private Long fileNo;
	private String activityNum;
	private String fold;
	private String fileName;
	private Date creDate;
	private String etc;
	public Restore(String fold, String fileName, String etc) {
		super();
		this.fold = fold;
        this.fileName = fileName;
        this.etc = etc;
	}
	public Restore(Long fileNo, String activityNum, String fold, String fileName, Date creDate, String etc) {
		super();
		this.fileNo = fileNo;
		this.activityNum = activityNum;
		this.fold = fold;
		this.fileName = fileName;
		this.creDate = creDate;
		this.etc = etc;
	}
	public Long getFileNo() {
		return fileNo;
	}
	public void setFileNo(Long fileNo) {
		this.fileNo = fileNo;
	}
	public String getActivityNum() {
		return activityNum;
	}
	public void setActivityNum(String activityNum) {
		this.activityNum = activityNum;
	}
	public String getFold() {
		return fold;
	}
	public void setFold(String fold) {
		this.fold = fold;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Date getCreDate() {
		return creDate;
	}
	public void setCreDate(Date creDate) {
		this.creDate = creDate;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
}
