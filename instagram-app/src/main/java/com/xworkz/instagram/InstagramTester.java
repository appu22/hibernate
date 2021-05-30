package com.xworkz.instagram;

import com.xworkz.instagram.dao.InstagramDAO;
import com.xworkz.instagram.dao.InstagramDAOImple;
import com.xworkz.instagram.dto.InstagramDTO;
import com.xworkz.instagram.service.InstagramService;
import com.xworkz.instagram.service.InstagramServiceImple;

public class InstagramTester {

	public static void main(String[] args) {

		System.out.println("Program start");
		InstagramDTO dto = new InstagramDTO("insta story save", "hebbuli", 7045400, 200000.0, "Not active", "insta 2");

		InstagramService service = new InstagramServiceImple();

		InstagramDAO daoimple = new InstagramDAOImple();

		System.out.println("********** aggregate functions  *************");
		daoimple.getMaximumNofUsersOfInstagram();
//		daoimple.getMinimumNumberOfUsersInsta();
//		daoimple.getCountOfAllInstagramRecords();
//		daoimple.getSumOfAllInstagramUsers();

//		System.out.println("**********  *************");
//		daoimple.getCeoNamesByInstaName();
//		daoimple.save(dto);
//		daoimple.getInstagram();
//		daoimple.getAllRecord();
//		daoimple.getOneRowDataOfInstagram();
		System.out.println("Program End");
	}

}
