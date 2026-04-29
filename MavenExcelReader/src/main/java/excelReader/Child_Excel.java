package excelReader;

import java.io.IOException;

public class Child_Excel {

	public static void main(String[] args) throws IOException {
		
	String result = Parent_Excel.getStringData(1,0);
	System.out.println(result);
	System.out.println(Parent_Excel.getIntegerData(1,1));
	System.out.println(Parent_Excel.getFloatData(2,1));
	}

}
