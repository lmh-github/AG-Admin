package com.github.wxiaoqi.security.things.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.wxiaoqi.security.things.biz.StationsBiz;
import com.github.wxiaoqi.security.things.entity.Stations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("stations")
public class StationsController extends BaseController<StationsBiz,Stations> {

    @Autowired
    StationsBiz stationsBiz;

    /**
     * 资产分析报表
     * @return
     */
    @RequestMapping(value = "/getAssetsReport", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getAssetsReport() {
        Map<String, Object> totilWashYearMonth = stationsBiz.getAssetsReport();
        return totilWashYearMonth;
    }

}