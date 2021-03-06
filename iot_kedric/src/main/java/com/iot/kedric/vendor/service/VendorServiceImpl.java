package com.iot.kedric.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.kedric.vendor.dao.VendorDAO;
import com.iot.kedric.vendor.dto.VendorInfo;

@Service
public class VendorServiceImpl implements VendorService{
	@Autowired
	VendorDAO vDao;
	
	@Override
	public VendorInfo getVendorInfo(VendorInfo vi) {
		return vDao.selectVendorInfo(vi);
	}

	@Override
	public List<VendorInfo> getVendorInfoList(VendorInfo vi) {
		return vDao.selectVendorInfoList(vi);
	}

	@Override
	public List<VendorInfo> getVendorInfoCombo() {
		return vDao.selectVendorInfoCombo();
	}

	@Override
	public int insertVendorInfoList(VendorInfo[] viList) {
		int result = 0;
		for(VendorInfo vi : viList){
			result += vDao.insertVendorInfo(vi);
		}
		return result;
	}

	@Override
	public int deleteVendorInfo(VendorInfo vi) {
		return vDao.deleteVendorInfo(vi);
	}

	@Override
	public int updateVendorInfo(VendorInfo vi) {
		return vDao.updateVendorInfo(vi);
	}
}
