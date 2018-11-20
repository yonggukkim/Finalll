package model;

import java.io.Serializable;
import java.util.Date;
@SuppressWarnings("serial")
public class SelfTourFlight implements Serializable{
	private String selfFlightNum; // 항공권번호
	private Long selfFlightPrice; // 항공권가격
	private String selfFlightAirline; //항공사이름
	private String selfFlightName; // 항공권 편이름
	private String selfFlightSeat; // 좌석번호
	private String selfFlightGrade; // 좌석등급
	private String selfFlightDepCity; // 항공출발도시이름
	private String selfFlightDepAirport; // 출발지 공항이름
	private String selfFlightArrCity; // 항공도착도시이름
	private String selfFlightArrAirport; // 도착지 공항이름
	private Date selfFlightKorDepDate; // 한국출발날짜
	private String selfFlightKorDepTime; // 한국출발시간
	private Date selfFlightLocArrDate; // 현지도착날짜
	private String selfFlightLocArrTime; // 현지도착시간
	private Date selfFlightKorArrDate; // 한국도착날짜
	private Date selfFlightLocDepDate; // 현지출발날짜
	private String selfFlightLocDepTime; // 현지출발시간
	private String selfFlightKorArrTime; // 한국도착시간
	public String getSelfFlightNum() {
		return selfFlightNum;
	}
	public void setSelfFlightNum(String selfFlightNum) {
		this.selfFlightNum = selfFlightNum;
	}
	public Long getSelfFlightPrice() {
		return selfFlightPrice;
	}
	public void setSelfFlightPrice(Long selfFlightPrice) {
		this.selfFlightPrice = selfFlightPrice;
	}
	public String getSelfFlightAirline() {
		return selfFlightAirline;
	}
	public void setSelfFlightAirline(String selfFlightAirline) {
		this.selfFlightAirline = selfFlightAirline;
	}
	public String getSelfFlightName() {
		return selfFlightName;
	}
	public void setSelfFlightName(String selfFlightName) {
		this.selfFlightName = selfFlightName;
	}
	public String getSelfFlightSeat() {
		return selfFlightSeat;
	}
	public void setSelfFlightSeat(String selfFlightSeat) {
		this.selfFlightSeat = selfFlightSeat;
	}
	public String getSelfFlightGrade() {
		return selfFlightGrade;
	}
	public void setSelfFlightGrade(String selfFlightGrade) {
		this.selfFlightGrade = selfFlightGrade;
	}
	public String getSelfFlightDepCity() {
		return selfFlightDepCity;
	}
	public void setSelfFlightDepCity(String selfFlightDepCity) {
		this.selfFlightDepCity = selfFlightDepCity;
	}
	public String getSelfFlightDepAirport() {
		return selfFlightDepAirport;
	}
	public void setSelfFlightDepAirport(String selfFlightDepAirport) {
		this.selfFlightDepAirport = selfFlightDepAirport;
	}
	public String getSelfFlightArrCity() {
		return selfFlightArrCity;
	}
	public void setSelfFlightArrCity(String selfFlightArrCity) {
		this.selfFlightArrCity = selfFlightArrCity;
	}
	public String getSelfFlightArrAirport() {
		return selfFlightArrAirport;
	}
	public void setSelfFlightArrAirport(String selfFlightArrAirport) {
		this.selfFlightArrAirport = selfFlightArrAirport;
	}
	public Date getSelfFlightKorDepDate() {
		return selfFlightKorDepDate;
	}
	public void setSelfFlightKorDepDate(Date selfFlightKorDepDate) {
		this.selfFlightKorDepDate = selfFlightKorDepDate;
	}
	public String getSelfFlightKorDepTime() {
		return selfFlightKorDepTime;
	}
	public void setSelfFlightKorDepTime(String selfFlightKorDepTime) {
		this.selfFlightKorDepTime = selfFlightKorDepTime;
	}
	public Date getSelfFlightLocArrDate() {
		return selfFlightLocArrDate;
	}
	public void setSelfFlightLocArrDate(Date selfFlightLocArrDate) {
		this.selfFlightLocArrDate = selfFlightLocArrDate;
	}
	public String getSelfFlightLocArrTime() {
		return selfFlightLocArrTime;
	}
	public void setSelfFlightLocArrTime(String selfFlightLocArrTime) {
		this.selfFlightLocArrTime = selfFlightLocArrTime;
	}
	public Date getSelfFlightKorArrDate() {
		return selfFlightKorArrDate;
	}
	public void setSelfFlightKorArrDate(Date selfFlightKorArrDate) {
		this.selfFlightKorArrDate = selfFlightKorArrDate;
	}
	public Date getSelfFlightLocDepDate() {
		return selfFlightLocDepDate;
	}
	public void setSelfFlightLocDepDate(Date selfFlightLocDepDate) {
		this.selfFlightLocDepDate = selfFlightLocDepDate;
	}
	public String getSelfFlightLocDepTime() {
		return selfFlightLocDepTime;
	}
	public void setSelfFlightLocDepTime(String selfFlightLocDepTime) {
		this.selfFlightLocDepTime = selfFlightLocDepTime;
	}
	public String getSelfFlightKorArrTime() {
		return selfFlightKorArrTime;
	}
	public void setSelfFlightKorArrTime(String selfFlightKorArrTime) {
		this.selfFlightKorArrTime = selfFlightKorArrTime;
	}
}
