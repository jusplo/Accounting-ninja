package pl.sdacademy.course.AccountingNinja;

import java.util.ArrayList;
import java.util.List;

public class FileManager {

	final List<Cost> list = new ArrayList<Cost>();

	public List<Cost> getList() {
		return list;
	}
	
	public void add(Cost cost){
		list.add(cost);
	}
	
	
	
}
