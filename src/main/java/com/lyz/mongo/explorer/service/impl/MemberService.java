package com.lyz.mongo.explorer.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.lyz.mongo.explorer.common.constants.SystemConstant;
import com.lyz.mongo.explorer.entity.Member;
import com.lyz.mongo.explorer.service.IMemberService;
import org.springframework.stereotype.Service;
import javax.core.common.ResultMsg;

/**
 * @author liuyuze
 */
@Service
public class MemberService implements IMemberService{
    @Override
    public ResultMsg<?> login(String loginName, String loginPass) {
        return new ResultMsg<Member>(SystemConstant.RESULT_STATUS_SUCCESS,"登录成功",new Member());
    }

    @Override
    public ResultMsg<?> logout(String loginName) {
        JSONObject data = new JSONObject();
        data.put("loginHost","/index.html");
        return new ResultMsg<>(SystemConstant.RESULT_STATUS_SUCCESS,"退出成功",data);
    }
}
