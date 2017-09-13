package com.iot.kedric.db.dao;

import java.util.List;

import com.iot.kedric.db.dto.Column;
import com.iot.kedric.db.dto.DataBase;
import com.iot.kedric.db.dto.DbInfo;
import com.iot.kedric.db.dto.Table;


public interface DbDao {

	public List<DbInfo> selectDbInfoList(DbInfo di);
	
	public List<Table> selectTableList(DataBase di) throws Exception;

	public DbInfo selectDbInfo(DbInfo di);
	public boolean isConnecteDB(DbInfo di) throws Exception;
	public List<DataBase> selectDatabaseList() throws Exception;

	public List<Column> selectTableInfo(Table table)throws Exception;

}
