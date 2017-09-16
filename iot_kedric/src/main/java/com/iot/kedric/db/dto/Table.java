package com.iot.kedric.db.dto;

import org.springframework.stereotype.Component;

@Component
public class Table{
	private String tableName;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Override
	public String toString() {
		return "Table [tableName=" + tableName + "]";
	}
	
}
