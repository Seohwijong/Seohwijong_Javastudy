package com.sist.seoul;

public interface Seoul {
	public SeoulVO[] soulList(int page);
	public SeoulVO[] seoulFind(String fd);
	public SeoulVO seoulDetailData(int index);
	
}
