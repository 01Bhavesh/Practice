package com.Dao;

import java.time.LocalDate;
import java.util.List;

import com.Entity.SalariedEmployee;

public class empDaoImp implements EmpDao{
	static List elst;
	static
	{
		elst.add(new SalariedEmployee(1,"saurabh",LocalDate.of(2021, 10, 12),30000,2500));
	}

}
