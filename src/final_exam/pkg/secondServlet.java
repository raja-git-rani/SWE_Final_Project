package final_exam.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class secondServlet
 */
@WebServlet("/secondServlet")
public class secondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public secondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setContentType("text/html");
			PrintWriter out = response.getWriter();
		    String forwardedString = (String) request.getAttribute("textForwarded");
		    PrintBody (out, forwardedString);
		    
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void PrintBody (PrintWriter out, String str1)
	{
	   String[] stringArray = str1.split("\\s+");
	   String[] tempStringArray = new String[stringArray.length] ;
	  
	  
	 
	   Set<String> hash_Set   = new HashSet<String>(); 
	   for( int i =0;i<stringArray.length;i++){
		   tempStringArray[i] = stringArray[i];
		   if(tempStringArray[i].equals("<script>") || tempStringArray[i].equals("<javascript>") || tempStringArray[i].equals("onLoad")){
			   
		   }
			   
		   else{
			   hash_Set.add(stringArray[i]); 
		   }
		   
	   }

	   String[] hashArray = new String[hash_Set.size()];
	   hash_Set.toArray(hashArray);
	   
	   Arrays.sort(hashArray, Collections.reverseOrder());
	
	   
	   out.println("<body>");
	   out.println("<p>");
	   out.println("A simple example that demonstrate string manipulation");
	   out.println("uses multiple servlet");
	   out.println("</p>");
	   out.println("");
	 
 	   out.println("<div class=\"row\">");
	   
	   out.println("<div class= \"column\">");
	   out.println("<div class= \"leftside\">");
	   out.println(" Your Input");
	   out.print("</div>");
	     
	   out.print(" <textarea id=\"text1\" name= \"text1\" style=\"color:8B0000\" rows=\"12\" cols=\"50\"disabled>");
	   for( int i =0;i<stringArray.length;i++){
		   out.println( tempStringArray[i] );
		   
	   }
	   out.println("</textarea>"); 
	   out.println("</div>");
	   
	   out.println("<div class= \"column\">");
	   out.println("<div class= \"rightside\">");
	   out.println(" Output (In Descending Order)");
	   out.println("</div>");
	   out.println(" <textarea id=\"text2\" name= \"text2\" style=\"color:8B0000\" rows=\"12\" cols=\"50\"disabled >");
	   for( int i =0;i<hash_Set.size();i++){
		   out.println( hashArray[i] );
	   }
	   out.println("</textarea>");
	
	   out.println("</div>");
	   out.println("</div>");

	   out.println("");
	   out.println("</body>");
	}
	
	
}
