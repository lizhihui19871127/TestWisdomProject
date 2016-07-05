package wisdom;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class Test3 {
	public static void main(String[] args) {
		Test3 test3 = new Test3();
		test3.run();
		
	}
	
	void run(){
		String url = "http://www.baidu.com/main/getInfo?id=3&server=getName&ticket=111111";
		String string = URLEncoder.encode(url);
		System.out.println(string);
		String string2 = URLDecoder.decode(string);
		System.out.println(string2);
	}

}
