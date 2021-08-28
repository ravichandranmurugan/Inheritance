package ddsd;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Checking")
public class Checking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		REGISTER r1=new REGISTER();
		r1.setName(request.getParameter("d1"));
		r1.setMobile(Integer.parseInt(request.getParameter("d2")));
		r1.setE_mail(request.getParameter("d3"));
        r1.setPasswod(request.getParameter("d4"));
        
        SessionFactory ses=new Configuration().configure("ddsd/register.cfg.xml").buildSessionFactory(); 
		Session s=ses.openSession();
		s.beginTransaction();
		s.save(r1);
		s.getTransaction().commit();
		s.close();
		
	}

}
