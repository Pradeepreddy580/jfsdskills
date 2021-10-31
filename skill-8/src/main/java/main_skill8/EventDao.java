package main_skill8;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EventDao {

	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	
	public int save(Event e) {
		String sql="insert into Event(eventName,conductedBy,numberOfUsersRegistered) values('"+e.getEventName()+"','"+e.getConductedBy()+"','"+e.getNumberOfUsersRegistered()+"')";    
	    return template.update(sql);   
		
	}
	
	public List<Event> getEvents(){    
	    List<Event> list =  template.query("select * from event",new RowMapper<Event>(){    
	        public Event mapRow(ResultSet rs, int row) throws SQLException {    
	            Event e=new Event();    
	            e.setId(rs.getInt("id"));    
	            e.setEventName(rs.getString("eventname"));
	            e.setConductedBy(rs.getString("conductedby"));
	            e.setNumberOfUsersRegistered(rs.getInt("numberofusersregistered"));
	            return e;    
	        }    
	    });
	    return list;
	}

}