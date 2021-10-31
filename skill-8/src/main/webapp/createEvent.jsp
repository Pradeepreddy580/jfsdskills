<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Event</title>
</head>
<body>
	<form action='addEvent' method='post'>
  <div class="form-group">
    <label for="exampleInputEmail1">Event Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Event Name" name='eventName'>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Conducted By</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="Conducted By" name='conductedBy'>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>

