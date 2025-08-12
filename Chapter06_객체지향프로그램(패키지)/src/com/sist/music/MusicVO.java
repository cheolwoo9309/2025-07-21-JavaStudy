package com.sist.music;

import lombok.Data;

// 데이터보호는 어렵다 => 메소드를 이용해서 접근한다
@Data
public class MusicVO {
	private int mno; // 뮤직번호
	private String title; // 곡명
	private String singer; // 가수명
	private String album; // 앨범명
	private String state; 
	private int idcrement; // 등폭
}
