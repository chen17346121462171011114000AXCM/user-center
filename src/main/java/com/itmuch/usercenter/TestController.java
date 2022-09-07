package com.itmuch.usercenter;


import com.itmuch.usercenter.dao.share.ShareMapper;
import com.itmuch.usercenter.dao.user.UserMapper;
import com.itmuch.usercenter.domain.entity.share.Share;
import com.itmuch.usercenter.domain.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private ShareMapper shareMapper;

    @GetMapping("/test")
    public Share testInsert(){
        Share share = new Share();
        share.setContent("555555");
        shareMapper.insertSelective(share);
        return share;
    }
}
