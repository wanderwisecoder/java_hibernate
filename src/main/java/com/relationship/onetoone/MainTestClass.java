package com.relationship.onetoone;

import org.hibernate.*;

public class MainTestClass {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		

		System.out.println(factory);
		
		EmpAdd ad1 = new EmpAdd();
		ad1.setId(107);
		ad1.setAddress("Village Hidden in the Fire");
		
		
		EmpDetail e1 = new EmpDetail();
		e1.setId(207);
		e1.setEmp_name("Itachi");
		e1.setAddress(ad1);
		
		ad1.setEmp(e1);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();	
		
		//session.save(ad1);
		//session.save(e1);

		EmpDetail emp = (EmpDetail) session.get(EmpDetail.class, 205);
		System.out.println(emp);
		System.out.println(emp.getEmp_name());
		System.out.println(emp.getAddress());
		
		tx.commit();
		session.close();
		
		System.out.println("Data Inserted Successfully");
		factory.close();
		

	}

}
