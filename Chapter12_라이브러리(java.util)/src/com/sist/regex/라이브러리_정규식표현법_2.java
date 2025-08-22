package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 라이브러리_정규식표현법_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="내 휴대폰번호는 010-9473-9309 이고 회사전화는 02-3456-7890 입니다";
		String regex="\\d{2,3}-\\d{3,4}-\\d{4}";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(msg);
		
		while(m.find()) {
			System.out.println("전화번호:"+m.group());
		}
	}

}
