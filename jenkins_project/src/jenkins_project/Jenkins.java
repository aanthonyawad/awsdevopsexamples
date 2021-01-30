package jenkins_project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Jenkins {
	public static void main(String [] args) {
		String now = new SimpleDateFormat("dd-MM-yyyy : mm-hh").format(new Date());
		System.out.print("Hello NSY_205 : "+ now);
	}

}
