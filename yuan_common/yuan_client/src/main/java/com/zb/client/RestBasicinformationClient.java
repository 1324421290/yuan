package com.zb.client;
import com.zb.entity.Basicinformation;

import com.zb.fallback.BasicinformationClientFallBack;
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
@FeignClient(name = "yuanpersonnelprovider", fallback = BasicinformationClientFallBack.class)
public interface RestBasicinformationClient {
@RequestMapping(value = "/getBasicinformationById",method = RequestMethod.POST)
public Basicinformation getBasicinformationById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getBasicinformationListByMap",method = RequestMethod.POST)
public List<Basicinformation>	getBasicinformationListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getBasicinformationCountByMap",method = RequestMethod.POST)
public Integer getBasicinformationCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddBasicinformation",method = RequestMethod.POST)
public Integer qdtxAddBasicinformation(@RequestBody Basicinformation basicinformation)throws Exception;

@RequestMapping(value = "/qdtxModifyBasicinformation",method = RequestMethod.POST)
public Integer qdtxModifyBasicinformation(@RequestBody Basicinformation basicinformation)throws Exception;
}

