

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Person {

	private Date birthDay;
	private boolean gender;
	private String bloodType;

	/**
	 * 
	 */
	public Person() {
	}

	/**
	 * @param birthDay
	 * @param gender
	 * @param bloodType
	 */
	public Person(Date birthDay, boolean gender, String bloodType) {
		this.birthDay = birthDay;
		this.gender = gender;
		this.bloodType = bloodType;
	}

	/**
	 * @param gender
	 * @param bloodType
	 */
	public Person(boolean gender, String bloodType) {
		this.gender = gender;
		this.bloodType = bloodType;
	}

	/**
	 * @param birthDay
	 * @param gender
	 */
	public Person(Date birthDay, boolean gender) {
		this.birthDay = birthDay;
		this.gender = gender;
	}

	/**
	 * @param birthDay
	 * @param bloodType
	 */
	public Person(Date birthDay, String bloodType) {
		this.birthDay = birthDay;
		this.bloodType = bloodType;
	}

	/**
	 * @return the birthDay
	 */
	public Date getBirthDay() {
		return birthDay;
	}
	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	/**
	 * @return the gender
	 */
	public boolean isGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	/**
	 * @return the bloodType
	 */
	public String getBloodType() {
		return bloodType;
	}
	/**
	 * @param bloodType the bloodType to set
	 */
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	public void inputPerson(Scanner sc) throws ParseException {
		System.out.print("Nhap birth day: ");
		String birthDayStr = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date birthDay = sdf.parse(birthDayStr);
		this.setBirthDay(birthDay);
		
		System.out.print("Nhap gender (True.Nam, False.Nu): ");
		boolean gender = sc.nextBoolean();
		this.setGender(gender);
		sc.nextLine();
		
		System.out.print("Nhap blood type: ");
		String bloodType = sc.nextLine();
		this.setBloodType(bloodType);
	}
}
