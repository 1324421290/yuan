package com.zb.fallback;

import com.zb.entity.Basicinformation;

import com.zb.client.RestBasicinformationClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class BasicinformationClientFallBack implements RestBasicinformationClient {

//    private Basicinformation

    @Override
    public Basicinformation getBasicinformationById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Basicinformation>	getBasicinformationListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getBasicinformationCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddBasicinformation(Basicinformation basicinformation)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyBasicinformation(Basicinformation basicinformation)throws Exception{
        return null;
    }
}
