package model;

import java.io.Serializable;
import java.util.Date;
@SuppressWarnings("serial")
public class Flight implements Serializable{
	private String pkgFlightNumber; // 항공권번호
	private Long pkgFlightPrice; // 항공권가격
	private String pkgFlightAirline; //항공사이름
	private String pkgFlightName; // 항공권 편이름
	private String pkgFlightSeat; // 좌석번호
	private String pkgFlightGrade; // 좌석등급
	private String pkgFlightDepCity; // 항공출발도시이름
	private String pkgFlightDepAirport; // 출발지 공항이름
	private String pkgFlightArrCity; // 항공도착도시이름
	private String pkgFlightArrAirport; // 도착지 공항이름
	private Date pkgFlightKorDepDate; // 한국출발날짜
	private String pkgFlightKorDepTime; // 한국출발시간
	private Date pkgFlightLocArrDate; // 현지도착날짜
	private String pkgFlightLocArrTime; // 현지도착시간
	private Date pkgFlightKorArrDate; // 한국도착날짜
	private Date pkgFlightLocDepDate; // 현지출발날짜
	private String pkgFlightLocDepTime; // 현지출발시간
	private String pkgFlightKorArrTime; // 한국도착시간
	public String getPkgFlightNumber() {
		return pkgFlightNumber;
	}
	public void setPkgFlightNumber(String pkgFlightNumber) {
		this.pkgFlightNumber = pkgFlightNumber;
	}
	public Long getPkgFlightPrice() {
		return pkgFlightPrice;
	}
	public void setPkgFlightPrice(Long pkgFlightPrice) {
		this.pkgFlightPrice = pkgFlightPrice;
	}
	public String getPkgFlightAirline() {
		return pkgFlightAirline;
	}
	public void setPkgFlightAirline(String pkgFlightAirline) {
		this.pkgFlightAirline = pkgFlightAirline;
	}
	public String getPkgFlightName() {
		return pkgFlightName;
	}
	public void setPkgFlightName(String pkgFlightName) {
		this.pkgFlightName = pkgFlightName;
	}
	public String getPkgFlightSeat() {
		return pkgFlightSeat;
	}
	public void setPkgFlightSeat(String pkgFlightSeat) {
		this.pkgFlightSeat = pkgFlightSeat;
	}
	public String getPkgFlightGrade() {
		return pkgFlightGrade;
	}
	public void setPkgFlightGrade(String pkgFlightGrade) {
		this.pkgFlightGrade = pkgFlightGrade;
	}
	public String getPkgFlightDepCity() {
		return pkgFlightDepCity;
	}
	public void setPkgFlightDepCity(String pkgFlightDepCity) {
		this.pkgFlightDepCity = pkgFlightDepCity;
	}
	public String getPkgFlightDepAirport() {
		return pkgFlightDepAirport;
	}
	public void setPkgFlightDepAirport(String pkgFlightDepAirport) {
		this.pkgFlightDepAirport = pkgFlightDepAirport;
	}
	public String getPkgFlightArrCity() {
		return pkgFlightArrCity;
	}
	public void setPkgFlightArrCity(String pkgFlightArrCity) {
		this.pkgFlightArrCity = pkgFlightArrCity;
	}
	public String getPkgFlightArrAirport() {
		return pkgFlightArrAirport;
	}
	public void setPkgFlightArrAirport(String pkgFlightArrAirport) {
		this.pkgFlightArrAirport = pkgFlightArrAirport;
	}
	public Date getPkgFlightKorDepDate() {
		return pkgFlightKorDepDate;
	}
	public void setPkgFlightKorDepDate(Date pkgFlightKorDepDate) {
		this.pkgFlightKorDepDate = pkgFlightKorDepDate;
	}
	public String getPkgFlightKorDepTime() {
		return pkgFlightKorDepTime;
	}
	public void setPkgFlightKorDepTime(String pkgFlightKorDepTime) {
		this.pkgFlightKorDepTime = pkgFlightKorDepTime;
	}
	public Date getPkgFlightLocArrDate() {
		return pkgFlightLocArrDate;
	}
	public void setPkgFlightLocArrDate(Date pkgFlightLocArrDate) {
		this.pkgFlightLocArrDate = pkgFlightLocArrDate;
	}
	public String getPkgFlightLocArrTime() {
		return pkgFlightLocArrTime;
	}
	public void setPkgFlightLocArrTime(String pkgFlightLocArrTime) {
		this.pkgFlightLocArrTime = pkgFlightLocArrTime;
	}
	public Date getPkgFlightKorArrDate() {
		return pkgFlightKorArrDate;
	}
	public void setPkgFlightKorArrDate(Date pkgFlightKorArrDate) {
		this.pkgFlightKorArrDate = pkgFlightKorArrDate;
	}
	public Date getPkgFlightLocDepDate() {
		return pkgFlightLocDepDate;
	}
	public void setPkgFlightLocDepDate(Date pkgFlightLocDepDate) {
		this.pkgFlightLocDepDate = pkgFlightLocDepDate;
	}
	public String getPkgFlightLocDepTime() {
		return pkgFlightLocDepTime;
	}
	public void setPkgFlightLocDepTime(String pkgFlightLocDepTime) {
		this.pkgFlightLocDepTime = pkgFlightLocDepTime;
	}
	public String getPkgFlightKorArrTime() {
		return pkgFlightKorArrTime;
	}
	public void setPkgFlightKorArrTime(String pkgFlightKorArrTime) {
		this.pkgFlightKorArrTime = pkgFlightKorArrTime;
	}
}
