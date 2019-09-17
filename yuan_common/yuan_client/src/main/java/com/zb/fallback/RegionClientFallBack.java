package com.zb.fallback;

import com.zb.entity.Region;

import com.zb.client.RestRegionClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class RegionClientFallBack implements RestRegionClient {


    @Override
    public Region getRegionById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Region>	getRegionListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getRegionCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddRegion(Region region)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyRegion(Region region)throws Exception{
        return null;
    }
}
