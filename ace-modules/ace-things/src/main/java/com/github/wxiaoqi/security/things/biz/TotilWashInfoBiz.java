package com.github.wxiaoqi.security.things.biz;

import com.github.wxiaoqi.security.common.biz.BaseBiz;
import com.github.wxiaoqi.security.things.entity.TotilWashInfo;
import com.github.wxiaoqi.security.things.mapper.TotilWashInfoMapper;
import com.github.wxiaoqi.security.things.vo.TotilWashYearMonthVo;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 子站（公厕）便器冲洗明细表
 *
 * @author Mr.LWT
 * @email 463540703@qq.com
 * @date 2019-05-09 16:46:06
 */
@Service
public class TotilWashInfoBiz extends BaseBiz<TotilWashInfoMapper,TotilWashInfo> {


    /**
     * 能耗分析报表,查询当月每日数据
     * @param date
     * @return
     */
    public Map<String,Object> getTotilWashYearMonthDay (String date){
        List<TotilWashYearMonthVo> totilList =  mapper.getTotilWashYearMonthDay(date);
        List<Integer> dateList = new ArrayList<>();
        List<Integer> totilNumList = new ArrayList<>();
        for(TotilWashYearMonthVo totilWashYearMonthVo : totilList){
            dateList.add(new DateTime(totilWashYearMonthVo.getGatherTime()).getDayOfMonth());
            totilNumList.add(totilWashYearMonthVo.getTotalNum());
        }
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("dateList",dateList);
        resultMap.put("totilNumList",totilNumList);
        return resultMap;
    }

    /**
     * 能耗分析报表,查询当年每月数据
     * @param date
     * @return
     */
    public Map<String,Object> getTotilWashYearMonth (String date){
        List<TotilWashYearMonthVo> totilList =  mapper.getTotilWashYearMonth(date);
        List<Integer> dateList = new ArrayList<>();
        List<Integer> totilNumList = new ArrayList<>();
        for(TotilWashYearMonthVo totilWashYearMonthVo : totilList){
            dateList.add(new DateTime(totilWashYearMonthVo.getGatherTime()).getMonthOfYear());
            totilNumList.add(totilWashYearMonthVo.getTotalNum());
        }
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("dateList",dateList);
        resultMap.put("totilNumList",totilNumList);
        return resultMap;
    }


}