package min1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy. MM. dd");

		System.out.println(sdf.format(date));
	}

}
