package com.github.wxiaoqi.security.things.biz;

import org.springframework.stereotype.Service;

import com.github.wxiaoqi.security.things.entity.GroupType;
import com.github.wxiaoqi.security.things.mapper.GroupTypeMapper;
import com.github.wxiaoqi.security.common.biz.BaseBiz;
import org.springframework.transaction.annotation.Transactional;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-06-12 8:48
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GroupTypeBiz extends BaseBiz<GroupTypeMapper,GroupType> {
}
