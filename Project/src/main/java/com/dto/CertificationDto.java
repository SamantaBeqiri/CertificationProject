package com.dto;

import java.util.Date;

public class CertificationDto {

	private int id;
	private int employeeId;
	private String firstName;
	private String lastName;
	
	private int certificateId;
	private String cerificateName;
	private String certificateDescription;
	
	private int statusId;
	private String status;
	private int points;
	private Date date;
	private boolean validity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}
	public String getCerificateName() {
		return cerificateName;
	}
	public void setCerificateName(String cerificateName) {
		this.cerificateName = cerificateName;
	}
	public String getCertificateDescription() {
		return certificateDescription;
	}
	public void setCertificateDescription(String certificateDescription) {
		this.certificateDescription = certificateDescription;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isValidity() {
		return validity;
	}
	public void setValidity(boolean validity) {
		this.validity = validity;
	}
	
}
