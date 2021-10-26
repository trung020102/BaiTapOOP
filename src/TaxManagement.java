import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TaxManagement {

	/**
	 * Nhap thong tin person
	 * @param sc
	 * @param person
	 * @throws ParseException
	 */
	public static void inputPerson(Scanner sc, Person person) throws ParseException {
		System.out.print("Nhap birth day: ");
		String birthDayStr = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date birthDay = sdf.parse(birthDayStr);
		person.setBirthDay(birthDay);
		
		System.out.print("Nhap gender (True.Nam, False.Nu): ");
		boolean gender = sc.nextBoolean();
		person.setGender(gender);
		sc.nextLine();
		
		System.out.print("Nhap blood type: ");
		String bloodType = sc.nextLine();
		person.setBloodType(bloodType);
	}
	
	/**
	 * Nhap thong tin Student
	 * @param sc
	 * @param std
	 * @throws ParseException
	 */
	public static void inputStudent(Scanner sc, Student std) throws ParseException {
		
		//Cach 1: su dung ham phuong thuc cua doi tuong person
		std.inputPerson(sc);
		
		//Cach 2: su dung phuong thuc inputPerson phia tren, Truyen vao std cung chinh la Person vi Student la con cua Person
		//nen duoc hieu Student cung la 1 Person
		//inputPerson(sc, std);
		
		System.out.print("Nhap name: ");
		String name = sc.nextLine();
		std.setName(name);
		
		System.out.print("Nhap student id: ");
		String studentId = sc.nextLine();
		std.setStudentId(studentId);
		
		System.out.print("Nhap phone: ");
		String phone = sc.nextLine();
		std.setPhone(phone);
		
		System.out.print("Nhap email: ");
		String email = sc.nextLine();
		std.setEmail(email);
	}
	
	/**
	 * Nhap thong tin worker
	 * @param sc
	 * @param worker
	 * @throws ParseException 
	 */
	public static void inputWorker(Scanner sc, Worker worker) throws ParseException {
		
		//Cach 1: su dung ham phuong thuc cua doi tuong person
		worker.inputPerson(sc);
		
		//Cach 2: su dung phuong thuc inputPerson phia tren, Truyen vao worker cung chinh la Person vi Worker la con cua Person
		//nen duoc hieu Worker cung la 1 Person
		//inputPerson(sc, worker);
		
		System.out.print("Nhap name: ");
		String name = sc.nextLine();
		worker.setName(name);
		
		System.out.print("Nhap citizen id: ");
		String citizenId = sc.nextLine();
		worker.setCitizenId(citizenId);
		
		System.out.print("Nhap phone: ");
		String phone = sc.nextLine();
		worker.setPhone(phone);
		
		System.out.print("Nhap salary: ");
		long salary = sc.nextLong();
		worker.setSalary(salary);
		
		System.out.print("Nhap other income: ");
		long otherIncome = sc.nextLong();
		worker.setOtherIncome(otherIncome);
	}
	
	/**
	 * Nhap thong tin business person
	 * @param sc
	 * @param businessPerson
	 * @throws ParseException 
	 */
	public static void inputBusinessPerson(Scanner sc, BusinessPerson businessPerson) throws ParseException {
		
		//Cach 1: su dung ham phuong thuc cua doi tuong person
		businessPerson.inputPerson(sc);
		
		//Cach 2: su dung phuong thuc inputPerson phia tren, Truyen vao businessPerson cung chinh la Person vi BusinessPerson la con cua Person
		//nen duoc hieu BusinessPerson cung la 1 Person
		//inputPerson(sc, businessPerson);
		
		System.out.print("Nhap name: ");
		String name = sc.nextLine();
		businessPerson.setName(name);
		
		System.out.print("Nhap citizen id: ");
		String citizenId = sc.nextLine();
		businessPerson.setCitizenId(citizenId);
		
		System.out.print("Nhap phone: ");
		String phone = sc.nextLine();
		businessPerson.setPhone(phone);
		
		System.out.print("Nhap salary: ");
		long salary = sc.nextLong();
		businessPerson.setSalary(salary);
		
		System.out.print("Nhap other income: ");
		long otherIncome = sc.nextLong();
		businessPerson.setOtherIncome(otherIncome);
		
		System.out.print("Nhap business income: ");
		long businessIncome = sc.nextLong();
		businessPerson.setBusinessIncome(businessIncome);
	}
	
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ban muon nhap thong cho loai Person nao (1.Student, 2.Worker, 3.Business Person): ");
		int personType = sc.nextInt();
		sc.nextLine();
		//Nhap du lieu cho Student
		if (personType == 1) {
			System.out.println("====== Nhap thong tin Student ======");
			Student std = new Student();
			inputStudent(sc, std);
			
			System.out.println("Thue thu nhap: " + std.payTax(new Long(0), new Date(), new Date()));
		}
		
		//Nhap du lieu cho Worker
		if (personType == 2) {
			System.out.println("====== Nhap thong tin Student ======");
			Worker worker = new Worker();
			inputWorker(sc, worker);
			
			Long income = worker.getSalary() + worker.getOtherIncome();
			System.out.println("Thue thu nhap: " + worker.payTax(income, new Date(), new Date()));
		}
		
		//Nhap du lieu cho Business Person
		if (personType == 3) {
			System.out.println("====== Nhap thong tin Student ======");
			BusinessPerson businessPerson = new BusinessPerson();
			inputBusinessPerson(sc, businessPerson);
			
			Long income = businessPerson.getSalary() + businessPerson.getBusinessIncome() + businessPerson.getOtherIncome();
			System.out.println("Thue thu nhap: " + businessPerson.payTax(income, new Date(), new Date()));
		}
		
	}
}
