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

        return "saved";
    }

    @RequestMapping(path = "/test", method = {RequestMethod.GET})
    public List<Cost> get() throws IOException {

        return list;
    }
}