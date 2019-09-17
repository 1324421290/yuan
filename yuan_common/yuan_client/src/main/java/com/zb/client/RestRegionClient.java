package com.zb.client;
import com.zb.entity.Region;

import com.zb.fallback.RegionClientFallBack;
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
@FeignClient(name = "yuanpersonnelprovider", fallback = RegionClientFallBack.class)
public interface RestRegionClient {
@RequestMapping(value = "/getRegionById",method = RequestMethod.POST)
public Region getRegionById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getRegionListByMap",method = RequestMethod.POST)
public List<Region>	getRegionListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getRegionCountByMap",method = RequestMethod.POST)
public Integer getRegionCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddRegion",method = RequestMethod.POST)
public Integer qdtxAddRegion(@RequestBody Region region)throws Exception;

@RequestMapping(value = "/qdtxModifyRegion",method = RequestMethod.POST)
public Integer qdtxModifyRegion(@RequestBody Region region)throws Exception;
}

