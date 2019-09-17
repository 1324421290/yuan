package com.zb.fallback;

import com.zb.entity.Resume;

import com.zb.client.RestResumeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class ResumeClientFallBack implements RestResumeClient {

    @Override
    public Resume getResumeById(Integer resumeId)throws Exception{
        return null;
    }

    public List<Resume>	getResumeList(){
        return null;
    }

    @Override
    public List<Resume>	getResumeListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getResumeCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddResume(Resume resume)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyResume(Resume resume)throws Exception{
        return null;
    }
}
