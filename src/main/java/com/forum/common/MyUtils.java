package com.forum.common;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;

public class MyUtils {
	
	public static String sHAEncrypt(String password) throws NoSuchAlgorithmException {
		MessageDigest mDigest = MessageDigest.getInstance("SHA");
		String value = password;
		//int a = Integer.parseInt(value);
		//byte b = (byte) a;
		byte[] inpute = value.getBytes();
		mDigest.update(inpute);        //input可以是字节型或字节型数组
		String key = new BigInteger(mDigest.digest()).toString();
		return key;
	}
}
