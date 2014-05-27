package com.callbacktest;

import java.text.NumberFormat;

public class Caculate {
	public static void main(String[] args) {
//		String a = "";
		String a = "";
		String b = "";
		
		String c = "0001";
		System.out.println(c+"========"+Integer.parseInt(c));
		System.out.println(c+"========"+Long.parseLong(c));

		caculateAdd(a, b);
		caculateSub(a, b);
	}

	static String checkString(String str) {
		if ("".equals(str) || null == str) {
			str = "0";
		}
		return str;
	}

	static String caculateAdd(String a, String b) {

		a = checkString(a);
		b = checkString(b);
		String strResult = "0";
		try {
			long la = Long.parseLong(a);
			long lb = Long.parseLong(b);
			long result = la + lb;
			NumberFormat nf = NumberFormat.getInstance();
			strResult = nf.format(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		 System.out.println(a +"+++"+ b + "=======" + strResult);
		return strResult;
	}

	static String caculateSub(String a, String b) {
		a = checkString(a);
		b = checkString(b);
		String strResult = "0";
		try {
			long la = Long.parseLong(a);
			long lb = Long.parseLong(b);
			long result = la - lb;
			NumberFormat nf = NumberFormat.getInstance();
			strResult = nf.format(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		 System.out.println(a +"---"+ b + "=======" + strResult);
		return strResult;
	}
}
