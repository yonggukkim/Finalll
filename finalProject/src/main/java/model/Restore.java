package model;

import java.io.Serializable;
import java.util.Date;
@SuppressWarnings("serial")
public class Restore implements Serializable{
	private Long fileNo;
	private String resNum;
	private String fold;
	private String fileName;
	private String storedFileName;
	private Date creDate;
	private String etc;
	public Restore() {
		super();
	}
	public Restore(String fold, String fileName, String storedFileName, String etc) {
		super();
		this.fold = fold;
        this.fileName = fileName;
        this.storedFileName = storedFileName;
        this.etc = etc;
	}
	public Restore(Long fileNo, String resNum, String fold, String storedFileName, String fileName, Date creDate, String etc) {
		super();
		this.fileNo = fileNo;
		this.resNum = resNum;
		this.fold = fold;
		this.storedFileName = storedFileName;
		this.fileName = fileName;
		this.creDate = creDate;
		this.etc = etc;
	}
	public Long getFileNo() {
		return fileNo;
	}
	public String getStoredFileName() {
		return storedFileName;
	}
	public void setStoredFileName(String storedFileName) {
		this.storedFileName = storedFileName;
	}
	public void setFileNo(Long fileNo) {
		this.fileNo = fileNo;
	}
	public String getResNum() {
		return resNum;
	}
	public void setResNum(String resNum) {
		this.resNum = resNum;
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
