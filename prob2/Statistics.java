package prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		if(aList == null || aList.isEmpty()) {
			return 0.0;
		}
		double sum = 0;
		for(EmployeeData employee : aList) {
			sum += employee.getSalary();
		}
		return sum;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
