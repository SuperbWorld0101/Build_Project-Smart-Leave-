package com.dvl.smartleave;

import java.time.LocalDate;

public class LeaveRequest {
	private int employeeId;
	private LocalDate startDate;
	private LocalDate endDate;
	private String type; //e.g. Sick, Vacation
	private int daysRequested;
	private boolean approved;
	
	
	public LeaveRequest(int employeeId, LocalDate startDate, LocalDate endDate, String type) {
		super();
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.type = type;
		this.daysRequested = daysRequested;
		this.approved = approved;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDaysRequest() {
		return daysRequest;
	}
	public void setDaysRequest(int daysRequest) {
		this.daysRequest = daysRequest;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	public void approveLeave(Employee employee) {
		if (employee.getleaveBalance() >= daysRequested) {
			approved = true;
			employee.deductLeave(daysRequested);
			System.out.println("Leave approved");
		} else {
			System.out.println("Insufficient leave balance.");
		}
	}
	@Override
	public String toString() {
		return "LeaveRequest [employeeId=" + employeeId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", type=" + type + ", daysRequested=" + daysRequested + ", approved=" + approved + "]";
	}

	
	
	

}
