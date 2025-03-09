package BookShopPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insertSeverlet")
public class insertSeverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String catergory = request.getParameter("catergory");
		String quantity = request.getParameter("quantity");
		String description= request.getParameter("description");
		
		boolean isTrue;
		isTrue=BookControl.insertData (name,price,catergory,quantity,description);
		
		if(isTrue==true)
		{
			String alertMassage="Data Insert Succesfull";
		}
		else {
            
            request.setAttribute("alertMessage", "Failed to insert data. Please try again.");
        }
	}

}
