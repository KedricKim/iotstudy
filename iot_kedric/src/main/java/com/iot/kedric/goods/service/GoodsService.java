package com.iot.kedric.goods.service;

import java.util.List;

import com.iot.kedric.goods.dto.GoodsInfo;

public interface GoodsService {
	public GoodsInfo getGoodsInfo(GoodsInfo gi);

	public List<GoodsInfo> getGoodsInfoList(GoodsInfo gi);
	
	public int insertGoodsInfoList(GoodsInfo[] gi);
	
	public int insertGoodsInfo(GoodsInfo gi);

	public int updateGoodsInfo(GoodsInfo gi);

	public int deleteGoodsInfo(GoodsInfo gi);
}
