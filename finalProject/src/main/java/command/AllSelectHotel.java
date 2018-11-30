package command;

import java.io.Serializable;
import java.util.List;

import model.Hotel;
import model.Restore;
@SuppressWarnings("serial")
public class AllSelectHotel implements Serializable{
	private String pkgNum; // 여행상품 등록번호
	private List<Hotel> hotels;
	private List<Restore> restores; // 여행상품 이미지파일이름
	public String getPkgNum() {
		return pkgNum;
	}
	public void setPkgNum(String pkgNum) {
		this.pkgNum = pkgNum;
	}
	public List<Hotel> getHotels() {
		return hotels;
	}
	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	public List<Restore> getRestores() {
		return restores;
	}
	public void setRestores(List<Restore> restores) {
		this.restores = restores;
	}
}
