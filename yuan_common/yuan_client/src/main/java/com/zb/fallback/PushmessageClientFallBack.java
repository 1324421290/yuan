package com.zb.fallback;

import com.zb.entity.Pushmessage;

import com.zb.client.RestPushmessageClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class PushmessageClientFallBack implements RestPushmessageClient {


    @Override
    public Pushmessage getPushmessageById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Pushmessage>	getPushmessageListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getPushmessageCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddPushmessage(Pushmessage pushmessage)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyPushmessage(Pushmessage pushmessage)throws Exception{
        return null;
    }
}
