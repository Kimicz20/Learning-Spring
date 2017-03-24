package com.imooc.mvcdemo.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.imooc.mvcdemo.model.Course;
import com.imooc.mvcdemo.service.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {

	private static Logger log = LoggerFactory.getLogger(CourseService.class);
	private CourseService courseService;

	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	//1.URL访问 三种样式
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String viewCourse(@RequestParam("courseId") Integer courseId,Model model){
		log.debug("in vieCourse,courseId = {}", courseId);
		Course course = courseService.getCoursebyId(courseId);
				model.addAttribute(course);
		return "course_overview";
	}
	
	@RequestMapping(value="/view2/{courseId}",method=RequestMethod.GET)
	public String viewCourse2(@PathVariable("courseId") Integer courseId,Map<String,Course> model){
		log.debug("in vieCourse,courseId = {}", courseId);
		Course course = courseService.getCoursebyId(courseId);
		model.put("course",course);
		return "course_overview";
	}
	@RequestMapping("view3")
	public String viewCourse3(HttpServletRequest request){
		int courseId = Integer.valueOf(request.getParameter("courseId"));
		log.debug("in vieCourse,courseId = {}", courseId);
		Course course = courseService.getCoursebyId(courseId);
		request.setAttribute("course", course);
		return "course_overview";
	}
	
	//2.表单对象解析以及页面重定向方式
	@RequestMapping(value="/admin",method=RequestMethod.GET,params="add")
	public String addCourse(){
		return "course_admin/edit";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String doSave(@ModelAttribute Course course){
		log.debug(ReflectionToStringBuilder.toString(course));
		course.setCourseId(122);
		return "redirect:view2/"+course.getCourseId();
	}
	
	//3.文件上传
	@RequestMapping(value="/upload",method=RequestMethod.GET)
	public String showUploadPage(){
		return "course_admin/file";
	}
	
	@RequestMapping(value="/doUpload",method=RequestMethod.POST)
	public String fileUpload(@RequestParam("file") MultipartFile file) throws IOException{
		if(!file.isEmpty()){
			log.debug("fileupload ,file name:"+file.getOriginalFilename());
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File("D:\\workspace\\SpringMVC-space\\spring-mvc-study\\src\\main\\webapp\\resources\\imgs\\",System.currentTimeMillis()+file.getOriginalFilename()));
		}
		return "success";
	}
	//4.JSon
	@RequestMapping(value="/{courseId}",method=RequestMethod.GET)
	public @ResponseBody Course getCourseInJSon(@PathVariable Integer courseId){
		return courseService.getCoursebyId(courseId);
	}
}
