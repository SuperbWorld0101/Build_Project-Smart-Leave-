package session2;
package com.dvl.smartleave;

public class Employee {
	private int id;
	private String name;
	private String role;
	private int leaveBalance;
	
	public Employee(int id, String name, String role, int leaveBalance) {
		this.id = id;
		this.role = role;
		this.name = name;
		this.leaveBalance = leaveBalance;
	}
    // Getters and Setters
	public int getId() { return id; }
	public String getName() { return name; }
	public String getRole() { return role; }
	public int getleaveBalance() { return leaveBalance; }
	
	public void setName(String name) {this.name = name; }
	public void setRole(String role) {this.role = role; }
	public void setleaveBalance(int leaveBalance) {this.leaveBalance = leaveBalance; }
	
	public void deductLeave(int days) {
		this.leaveBalance -= days;
	}
	// ToString
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", leaveBalance=" + leaveBalance + "]";
	}
	
	

}
