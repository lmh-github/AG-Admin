package com.github.wxiaoqi.security.things.biz;

import com.github.wxiaoqi.security.things.entity.ResourceAuthority;
import com.github.wxiaoqi.security.things.mapper.ResourceAuthorityMapper;
import com.github.wxiaoqi.security.common.biz.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ace on 2017/6/19.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ResourceAuthorityBiz extends BaseBiz<ResourceAuthorityMapper,ResourceAuthority> {
}
