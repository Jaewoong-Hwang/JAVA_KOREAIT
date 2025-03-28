package Ch38.Domain.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Ch38.Domain.Dao.ConnectionPool.ConnectionItem;
import Ch38.Domain.Dao.ConnectionPool.ConnectionPool;

public abstract class Dao {
	//CONNECTION POOL
	protected ConnectionPool connectionPool;
	protected ConnectionItem connectionItem;
	
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	public Dao() throws Exception{
		//connectionPool
		connectionPool = ConnectionPool.getInstance();
	}
}
