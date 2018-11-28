package model;

import java.io.Serializable;
import java.util.List;
@SuppressWarnings("serial")
public class HotelList implements Serializable{
	private List<Hotel> hotelNum; // 숙박시설 등록번호
	private List<Pkg> pkgNum; // 여행상품 등록번호
	public List<Hotel> getHotelNum() {
		return hotelNum;
	}
	public void setHotelNum(List<Hotel> hotelNum) {
		this.hotelNum = hotelNum;
	}
	public List<Pkg> getPkgNum() {
		return pkgNum;
	}
	public void setPkgNum(List<Pkg> pkgNum) {
		this.pkgNum = pkgNum;
	}
}
