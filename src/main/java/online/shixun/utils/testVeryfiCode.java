package online.shixun.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class testVeryfiCode {

	@Test
	public void test() {
		ValidateCode validateCode = new ValidateCode();
		validateCode.createCode();
		String code = validateCode.getCode();
		validateCode.getBuffImg();
		System.out.println(code);
	}

}
