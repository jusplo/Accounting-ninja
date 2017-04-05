package pl.sdacademy.course.AccountingNinja;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanceController {

	FileManager fm = new FileManager();

	@RequestMapping(path = "/transactions", method = { RequestMethod.POST })
	public String save(@RequestBody Cost lineToSave) throws IOException {
		fm.add(lineToSave);

		return "saved";
	}

	@RequestMapping(path = "/transactions", method = { RequestMethod.GET })
	public List<Cost> get() throws IOException {

		return fm.getList();
	}
}