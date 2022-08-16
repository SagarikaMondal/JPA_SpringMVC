package com.java.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchEmployee {

	public static void main(String[] args) {
		
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");
		 EntityManager em=emf.createEntityManager();
		 em.getTransaction().begin();
		
		 //insert data
		 EmployeeEntity e1=new EmployeeEntity();
		   e1.setEmpNo(1234);
		   e1.seteName("Sagarika");
		   e1.setDesignation("Developer");
		   e1.setSal(45600.87);
		   
		   EmployeeEntity e2=new EmployeeEntity();
		   e2.setEmpNo(4567);
		   e2.seteName("Sangita");
		   e2.setDesignation("Tester");
		   e2.setSal(34600.97);
		   
		   EmployeeEntity e3= new EmployeeEntity();
		   e3.setEmpNo(7890);
		   e3.seteName("Sayani");
		   e3.setDesignation("Manager");
		   e3.setSal(55600.27);
		   
		       em.persist(e1);
		       em.persist(e2);
		       em.persist(e3);
		   
		   em.getTransaction().commit();
		       
		   //JPQL Fetch
	    Query q= em.createQuery("select e from EmployeeEntity e");
		
	    List <EmployeeEntity> list= q.getResultList();
		
		    for(EmployeeEntity ee:list)
		
	    {
		
	     System.out.println(ee.getEmpNo()+" "+ee.geteName()+" "+ee.getDesignation()+" "+ee.getSal());
		
	    }
		     
	}

}
