package com.tracking.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tracking.dto.OneDayDto;
import com.tracking.dto.UserDto;
import com.tracking.model.Employee;
import com.tracking.model.Idlelogger;
import com.tracking.model.Punch;
import com.tracking.model.Title;
import com.tracking.model.Useractivity;
import com.tracking.model.Users;
import com.tracking.repository.UserRepository;
import com.tracking.service.EmployeeService;
import com.tracking.service.IdleloggerService;
import com.tracking.service.PunchService;
import com.tracking.service.TitleService;
import com.tracking.service.UserActivityService;
import com.tracking.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
@RestController
@RequestMapping("/api")
public class TrackingController {

//	  @Autowired
//	  ModelMapper modelMapper; 
	
	  @Autowired
	  IdleloggerService idleloggerService;
	  
	  @Autowired
	  TitleService titleService;
	  
	  @Autowired
	  EmployeeService employeeService;

	  @Autowired
	  UserService userService;
	  
	  @Autowired
	  UserActivityService userActivityService;
	  
	  @Autowired
	  UserRepository userRepository;

	  @Autowired
	  PunchService punchService;
	  
	  @RequestMapping(value = "/index", method = RequestMethod.GET)
		public ModelAndView home(ModelAndView modelAndView, HttpServletRequest request) throws Exception {modelAndView.setViewName("index");
					return modelAndView;
				
		}
	
	@RequestMapping(method = RequestMethod.GET, value = "/record")
	  public ResponseEntity<List<Title>> getAllTitle(@RequestParam(required = false) String name) {
	    try {
	      List<Title> title = new ArrayList<Title>();

	    
	    	  titleService.findAll().forEach(title::add);
	  
	      if (title.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }

	      return new ResponseEntity<>(title, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
	  @RequestMapping(value = "/charts", method = RequestMethod.GET)
			public ModelAndView charts(ModelAndView modelAndView, HttpServletRequest request) throws Exception {modelAndView.setViewName("charts");
						return modelAndView;
					
			}
	  
	  
	  @RequestMapping(method = RequestMethod.GET, value = "/idle")
	  public ResponseEntity<List<Idlelogger>> getAllIdleData(@RequestParam(required = false) String name) {
	    try {
	      List<Idlelogger> idle = new ArrayList<Idlelogger>();

	    
	      idleloggerService.findAll().forEach(idle::add);
	  
	      if (idle.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }

	      return new ResponseEntity<>(idle, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	@RequestMapping(method = RequestMethod.GET, value = "/employee")
	  public ResponseEntity<List<Employee>> getAllEmployee(@RequestParam(required = false) String name) {
	    try {
	      List<Employee> employee = new ArrayList<Employee>();

	    
	      employeeService.findAll().forEach(employee::add);
	  
	      if (employee.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }

	      return new ResponseEntity<>(employee, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
	 @RequestMapping(value = "/attendencepage", method = RequestMethod.GET)
		public ModelAndView attendence(ModelAndView modelAndView, HttpServletRequest request) throws Exception {modelAndView.setViewName("attendence");
					return modelAndView;
				
		}
	 
	 
	 
	 
//	 public ResponseEntity<List<Users>> getAttendanceById(@RequestParam Users user) {
//		    try {
//		        List<Users> userData = new ArrayList<>();
//
//		        // Assuming there is a method like findByName in userService, replace it with the appropriate method
//		        if (user != null) {
//		            userService.findById(user).forEach(userData::add);
//		        } else {
//		            userService.findAll().forEach(userData::add);
//		        }
//
//		        if (userData.isEmpty()) {
//		            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		        }
//
//		        return new ResponseEntity<>(userData, HttpStatus.OK);
//
//		    } catch (Exception e) {
//		        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		    }
//		}


	
	
	 
		@RequestMapping(method = RequestMethod.GET, value = "/attendence")
		  public ResponseEntity<List<Users>> getAttendence(@RequestParam(required = false) String name) {
		    try {
		      List<Users> user = new ArrayList<Users>();

		      List<Users> users = userRepository.findByDate();
		     userService.findAll().forEach(user::add);
		  
		      if (user.isEmpty()) {
		        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		      }

		      return new ResponseEntity<>(user, HttpStatus.OK);
		    } catch (Exception e) {
		      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		    }
		  }
		
		@RequestMapping(method = RequestMethod.GET, value = "/activity")
		  public ResponseEntity<List<Useractivity>> getActivityAnalysis(@RequestParam(required = false) String name) {
		    try {
		      List<Useractivity> userActivity = new ArrayList<Useractivity>();
		      userActivityService.findAll().forEach(userActivity::add);
		  
		      if (userActivity.isEmpty()) {
		        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		      }

		      return new ResponseEntity<>(userActivity, HttpStatus.OK);
		    } catch (Exception e) {
		      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		    }
		  }
		
		@RequestMapping(method = RequestMethod.GET, value = "/punch")
		  public ResponseEntity<List<Punch>> getPunchAnalysis(@RequestParam(required = false) String name) {
			 try {
			      List<Punch> punch = new ArrayList<Punch>();
			      punchService.findAll().forEach(punch::add);
			  
			      if (punch.isEmpty()) {
			        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			      }

			      return new ResponseEntity<>(punch, HttpStatus.OK);
			    } catch (Exception e) {
			      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			    }
			  }
		
		@RequestMapping(method=RequestMethod.GET,value="/Details/{userId}")
		public ResponseEntity<UserDto> getAllPosts(@PathVariable Integer userId) {

			UserDto userDto= punchService.GetAllDetails(userId);
			 return new ResponseEntity<>(userDto, HttpStatus.OK);
		}
		
		
		
		@RequestMapping(method=RequestMethod.GET,value="/OneDay/{userId}")
		public ResponseEntity<OneDayDto> getOneDayDetails(@PathVariable Integer userId){
			
			OneDayDto oneDay=idleloggerService.GetUserOneDayData(userId);
			
			return new ResponseEntity<>(oneDay,HttpStatus.OK);
			
		}
		
		
		
	}
	
	
	
