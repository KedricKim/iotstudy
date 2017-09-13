package com.iot.kedric.db.service;

import java.util.List;

import com.iot.kedric.db.dto.Column;
import com.iot.kedric.db.dto.DataBase;
import com.iot.kedric.db.dto.DbInfo;
import com.iot.kedric.db.dto.Table;


public interface DbService {

	public List<DbInfo> getDbInfoList(DbInfo di);
	
	public List<Table> getTableList(DataBase di) throws Exception;

	public boolean isConnecteDB(DbInfo di) throws Exception;
	
	public List<DataBase> getDataBaseList() throws Exception;

	public List<Column> getTableInfo(Table table)throws Exception;

}
