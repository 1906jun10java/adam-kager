package com.revature.beans;

public class Request {
	private int requestId = 0;
	private double requestAmount = 0.0;
	private String requestEmployee = "Employee Username";
	private String approveManager = "Employee Direct Manager";
	private int receiveDateCode = 19991231;
	private int approveDateCode = 19991231;
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Request(int requestId, double requestAmount, String requestEmployee, String approveManager,
			int receiveDateCode, int approveDateCode) {
		super();
		this.requestId = requestId;
		this.requestAmount = requestAmount;
		this.requestEmployee = requestEmployee;
		this.approveManager = approveManager;
		this.receiveDateCode = receiveDateCode;
		this.approveDateCode = approveDateCode;
	}
	public Request(int requestId, double requestAmount, String requestEmployee, String approveManager) {
		super();
		this.requestId = requestId;
		this.requestAmount = requestAmount;
		this.requestEmployee = requestEmployee;
		this.approveManager = approveManager;

	}
	
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public double getRequestAmount() {
		return requestAmount;
	}
	public void setRequestAmount(double requestAmount) {
		this.requestAmount = requestAmount;
	}
	public String getRequestEmployee() {
		return requestEmployee;
	}
	public void setRequestEmployee(String requestEmployee) {
		this.requestEmployee = requestEmployee;
	}
	public String getApproveManager() {
		return approveManager;
	}
	public void setApproveManager(String approveManager) {
		this.approveManager = approveManager;
	}
	public int getReceiveDateCode() {
		return receiveDateCode;
	}
	public void setReceiveDateCode(int receiveDateCode) {
		this.receiveDateCode = receiveDateCode;
	}
	public int getApproveDateCode() {
		return approveDateCode;
	}
	public void setApproveDateCode(int approveDateCode) {
		this.approveDateCode = approveDateCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + approveDateCode;
		result = prime * result + ((approveManager == null) ? 0 : approveManager.hashCode());
		result = prime * result + receiveDateCode;
		long temp;
		temp = Double.doubleToLongBits(requestAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((requestEmployee == null) ? 0 : requestEmployee.hashCode());
		result = prime * result + requestId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		if (approveDateCode != other.approveDateCode)
			return false;
		if (approveManager == null) {
			if (other.approveManager != null)
				return false;
		} else if (!approveManager.equals(other.approveManager))
			return false;
		if (receiveDateCode != other.receiveDateCode)
			return false;
		if (Double.doubleToLongBits(requestAmount) != Double.doubleToLongBits(other.requestAmount))
			return false;
		if (requestEmployee == null) {
			if (other.requestEmployee != null)
				return false;
		} else if (!requestEmployee.equals(other.requestEmployee))
			return false;
		if (requestId != other.requestId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Requests [requestId=" + requestId + ", requestAmount=" + requestAmount + ", requestEmployee="
				+ requestEmployee + ", approveManager=" + approveManager + ", receiveDateCode=" + receiveDateCode
				+ ", approveDateCode=" + approveDateCode + "]";
	}
	
}
