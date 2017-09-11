package com.iot.kedric.vendor.dao;

import java.util.List;

import com.iot.kedric.goods.dto.GoodsInfo;
import com.iot.kedric.vendor.dto.VendorInfo;

public interface VendorDAO {
	public VendorInfo selectVendorInfo(VendorInfo gi);

	public List<VendorInfo> selectVendorInfoList(VendorInfo gi);
	
	public List<VendorInfo> selectVendorInfoCombo();
	
	public int insertVendorInfo(VendorInfo vi);

	public int deleteVendorInfo(VendorInfo vi);

	public int updateVendorInfo(VendorInfo vi);
	
}
