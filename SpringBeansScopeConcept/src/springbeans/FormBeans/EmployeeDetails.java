/**
 * 
 */
package springbeans.FormBeans;

import org.springframework.context.annotation.Scope;

/**
 * @author Employee details bean class 
 * Beans Instantiation : Singleton
 *
 */

//@Scope("singleton")
//@Scope("prototyoe")
@Scope("session")
//@Scope("singleton")
public class EmployeeDetails {
	
	private int employeeId;
	private String employeeName;
	private int mobileNo;
	private String employeeAddress;
	
	//getter and setter
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	
	
	
	
	

}
