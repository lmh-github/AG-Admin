package com.github.wxiaoqi.security.things.rest;

import com.github.wxiaoqi.security.common.msg.TableResultResponse;
import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.wxiaoqi.security.things.biz.ConcentAlarmBiz;
import com.github.wxiaoqi.security.things.entity.ConcentAlarm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("concentAlarm")
public class ConcentAlarmController extends BaseController<ConcentAlarmBiz,ConcentAlarm> {

    @Autowired
    ConcentAlarmBiz concentAlarmBiz;

    /**
     * 能耗分析报表,查询当年每月数据
     * @param date
     * @return
     */
    @RequestMapping(value = "/getAlarmYearMonth", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getAlarmYearMonth(String date) {
        Map<String, Object> totilWashYearMonth = concentAlarmBiz.getAlarmYearMonth(date);
        return totilWashYearMonth;
    }

    /**
     * 带分页的报警列表查询
     * @param params
     * @return
     */
    @RequestMapping(value = "/faultReportPage",method = RequestMethod.GET)
    @ResponseBody
    public TableResultResponse<ConcentAlarm> faultReportPage(@RequestParam Map<String, Object> params){
        //查询列表数据
        TableResultResponse<ConcentAlarm> resultResponse = concentAlarmBiz.selectPage(params);
        return resultResponse;
    }


}