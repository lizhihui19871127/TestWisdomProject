package wisdom.rsa;

import java.util.Map;

public class WisdomTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WisdomTest.test();
	}
	
	public static void test(){
		try {
			Map<String, Object> keyMap = RSACoder.initKey();
			String publicKey = RSACoder.getPublicKey(keyMap);
			String privateKey = RSACoder.getPrivateKey(keyMap);
			System.out.println("¹«Ô¿: \n\r" + publicKey);
			System.out.println("Ë½Ô¿£º \n\r" + privateKey);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
