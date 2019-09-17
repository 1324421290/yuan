package com.zb.fallback;

import com.zb.entity.Place;

import com.zb.client.RestPlaceClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class PlaceClientFallBack implements RestPlaceClient {


    @Override
    public Place getPlaceById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Place>	getPlaceListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getPlaceCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddPlace(Place place)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyPlace(Place place)throws Exception{
        return null;
    }
}
