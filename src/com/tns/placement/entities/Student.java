package com.tns.placement.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private long id;
	private String name;
	private String College;
	private long roll;
	private String quali;
	private String course;
	private int year;
	//private String Certificate;
	//private long HallTickectNo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return College;
	}
	public void setCollege(String college) {
		College = college;
	}
	public long getRoll() {
		return roll;
	}
	public void setRoll(long roll) {
		this.roll = roll;
	}
	public String getQuali() {
		return quali;
	}
	public void setQuali(String quali) {
		this.quali = quali;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	//public String getCertificate() {
	//	return Certificate;
	//}
	//public void setCertificate(String certificate) {
	//	Certificate = certificate;
	//}
	//public long getHallTickectNo() {
	//	return HallTickectNo;
	//}
	//public void setHallTickectNo(long hallTickectNo) {
	//	HallTickectNo = hallTickectNo;
	//}
	

}
