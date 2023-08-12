import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id ;
        String name;
        EmployeeDao dao = new Employeedaoimp();
        System.out.println("Welcome to empapp");
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Add Employee");
            System.out.println("2. show All Employee");
            System.out.println("3. Show Employee based on id ");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.println("Enter choice :");
            int ch = sc.nextInt();
            switch(ch){
                case 1 :
                    Employee emp = new Employee();
                    System.out.println("Enter ID : ");
                     id=sc.nextInt();
                    System.out.println("Enter name ");
                    name=sc.nextLine();
                    System.out.println("Enter Salary ");
                    double salary=sc.nextDouble();
                    System.out.println("Enter age");
                    int age=sc.nextInt();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    dao.createEmployee(emp);
                    break;
                case 2:
                    dao.showAllEmployee();
                    break;
                case 3:
                    System.out.println("Enter id to show the details ");
                    int empid=sc.nextInt();
                    dao.showEmployeeBasedOnID(empid);
                    break;
                case 4:
                    System.out.println("Enter id to update the details");
                    int empid1=sc.nextInt();
                    System.out.println("Enter the new name");
                    name=sc.next();
                    dao.updateEmployee(empid1,name);
                    break;
                case 5:
                    System.out.println("Enter the id to delete");
                    id=sc.nextInt();
                    dao.deleteEmployee(id);
                    break;
                case 6:
                    System.out.println("Thank you for using our Application !!!");
                    System.exit(0);

                default:
                    System.out.println("enter valid choice !");
            }
        }
        while (true);
    }
}