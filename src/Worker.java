

import java.util.Date;

public class Worker extends Person implements Tax {
	
	private String name;
	private String citizenId;
	private String phone;
	private Long salary;
	private Long otherIncome;

	/**
	 * Tinh thue thu nhap
	 * thue thu nhap = (tien luong - 15000000) * 1%
	 */
	@Override
	public Double payTax(Long income, Date startTime, Date endTime) {
		if (income > 15000000) {
			return income * 0.01;
		}

		return 0.0;
	}

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
	 * @return the citizenId
	 */
	public String getCitizenId() {
		return citizenId;
	}

	/**
	 * @param citizenId the citizenId to set
	 */
	public void setCitizenId(String citizenId) {
		this.citizenId = citizenId;
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
	 * @return the salary
	 */
	public Long getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Long salary) {
		this.salary = salary;
	}

	/**
	 * @return the otherIncome
	 */
	public Long getOtherIncome() {
		return otherIncome;
	}

	/**
	 * @param otherIncome the otherIncome to set
	 */
	public void setOtherIncome(Long otherIncome) {
		this.otherIncome = otherIncome;
	}
	
}
