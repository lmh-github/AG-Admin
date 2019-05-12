package com.github.wxiaoqi.security.things.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.wxiaoqi.security.things.biz.SystemDictBiz;
import com.github.wxiaoqi.security.things.entity.SystemDict;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("systemDict")
public class SystemDictController extends BaseController<SystemDictBiz,SystemDict> {

}