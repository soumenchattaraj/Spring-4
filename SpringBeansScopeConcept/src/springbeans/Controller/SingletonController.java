/**
 * 
 */
package springbeans.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springbeans.FormBeans.EmployeeDetails;

/**
 * @author Controller
 * Defining on singleton spring beans instantiation.
 *
 */
@Controller
public class SingletonController {
	
	EmployeeDetails employeeDetails =new EmployeeDetails();
	
	
	@RequestMapping(value="/springbeans.html",method=RequestMethod.GET)
	public ModelAndView singletonBeanGet(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		System.out.println("hello m in github");
		System.out.println(""+employeeDetails.hashCode());
		map.put("beanHashCode",employeeDetails.hashCode());
		return new ModelAndView("globalMessage");
	}

}
