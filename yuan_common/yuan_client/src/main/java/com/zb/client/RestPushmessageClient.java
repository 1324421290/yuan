package com.zb.client;
import com.zb.entity.Pushmessage;

import com.zb.fallback.PushmessageClientFallBack;
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
@FeignClient(name = "yuanpersonnelprovider", fallback = PushmessageClientFallBack.class)
public interface RestPushmessageClient {
@RequestMapping(value = "/getPushmessageById",method = RequestMethod.POST)
public Pushmessage getPushmessageById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getPushmessageListByMap",method = RequestMethod.POST)
public List<Pushmessage>	getPushmessageListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getPushmessageCountByMap",method = RequestMethod.POST)
public Integer getPushmessageCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddPushmessage",method = RequestMethod.POST)
public Integer qdtxAddPushmessage(@RequestBody Pushmessage pushmessage)throws Exception;

@RequestMapping(value = "/qdtxModifyPushmessage",method = RequestMethod.POST)
public Integer qdtxModifyPushmessage(@RequestBody Pushmessage pushmessage)throws Exception;
}

