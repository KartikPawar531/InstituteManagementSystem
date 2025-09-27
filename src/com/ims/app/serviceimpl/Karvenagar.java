package com.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.app.model.Batch;
import com.ims.app.model.Course;
import com.ims.app.model.Faculty;
import com.ims.app.model.Student;
import com.ims.app.servicei.Cjc;

public class Karvenagar implements Cjc{
	
	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	Course c = new Course();
	Faculty f = new Faculty();
	Batch b = new Batch();
	Student s = new Student();
	

	@Override
	public void addCourse() {
		System.out.println("Enter Course Id and Course Name");
		int cid = sc.nextInt();
		String cnm = sc.next();
		c.setCid(cid);
		c.setCname(cnm);
		clist.add(c);
	}

	@Override
	public void viewCourse() {
		clist.forEach(cur->{
			System.out.println("Course:-"+cur.getCid()+" "+cur.getCname());
		});	
	}

	@Override
	public void addFaculty() {
		System.out.println("Enter Faculty id and faculty name");
		int fid = sc.nextInt();
		String fnm = sc.next();
		f.setFid(fid);
		f.setFname(fnm);
		f.setCourse(c);
		flist.add(f);	
	}

	@Override
	public void viewFaculty() {
		flist.forEach(fac->{
			System.out.println("Faculty:-"+fac.getFid()+" "+fac.getFname());
			System.out.println("Course:-"+fac.getCourse().getCid()+" "+fac.getCourse().getCname());
		});
	}

	@Override
	public void addBatch() {
		System.out.println("Enter Your Batch id and batch name");
		int bid = sc.nextInt();
		String bnm = sc.next();
		b.setBid(bid);
		b.setBname(bnm);
		b.setFaculty(f);
		blist.add(b);
	}

	@Override
	public void viewBatch() {
		blist.forEach(bat->{
			System.out.println("Batch:-"+bat.getBid()+" "+bat.getBname());
			System.out.println("Faculty:-"+bat.getFaculty().getFid()+" "+bat.getFaculty().getFname());
			System.out.println("Course:-"+bat.getFaculty().getCourse().getCid()+" "+bat.getFaculty().getCourse().getCname());
		});	
	}

	@Override
	public void addStudent() {
		System.out.println("Enter Student Id and Student Name");
		int sid = sc.nextInt();
		String snm = sc.next();
		s.setSid(sid);
		s.setSname(snm);
		s.setBatch(b);
		slist.add(s);
	}

	@Override
	public void viewStudent() {
		slist.forEach(stu->{
			System.out.println("Student:-"+stu.getSid()+" "+stu.getSname());
			System.out.println("Batch:-"+stu.getBatch().getBid()+" "+stu.getBatch().getBname());
			System.out.println("Faculty:-"+stu.getBatch().getFaculty().getFid()+" "+stu.getBatch().getFaculty().getFname());
			System.out.println("Course:-"+stu.getBatch().getFaculty().getCourse().getCid()+" "+stu.getBatch().getFaculty().getCourse().getCname());
		});	
	}
}
