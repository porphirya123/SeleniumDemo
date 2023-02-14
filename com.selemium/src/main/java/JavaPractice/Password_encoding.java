package JavaPractice;

import org.apache.commons.codec.binary.Base64;

public class Password_encoding {

	public static void main(String[] args) {
		String pass = "test123";
		
		byte[] encoded_pass = Base64.encodeBase64(pass.getBytes());
		System.out.println(new String(encoded_pass));
		
		byte[] decoded_pass = Base64.decodeBase64(encoded_pass);
		System.out.println(new String(decoded_pass));
		
		
	}

}
