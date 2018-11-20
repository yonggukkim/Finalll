package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class HotelList implements Serializable{
	private String hotelNum; // 숙박시설 등록번호
	private String pkgNum; // 여행상품 등록번호
	public String getHotelNum() {
		return hotelNum;
	}
	public void setHotelNum(String hotelNum) {
		this.hotelNum = hotelNum;
	}
	public String getPkgNum() {
		return pkgNum;
	}
	public void setPkgNum(String pkgNum) {
		this.pkgNum = pkgNum;
	}
}
