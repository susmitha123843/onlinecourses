package com.onlinecourses.dao;

import com.onlinecourses.entity.OnlinecourseStudent;

public class OnlinecourseDAO implements OnlinecourseDAOInterface {
	private OnlinecourseDAO()
	{
	}
	

	public static OnlinecourseDAOInterface createobject() {
		// TODO Auto-generated method stub
		return new OnlinecourseDAO();
	}


	@Override
	public int createObject(OnlinecourseStudent os) {
		// TODO Auto-generated method stub
		return 0;
	}

}
