package tester;

import static com.utils.IdValidation.validateFirstName;
import java.util.Scanner;
import com.app.org.*;
import com.exception.firstnameLastnameSameException;
import com.exception.invalidIDBoundException;

public class TestOrganization {

	public static void main(String[] args) throws invalidIDBoundException, firstnameLastnameSameException {
		boolean exit = false;
		int choice, counter = 0;
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter employee size of Organization:");
			int size = sc.nextInt();
			Emp[] personnel = new Emp[size];

			while (exit != true) {
				System.out.println("enter a choice: ");
				try {
					choice = sc.nextInt();

					switch (choice) {

					case 1:
						if (counter >= size)
							System.out.println("Organization Full");
						else
							System.out.println(
									"enter details for manager:1. First Name,2.Last Name,3.DeptID,4. Basic Salary,5. Perfomance Bonus");
						// personnel[counter] = new Mgr(sc.next(), sc.next(), sc.nextInt(),
						// sc.nextDouble(), sc.nextDouble());
						personnel[counter] = new Mgr(validateFirstName(sc.next(), personnel), sc.next(), sc.nextInt(),
								sc.nextDouble(), sc.nextDouble());
						// personnel[counter] = new Mgr(sc.next(),
						// personnel[counter].unique(personnel[counter].getFirstName(),sc.next()),
						// sc.nextInt(), sc.nextDouble(), sc.nextDouble());
						counter++;
						break;
					case 2:
						if (counter >= size)
							System.out.println("Organization Full");
						else
							System.out.println(
									"enter details for Worker :String firstName,String lastName,int deptID,double basic,int hoursWorked,double hourlyRate");
						personnel[counter] = new Worker(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(),
								sc.nextInt(), sc.nextDouble());
						// personnel[counter] = new Mgr(sc.next(),
						// personnel[counter].unique(personnel[counter].getFirstName(),sc.next()),
						// sc.nextInt(), sc.nextDouble(), sc.nextDouble());
						counter++;
						break;
					case 3:
						System.out.println("Details of all employees in Organization: ");

						for (Emp emp : personnel) {
							if (emp != null) {

								System.out.println(emp);
								if (emp instanceof Mgr)
									System.out.println("Net Salary: " + ((Mgr) emp).getNetSalary());
								else if (emp instanceof Worker)
									System.out.println("Net Salary: " + ((Worker) emp).getNetSalary());

							}
						}
						break;

					case 4:
						System.out.println("Enter Emp Id and amount to increment in salary:");
						boolean flag = false;
						int id = sc.nextInt();
						double amount = sc.nextDouble();
						try {
							for (int i = 0; i < counter; i++) {
								if (id == personnel[i].getId()) {
									personnel[i].setBasic(personnel[i].getBasic() + amount);
									flag = true;
									break;
								}
							}

							if (flag == false)
								throw new invalidIDBoundException("entered EmpId is Invalid!!!");
						} catch (invalidIDBoundException e) {
							System.out.println(e.getMessage());
							e.printStackTrace();
						}
						break;

					case 10:
						exit = true;
						break;

					}
				} catch (Exception e) {
					e.printStackTrace();
					// there may be some pending i/ps : read them off
					sc.nextLine();
				}
			}
			// sc.close();
		}

	}
}
