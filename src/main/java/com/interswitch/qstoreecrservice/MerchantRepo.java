package com.interswitch.qstoreecrservice;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MerchantRepo {
    private final JdbcTemplate jdbcTemplate;

    public List<Merchant> findAll() {
        // Using camelCase in SQL query
        String sql = "SELECT * FROM merchant";

        // RowMapper with camelCase column names
        RowMapper<Merchant> rowMapper = (rs, rowNum) -> {
            Merchant merchant = new Merchant();
            merchant.setSn(rs.getLong("sn"));
            merchant.setMerchantId(rs.getString("merchantId"));
            merchant.setName(rs.getString("name"));
            merchant.setStatus(rs.getString("status"));
            merchant.setCreateTime(rs.getString("createTime"));
            merchant.setCreateBy(rs.getString("createBy"));
            merchant.setUpdateTime(rs.getString("updateTime"));
            merchant.setUpdateBy(rs.getString("updateBy"));
            return merchant;
        };

        return jdbcTemplate.query(sql, rowMapper);
    }
}
