package com.lxtech.tbrelics.controller;


import com.lxtech.tbrelics.domain.LUser;
import com.lxtech.tbrelics.service.UserService;
import com.lxtech.tbrelics.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     * @throws Exception
     */
    @RequestMapping("login")
    public ResultVo login(@RequestParam("username")String username,@RequestParam("password")String  password) throws Exception {
        ResultVo resultVo = new ResultVo();
        LUser user = userService.findUser(username,password);
        if(user==null){
            resultVo.setStatus("202");
            resultVo.setMsg("用户名或密码错误");
        }else{
            resultVo.setStatus("200");
            resultVo.setMsg("用户名密码正确");
            resultVo.setResult(user);
        }
        return resultVo;
    }

    /**
     * 查询用户信息
     * @param username
     * @param password
     * @return
     * @throws Exception
     */
    @RequestMapping("findUser")
    public ResultVo findUser(@RequestParam("username")String username,@RequestParam("password")String  password) throws Exception {
        ResultVo resultVo = new ResultVo();
        LUser tUser = userService.findUser(username,password);
        if(tUser==null){
            resultVo.setStatus("202");
            resultVo.setMsg("用户不存在");
        }else{
            resultVo.setStatus("200");
            resultVo.setResult(tUser);
        }
        return resultVo;
    }
}
