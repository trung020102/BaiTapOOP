

import java.util.Date;

public class Student extends Person implements Tax {

	private String name;
	private String studentId;
	private String phone;
	private String email;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Tinh thue thu nhap
	 * thue thu nhap = (tien luong - 11000000) * 0.5%
	 */
	@Override
	public Double payTax(Long income, Date startTime, Date endTime) {
		if (income > 11000000) {
			return (income - 11000000) * 0.5 / 100;
		}

		return 0.0;
	}
}
