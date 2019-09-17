package com.zb.mapper;
import com.zb.entity.Basicinformation;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BasicinformationMapper {

	public Basicinformation getBasicinformationById(@Param(value = "id") Long id)throws Exception;

	public List<Basicinformation>	getBasicinformationListByMap(Map<String,Object> param)throws Exception;

	public Integer getBasicinformationCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertBasicinformation(Basicinformation basicinformation)throws Exception;

	public Integer updateBasicinformation(Basicinformation basicinformation)throws Exception;


}
