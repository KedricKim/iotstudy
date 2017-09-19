package com.iot.kedric.db.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.kedric.db.dao.DbDao;
import com.iot.kedric.db.dto.Column;
import com.iot.kedric.db.dto.DataBase;
import com.iot.kedric.db.dto.DbInfo;
import com.iot.kedric.db.dto.Table;


@Service
public class DbServiceImpl implements DbService{

	@Autowired
	DbDao dDao;
	
	@Override
	public List<DbInfo> getDbInfoList(DbInfo di) {
		return dDao.selectDbInfoList(di);
	}

	@Override
	public List<Table> getTableList(DataBase di) throws Exception {
		return dDao.selectTableList(di);
	}
	public boolean isConnecteDB(DbInfo pDi) throws Exception{
		DbInfo di = dDao.selectDbInfo(pDi);
		return dDao.isConnecteDB(di);
	}
	
	public List<DataBase> getDataBaseList() throws Exception{
		return dDao.selectDatabaseList();
	}

	@Override
	public List<Column> getTableInfo(Table table) throws Exception {
		// TODO Auto-generated method stub
		return dDao.selectTableInfo(table);
	}

	@Override
	public Map<String, Object> runSql(Map<String, String> pm) throws Exception {
		return dDao.runSql(pm);
	}

	@Override
	public Map<String, Object> runSqls(Map<String, List> pm) throws Exception {
		return dDao.runSqls(pm);
	}

}
