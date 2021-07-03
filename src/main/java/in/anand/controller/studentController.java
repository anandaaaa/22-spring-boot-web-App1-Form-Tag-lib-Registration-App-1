package in.anand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.anand.binding.StudentBinding;
import in.anand.service.StudentService;

@Controller
public class studentController {
	
	@Autowired
	private StudentService stdser;
	
	@GetMapping("/loadform")
	public String loadForm(Model model)
	{
		
		model.addAttribute("courses", stdser.getCourses());
		model.addAttribute("gender", stdser.getGender());
		model.addAttribute("timings", stdser.gettimings());
		
		System.out.println(stdser.courseRepo);
		
		StudentBinding binding = new StudentBinding();
		
		model.addAttribute("student", binding);
		
		return "index";
		
	}
	
	@PostMapping("/register")
	public String Registerstudent(StudentBinding ss,Model model)
	{
		model.addAttribute("msg", "success");
		System.out.println(ss);
		
		return "dashbord";
	}
	
	

}
