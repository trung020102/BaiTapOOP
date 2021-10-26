import java.util.Date;

public class BusinessPerson extends Person implements Tax {

	private String name;
	private String citizenId;
	private String phone;
	private String email;
	private Long salary;
	private Long businessIncome;
	private Long otherIncome;
	
	
	@Override
	public Double payTax(Long income, Date startTime, Date endTime) {
		if (income > 50000000) {
			return income * 0.03;
		} else if (income > 10000000) {
			return income * 0.02;
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
	 * @return the businessIncome
	 */
	public Long getBusinessIncome() {
		return businessIncome;
	}


	/**
	 * @param businessIncome the businessIncome to set
	 */
	public void setBusinessIncome(Long businessIncome) {
		this.businessIncome = businessIncome;
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
