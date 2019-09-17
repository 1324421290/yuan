package com.zb.mapper;
import com.zb.entity.Pushmessage;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PushmessageMapper {

	public Pushmessage getPushmessageById(@Param(value = "id") Long id)throws Exception;

	public List<Pushmessage>	getPushmessageListByMap(Map<String,Object> param)throws Exception;

	public Integer getPushmessageCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertPushmessage(Pushmessage pushmessage)throws Exception;

	public Integer updatePushmessage(Pushmessage pushmessage)throws Exception;


}
