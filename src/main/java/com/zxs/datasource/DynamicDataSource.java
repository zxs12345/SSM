package com.zxs.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() 
	{
		//切换对应的数据源
		return DataSourceContextHolder.getDataSource();
	}

}
