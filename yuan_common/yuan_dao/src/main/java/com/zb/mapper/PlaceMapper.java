package com.zb.mapper;
import com.zb.entity.Place;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlaceMapper {

	public Place getPlaceById(@Param(value = "placeId") Long placeId)throws Exception;

	public List<Place>	getPlaceListByMap(Map<String,Object> param)throws Exception;

	public Integer getPlaceCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertPlace(Place place)throws Exception;

	public Integer updatePlace(Place place)throws Exception;


}
