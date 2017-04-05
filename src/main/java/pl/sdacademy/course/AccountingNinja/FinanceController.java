package pl.sdacademy.course.AccountingNinja;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

	
@RestController
@RequestMapping("/transactions")
public class FinanceController {
	

	List<Cost> list = new ArrayList<Cost>();

    @RequestMapping(path = "/test", method = {RequestMethod.POST})
    public String save(@RequestBody Cost lineToSave) throws IOException {
    	list.add(lineToSave);
//        File file = new File("test.txt");
//        Writer writer = new FileWriter(file, true); 
//        writer.write(lineToSave+ System.lineSeparator());
//        writer.flush();
        return "saved";
    }

    @RequestMapping(path = "/test", method = {RequestMethod.GET})
    public List<Cost> get() throws IOException {
//        File file = new File("test.txt");
//        Scanner sc = new Scanner(file);
//        ObjectMapper mapper = new ObjectMapper();
//        while(sc.hasNextLine()){
//            Cost newCost = mapper.readValue(sc.nextLine(),Cost.class);
//            list.add(newCost);
//            sc.close();
//            
//        }
        return list;
    }
}