<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>String Manipulation Web Site</title>
<script language="JavaScript">
    function validate(form1)
    { if (form1.text.value == "" )
        { alert("the text field is empty.")
            form1.text.focus()
            form1.text.select()
            return false
        }
    

    	
    return true}
    </script>

</head>
<body>
<h1>Final Exam Project SWE432</h1>
<form method="GET" action="final_exam.do"
    onSubmit="return validate(this)">
	<br>
	  <label for="text">Add String Below:</label>
      <br>
      <textarea id="text" name="text" rows="12" cols="50"></textarea>
      <br/>   	
	<input type = "submit" value = "Submit"/>
	<input type = "reset" value = "Reset" />
</form>
</body>
</html>