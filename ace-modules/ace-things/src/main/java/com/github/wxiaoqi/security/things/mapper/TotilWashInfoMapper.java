package com.github.wxiaoqi.security.things.mapper;

import com.github.wxiaoqi.security.things.entity.TotilWashInfo;
import com.github.wxiaoqi.security.things.vo.TotilWashYearMonthVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 子站（公厕）便器冲洗明细表
 * 
 * @author Mr.LWT
 * @email 463540703@qq.com
 * @date 2019-05-09 16:46:06
 */
public interface TotilWashInfoMapper extends Mapper<TotilWashInfo> {


    /**
     * 能耗分析报表,查询当月每日数据
     * @param date 当前月份 例如:2019-05
     * @return
     */
    List<TotilWashYearMonthVo> getTotilWashYearMonthDay (String date);

    /**
     * 能耗分析报表,查询当年每月数据
     * @param date 当前月份 例如:2019
     * @return
     */
    List<TotilWashYearMonthVo> getTotilWashYearMonth (String date);
	
}
