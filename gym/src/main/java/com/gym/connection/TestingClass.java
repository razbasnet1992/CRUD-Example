package com.gym.connection;

import java.util.Scanner;

import com.gym.dao.MemberInfoImp;
import com.gym.model.MemberInfo;

public class TestingClass {

	public static void main(String[] args) {
		MemberInfo user = new MemberInfo();
		MemberInfoImp update = new MemberInfoImp();
		Scanner scanner = new Scanner(System.in);
		String first = scanner.next();
		String last = scanner.next();
		String dob = scanner.next();
		String location = scanner.next();
		int id = scanner.nextInt();
		user.setFirstName(first);
		user.setLastName(last);
		user.setDob(dob);
		user.setLocation(location);
		user.setId(id);
		update.updateMember(user);

	}

}
