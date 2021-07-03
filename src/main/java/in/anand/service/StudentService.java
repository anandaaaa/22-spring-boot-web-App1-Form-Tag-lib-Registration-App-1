package in.anand.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.anand.Repository.CourseRepo;
import in.anand.Repository.GenderRepo;
import in.anand.Repository.TimingRepo;
import in.anand.entity.Gender;
import in.anand.entity.Timings;
import in.anand.entity.course;

@Service
public class StudentService {
	
	@Autowired
	public CourseRepo courseRepo;
	@Autowired
	public GenderRepo genderRepo;
	@Autowired
	public TimingRepo timimgRepo;
	
	
	public List<String> getCourses()
	{
		List<course> findAll = courseRepo.findAll();
		
		ArrayList<String> courses = new ArrayList<>();
		findAll.forEach(course->{
			courses.add(course.getCourseName());
		});
		return courses;
	}
	
	public List<String> getGender()
	{
		List<Gender> findAll = genderRepo.findAll();
		
		ArrayList<String> genders = new ArrayList<>();
		findAll.forEach(gender->{
			genders.add(gender.getGenderType());
		});
		return genders;
	}
	
	public List<String> gettimings()
	{
		List<Timings> findAll = timimgRepo.findAll();
		
		ArrayList<String> timimgs = new ArrayList<>();
		findAll.forEach(timimg->{
			timimgs.add(timimg.getTimingName());
		});
		return timimgs;
	}
	

}
