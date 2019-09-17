package com.zb.mapper;
import com.zb.entity.Region;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegionMapper {

	public Region getRegionById(@Param(value = "id") Long id)throws Exception;

	public List<Region>	getRegionListByMap(Map<String,Object> param)throws Exception;

	public Integer getRegionCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertRegion(Region region)throws Exception;

	public Integer updateRegion(Region region)throws Exception;


}
