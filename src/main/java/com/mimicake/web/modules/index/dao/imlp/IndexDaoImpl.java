package com.mimicake.web.modules.index.dao.imlp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mimicake.web.modules.index.dao.IndexDao;

@Repository("indexDao")
public class IndexDaoImpl implements IndexDao {

	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Map<String, Object>> getIndexData() {
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		String sql = "select * from test_data";
		result = jdbcTemplate.query(sql, new RowMapper<Map<String, Object>>(){

			@Override
			public Map<String, Object> mapRow(ResultSet rs, int index)
					throws SQLException {
				Map<String, Object> item = new HashMap<String, Object>();
				item.put("id", rs.getLong("id"));
				item.put("dataKey", rs.getString("data_key"));
				item.put("dataValue", rs.getString("data_value"));
				return item;
			}});
		return result;
	}

}
