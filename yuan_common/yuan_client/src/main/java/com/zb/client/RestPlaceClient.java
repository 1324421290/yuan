package com.zb.client;
import com.zb.entity.Place;

import com.zb.fallback.PlaceClientFallBack;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/**
* Created by shang-pc on 2018/5/15.
*/
@FeignClient(name = "yuanpersonnelprovider", fallback = PlaceClientFallBack.class)
public interface RestPlaceClient {
@RequestMapping(value = "/getPlaceById",method = RequestMethod.POST)
public Place getPlaceById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getPlaceListByMap",method = RequestMethod.POST)
public List<Place>	getPlaceListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getPlaceCountByMap",method = RequestMethod.POST)
public Integer getPlaceCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddPlace",method = RequestMethod.POST)
public Integer qdtxAddPlace(@RequestBody Place place)throws Exception;

@RequestMapping(value = "/qdtxModifyPlace",method = RequestMethod.POST)
public Integer qdtxModifyPlace(@RequestBody Place place)throws Exception;
}

