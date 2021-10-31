package main_skill8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@Autowired
	private EventDao eventDao;
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}
	
	@RequestMapping("/events")
	public ModelAndView events() {
		ModelAndView mv = new ModelAndView();
		List<Event> event = this.eventDao.getEvents();
		mv.addObject("event",event);
		mv.setViewName("events.jsp");
		return mv;
	}
	@RequestMapping("/createEvent")
	public ModelAndView createEvent() {
		Event e = new Event();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("e",e);
		mv.setViewName("createEvent.jsp");
		return mv;
	}
	
	@PostMapping("/addEvent")
	public ModelAndView addEvent(@ModelAttribute("Event") Event event) {
		System.out.println(event.getEventName());
		System.out.println(event.getConductedBy());
		event.setNumberOfUsersRegistered(0);
		this.eventDao.save(event);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("events.jsp");
		return mv;
	}
}
