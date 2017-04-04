package pl.sdacademy.course.AccountingNinja;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanceController {
	
	@RequestMapping(path = "/transactions", method = { RequestMethod.GET })
	public String get() {
		return "Hello pipul xD";
	}
	
}
