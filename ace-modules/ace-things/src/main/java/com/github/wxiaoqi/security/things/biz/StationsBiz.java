package com.github.wxiaoqi.security.things.biz;

import com.github.wxiaoqi.security.common.biz.BaseBiz;
import com.github.wxiaoqi.security.things.entity.Stations;
import com.github.wxiaoqi.security.things.mapper.StationsMapper;
import com.github.wxiaoqi.security.things.vo.TotilWashYearMonthVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author Mr.LWT
 * @email 463540703@qq.com
 * @date 2019-05-05 13:52:59
 */
@Service
public class StationsBiz extends BaseBiz<StationsMapper,Stations> {

    /**
     * 资产分析报表
     * @return
     */
    public Map<String,Object> getAssetsReport (){
        List<TotilWashYearMonthVo> totilList =  mapper.getAssetsReport();
        List<String> customerNameList = new ArrayList<>(); // 客户名称数组
        List<Long> totilNumsList = new ArrayList<>(); // 便器数量
        List<Long> bumpNumsList = new ArrayList<>(); // 泵器数量
        List<Long> numsList = new ArrayList<>(); //子站数量
        for(TotilWashYearMonthVo totilWashYearMonthVo : totilList){
            customerNameList.add(totilWashYearMonthVo.getCustomerName());
            totilNumsList.add(totilWashYearMonthVo.getTotilNums());
            bumpNumsList.add(totilWashYearMonthVo.getBumpNums());
            numsList.add(totilWashYearMonthVo.getNums());
        }
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("customerNameList",customerNameList);
        resultMap.put("totilNumsList",totilNumsList);
        resultMap.put("bumpNumsList",bumpNumsList);
        resultMap.put("numsList",numsList);
        return resultMap;
    }

}