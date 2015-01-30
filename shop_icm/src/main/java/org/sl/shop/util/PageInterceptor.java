package org.sl.shop.util;

import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;

@Intercepts({ @Signature(method = "prepare", type = StatementHandler.class, args = { Connection.class }) })
public class PageInterceptor implements Interceptor {
	// 数据库类型，不同的数据库有不同的分页方法
	private String databaseType;


	/**
	 * 拦截后要执行的方法
	 */
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		
	    
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		System.out.println("mybatis plugin:"+target.getClass());
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
		this.databaseType = properties.getProperty("databaseType");
	}
	
	public String getDatabaseType(){
		return this.databaseType;
	}

}
