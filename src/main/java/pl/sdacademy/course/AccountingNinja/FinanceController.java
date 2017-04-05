package pl.sdacademy.course.AccountingNinja;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
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

		List<Cost> list = get();
		list.add(lineToSave);

		FileOutputStream fos = new FileOutputStream("costs1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();

		return "saved";
	}


	@RequestMapping(path = "/transactions", method = { RequestMethod.GET })

	public List<Cost> get() throws IOException {

		List<Cost> result = new ArrayList<>();

		if (new File("costs1.txt").exists()) {

			FileInputStream fis = new FileInputStream("costs1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			try {
				result = (List<Cost>) ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ois.close();
		}

		return result;
	}

}
