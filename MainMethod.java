package com.motivity2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.Scanner;
	public class MainMethod 
	{
	    public static void main( String[] args )
	    {
	         
	        ApplicationContext context=new ClassPathXmlApplicationContext("spring.cfg.xml");
	        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
	        
	        Scanner sc=new Scanner(System.in);
	        do {
	        	System.out.println("Choose the operation to be performed");
	        	  System.out.println("1:Insert 2:Delete 3:Update 4:Exit");
	        	 int n=sc.nextInt();
	        switch(n) {
	        case 1:String query1="insert into student(studentId,studentName,studentAddress,studentFatherName) value(?,?,?,?)";
	        System.out.println("Enter the studentId to be inserted");
	        int n1=sc.nextInt();
	        System.out.println("Enter the studentName to be inserted");
	        String s1=sc.next();
	        System.out.println("Enter the studentAddress to be inserted");
	        String s2=sc.next();
	        System.out.println("Enter the studentFatherName to be inserted");
	        String s3=sc.next();
	        template.update(query1,n1,s1,s2,s3);
	        System.out.println("Record inserted.. ");
	        break;
	        case 2:String query2="delete from student where studentId=?";
	        System.out.println("Enter the studentId to be deleted");
	        int n2=sc.nextInt();
	        template.update(query2,n2);
	        System.out.println("Record deleted.. ");
	        break;     
	        case 3:
	        System.out.println("Enter the studentId whose information is to be updated");
	        int n3=sc.nextInt();
	        System.out.println("a.Update studentName b.Update studentAddress c. Update studentFatherName ");
	        char ch1=sc.next().charAt(0);
	        switch(ch1) {
	        case 'a':
	        	String query3="update student set studentName=? where studentId=?";
	        System.out.println("Enter the studentName to which the name is to be updated");
	        String s4=sc.next();
	        template.update(query3,s4,n3);
	        break;
	        case 'b':
	        	String query4="update student set studentAddress=? where studentId=?";
	        System.out.println("Enter the studentAddress to which the address is to be updated");
	        String s5=sc.next();
	        template.update(query4,s5,n3);
	        break;
	        case 'c':
	        	String query5="update student set studentFatherName=? where studentId=?";
	        System.out.println("Enter the studentFatherName to which the FatherName is to be updated");
	        String s6=sc.next();
	        template.update(query5,s6,n3);
	        break;}
	        System.out.println("Record updated.. ");
	        break;
	        case 4:java.lang.System.exit(0);
	       
	        }
	        } while(true);
	        
	        
	        }   
	        
	        
	        
	    }
