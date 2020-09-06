package com.springMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springMVC.dao.StudentDao;
import com.springMVC.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentDao dao;
	
	
	@RequestMapping(value = { "/", "/getall"}, method = RequestMethod.GET)
	public String getAll(Model m) {
		List<Student> studentList = dao.getStudents();
		m.addAttribute("stdList", studentList);
		return "view_all";
	}
	@RequestMapping(value = "/stdform", method=RequestMethod.GET)
	public String studentForm(Model m) {
		m.addAttribute("command", new Student());
		return "stdform";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("student") Student student) {
		dao.save(student);
		return "redirect:/getall";
	}

	

	@RequestMapping(value = "/editstd/{id}", method = RequestMethod.GET)
	public String editStd(@PathVariable int id, Model m) {
		Student std = dao.getStudentById(id);
		m.addAttribute("command", std);
		return "editStdForm";
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String updateStd(@ModelAttribute("student") Student student) {
		System.out.println("Save edited record " + student.getStd_id());
		System.out.println(student.toString());
		dao.update(student);
		return "redirect:/getall";
	}

	@RequestMapping(value = "/deletestd/{id}", method = RequestMethod.GET)
	public String deleteStd(@PathVariable int id) {
		System.out.println("Deleted record " + id);
		dao.delete(id);
		return "redirect:/getall";
	}

}
