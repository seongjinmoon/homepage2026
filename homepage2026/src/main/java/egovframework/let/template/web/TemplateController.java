package egovframework.let.template.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.util.EgovUserDetailsHelper;
import jakarta.servlet.http.HttpServletRequest;


@Controller
public class TemplateController {
	
	//헤더
	@RequestMapping(value = "/template/header.do")
	public String header(HttpServletRequest request, ModelMap model) throws Exception{
		
		LoginVO user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		model.addAttribute("USER_INFO", user);
		
		return "/template/Header";
	}
	
	//푸터
	@RequestMapping(value = "/template/footer.do")
	public String footer(HttpServletRequest request, ModelMap model) throws Exception{
		
		return "/template/Footer";
	}
}