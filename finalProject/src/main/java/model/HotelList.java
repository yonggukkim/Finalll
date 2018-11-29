package model;

import java.io.Serializable;
import java.util.List;
@SuppressWarnings("serial")
public class HotelList implements Serializable{
	private String hotelListNum; // 숙박시설 등록번호 1
	private String pkgHotelNum; // a여행상품 등록번호 1 / b 2
	public String getHotelListNum() {
		return hotelListNum;
	}
	public void setHotelListNum(String hotelListNum) {
		this.hotelListNum = hotelListNum;
	}
	public String getPkgHotelNum() {
		return pkgHotelNum;
	}
	public void setPkgHotelNum(String pkgHotelNum) {
		this.pkgHotelNum = pkgHotelNum;
	}
}
