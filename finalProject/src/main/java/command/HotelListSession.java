package command;

import java.io.Serializable;
@SuppressWarnings("serial")
public class HotelListSession implements Serializable{
	private String hotelNum;
	private String hotelName;
	private String hotelCate;
	private String hotelGrade;
	private String hotelImage;
	private String hotelCompany;
	private String hotelTel;
	public String getHotelNum() {
		return hotelNum;
	}
	public void setHotelNum(String hotelNum) {
		this.hotelNum = hotelNum;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelCate() {
		return hotelCate;
	}
	public void setHotelCate(String hotelCate) {
		this.hotelCate = hotelCate;
	}
	public String getHotelGrade() {
		return hotelGrade;
	}
	public void setHotelGrade(String hotelGrade) {
		this.hotelGrade = hotelGrade;
	}
	public String getHotelImage() {
		return hotelImage;
	}
	public void setHotelImage(String hotelImage) {
		this.hotelImage = hotelImage;
	}
	public String getHotelCompany() {
		return hotelCompany;
	}
	public void setHotelCompany(String hotelCompany) {
		this.hotelCompany = hotelCompany;
	}
	public String getHotelTel() {
		return hotelTel;
	}
	public void setHotelTel(String hotelTel) {
		this.hotelTel = hotelTel;
	}
}
