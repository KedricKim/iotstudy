package com.iot.kedric.vendor.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.iot.kedric.vendor.dto.VendorInfo;


@Repository
public class VendorDAOImpl extends SqlSessionDaoSupport implements VendorDAO{
	
	@Override
	public VendorInfo selectVendorInfo(VendorInfo vi) {
		return this.getSqlSession().selectOne("vendor.SELECT_VENDOR",vi);
	}

	@Override
	public List<VendorInfo> selectVendorInfoCombo() {
		return this.getSqlSession().selectList("vendor.SELECT_VENDOR_COMBO");
	}

	@Override
	public List<VendorInfo> selectVendorInfoList(VendorInfo vi) {
		return this.getSqlSession().selectList("vendor.SELECT_VENDOR",vi);
	}

	@Override
	public int insertVendorInfo(VendorInfo vi) {
		return this.getSqlSession().insert("vendor.INSERT_VENDOR",vi);
	}

	@Override
	public int deleteVendorInfo(VendorInfo vi) {
		return this.getSqlSession().delete("vendor.DELETE_VENDOR",vi);
	}

	@Override
	public int updateVendorInfo(VendorInfo vi) {
		return this.getSqlSession().update("vendor.UPDATE_VENDOR",vi);
	}

}
