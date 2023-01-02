package com.tns.placement.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;



@Entity
@Table(name="placement")
public class Placement implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private long id;
	private String name;
	private String College;
	private Date LocalDate;
	private String quali;
	private int year;
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
	public Date getLocalDate() {
		return LocalDate;
	}
	public void setLocalDate(Date localDate) {
		LocalDate = localDate;
	}
	public String getQuali() {
		return quali;
	}
	public void setQuali(String quali) {
		this.quali = quali;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
