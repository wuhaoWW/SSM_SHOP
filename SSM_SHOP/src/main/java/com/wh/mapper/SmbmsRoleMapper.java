package com.wh.mapper;

import com.wh.pojo.SmbmsRole;
import com.wh.pojo.SmbmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmbmsRoleMapper {
    long countByExample(SmbmsRoleExample example);

    int deleteByExample(SmbmsRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmbmsRole record);

    int insertSelective(SmbmsRole record);

    List<SmbmsRole> selectByExample(SmbmsRoleExample example);

    SmbmsRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmbmsRole record, @Param("example") SmbmsRoleExample example);

    int updateByExample(@Param("record") SmbmsRole record, @Param("example") SmbmsRoleExample example);

    int updateByPrimaryKeySelective(SmbmsRole record);

    int updateByPrimaryKey(SmbmsRole record);
}