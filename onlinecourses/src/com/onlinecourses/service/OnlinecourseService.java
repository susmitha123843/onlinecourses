package com.onlinecourses.service;

import com.onlinecourses.dao.OnlinecourseDAO;
import com.onlinecourses.dao.OnlinecourseDAOInterface;
import com.onlinecourses.entity.OnlinecourseStudent;

public class OnlinecourseService implements OnlinecourseServiceInterface  {

	public static OnlinecourseServiceInterface createServiceObject() {
		
		return new  OnlinecourseService();
	}

	public int createProfile(OnlinecourseStudent os) {
		OnlinecourseDAOInterface od=OnlinecourseDAO.createobject();
		return od.createObject(os);
	}

	@Override
	public int createProfile(com.onlinecourses.service.OnlinecourseStudent os) {
		// TODO Auto-generated method stub
		return 0;
	}

	}


