package com.github.wxiaoqi.security.things.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.wxiaoqi.security.things.biz.TotilWashInfoBiz;
import com.github.wxiaoqi.security.things.entity.TotilWashInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("totilWashInfo")
public class TotilWashInfoController extends BaseController<TotilWashInfoBiz,TotilWashInfo> {

    @Autowired
    TotilWashInfoBiz totilWashInfoBiz;


    /**
     * 能耗分析报表,查询当月每日数据
     * @param date
     * @return
     */
    @RequestMapping(value = "/getTotilWashYearMonthDay", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getTotilWashYearMonthDay(String date) {
        Map<String, Object> totilWashYearMonth = totilWashInfoBiz.getTotilWashYearMonthDay(date);
        return totilWashYearMonth;
    }

    /**
     * 能耗分析报表,查询当年每月数据
     * @param date
     * @return
     */
    @RequestMapping(value = "/getTotilWashYearMonth", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getTotilWashYearMonth(String date) {
        Map<String, Object> totilWashYearMonth = totilWashInfoBiz.getTotilWashYearMonth(date);
        return totilWashYearMonth;
    }

}