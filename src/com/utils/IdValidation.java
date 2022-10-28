package com.utils;

import com.app.org.Emp;
import com.app.org.Mgr;
import com.exception.invalidIDBoundException;


public class IdValidation {
	public static String validateFirstName(String firstName, Emp[] EmpArr) throws invalidIDBoundException {
		// 1. Create a new vehicle instance wrapping UID (i.e chasis no)
		Emp newEmp = new Mgr(firstName);
		// 2 . Iterate over the array : invoke equals
		for (Emp v : EmpArr)
			if (v != null)
				if (v.equals(newEmp)) // => dup detected !
					throw new invalidIDBoundException("Duplicate first name detected!!!!!!!!!!!!");
		// => no dup !
		return firstName;

	}

}
