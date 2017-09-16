package com.iot.kedric.vendor.service;

import java.util.List;

import com.iot.kedric.vendor.dto.VendorInfo;

public interface VendorService {
	public VendorInfo getVendorInfo(VendorInfo vi);

	public List<VendorInfo> getVendorInfoList(VendorInfo vi);
	
	public List<VendorInfo> getVendorInfoCombo();
	
	public int insertVendorInfoList(VendorInfo[] vendorList);
	
	public int deleteVendorInfo(VendorInfo vi);
	
	public int updateVendorInfo(VendorInfo vi);
}
