package online.shixun.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class testVeryfiCode {

	@Test
	public void test() {
		ValidateCode validateCode = new ValidateCode();
		validateCode.createCode();
		String code = validateCode.getCode();
		System.out.println(code);
	}

}
