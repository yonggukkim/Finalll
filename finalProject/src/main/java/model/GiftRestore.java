package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GiftRestore implements Serializable {

	private String gfileNum;
	private String gfileName;
	private String gfilePath;

	public GiftRestore() {
	}

	public GiftRestore( String gfileName, String gfilePath) {
		super();
		this.gfileName = gfileName;
		this.gfilePath = gfilePath;
	}

	public String getGfileNum() {
		return gfileNum;
	}

	public void setGfileNum(String gfileNum) {
		this.gfileNum = gfileNum;
	}



	public String getGfileName() {
		return gfileName;
	}

	public void setGfileName(String gfileName) {
		this.gfileName = gfileName;
	}

/*	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}*/

	public String getGfilePath() {
		return gfilePath;
	}

	public void setGfilePath(String gfilePath) {
		this.gfilePath = gfilePath;
	}

}
