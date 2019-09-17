package com.zb.client;
import com.zb.entity.Resume;

import com.zb.fallback.ResumeClientFallBack;
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
@FeignClient(name = "yuanpersonnelprovider", fallback = ResumeClientFallBack.class)
public interface RestResumeClient {
@RequestMapping(value = "/getResumeById",method = RequestMethod.POST)
public Resume getResumeById(@RequestParam("resumeId") Integer resumeId)throws Exception;
    @RequestMapping(value = "/getResumeList",method = RequestMethod.POST)
public List<Resume>	getResumeList();

@RequestMapping(value = "/getResumeListByMap",method = RequestMethod.POST)
public List<Resume>	getResumeListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getResumeCountByMap",method = RequestMethod.POST)
public Integer getResumeCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddResume",method = RequestMethod.POST)
public Integer qdtxAddResume(@RequestBody Resume resume)throws Exception;

@RequestMapping(value = "/qdtxModifyResume",method = RequestMethod.POST)
public Integer qdtxModifyResume(@RequestBody Resume resume)throws Exception;
}

