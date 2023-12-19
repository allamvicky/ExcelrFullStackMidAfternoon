class Employee 
{
	private int employeeId;
	private String employeename;
	private String employeeDepartment;
	private int employeeAge;
	private double employeeSalary;


	Employee(int employeeId, String employeename, String employeeDepartment, int employeeAge, double employeeSalary)
	{
		this.employeeId = employeeId;
		this.employeename = employeename;
		this.employeeDepartment = employeeDepartment;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
	}
	public 
	public String getEmployeeName()
	{
		return employeeName;
	}
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	public void setEmployeeDepartment(String employeeDepartment)
	{
		this.employeeDepartment = employeeDepartment;
	}
	public int getEmployeeAge()
	{
		return employeeAge;
	}
	public double SetEmployeeSalary()



}
class MainDriver
{
	public static void main(String[] args)
	{
		//Employee emp1 = new Employee(101, "vicky", "full-stack", 22, 2000.0);
		System.out.println(emp1.getEmployeeId());
		System.out.println(emp1.getEmployeeName());
		System.out.println(emp1.getEmployeeDepartment());
		System.out.println(emp1.getEmployeeAge());
	    System.out.println(emp1.getEmployeeSalary());
		System.out.println("-----------------------------");
		emp1.setEmployeeId(1001);
        emp1.setEmployeeName("goutham");
		emp1.setEmployeeDepartment("Data science");
		emp1.setEmployeeAge(25);
		emp1.setEmployeeSalary(3000.0);
		System.out.println(emp1.getEmployeeId());
		System.out.println(emp1.getEmployeeName());
		System.out.println(emp1.getEmployeeDepartment());
		System.out.println(emp1.getEmployeeAge());
	    System.out.println(emp1.getEmployeeSalary());
	}   
}

         

