package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.BannerService;
import com.example.demo.service.CommentService;
import com.example.demo.service.NavigationService;
import com.example.demo.service.WorksService;
import com.example.demo.tool.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class WorksController {
    @Autowired
    private NavigationService navigationService;
    @Autowired
    private WorksService worksService;
    @Autowired
    private BannerService bannerService;
    @Autowired
    private CommentService commentService;
//一级查二级
    @RequestMapping(value="/first/{firstid}",method = RequestMethod.GET)

    public  List<NavigationUser> selectByFirstId(@PathVariable Integer firstid){
        NavigationUserExample example=new NavigationUserExample();
        NavigationUserExample.Criteria criteria=example.createCriteria();
       criteria.andFirstidEqualTo(firstid);
       List<NavigationUser> list= navigationService.selectByExample(example);
        return list;
    }
//    二级查三级
    @RequestMapping(value="/works/{secondid}",method = RequestMethod.GET)
    public List<WorksUser> selectBySecondId(@PathVariable Integer secondid){
        WorksUserExample example=new WorksUserExample();
        WorksUserExample.Criteria criteria=example.createCriteria();
        criteria.andSecondidEqualTo(secondid);
        List<WorksUser> list=worksService.selectByExample(example);
        return list;
    }
//    banner图的查询
    @RequestMapping(value="/banner/{bannerId}",method = RequestMethod.GET)
    public List<BannerUser> selectByBannerId(@PathVariable Integer bannerId){
        BannerUserExample example=new BannerUserExample();
        BannerUserExample.Criteria criteria=example.createCriteria();
        criteria.andBannerIdEqualTo(bannerId);
        List<BannerUser> list=bannerService.selectByExample(example);
        return list;
    }
//    根据作品查看评论
    @RequestMapping(value="/comment/{worksid}",method = RequestMethod.GET)
    public List<CommentUser> selectByWorksId(@PathVariable Integer worksid){
        CommentUserExample example=new CommentUserExample();
        CommentUserExample.Criteria criteria=example.createCriteria();
        criteria.andWorksidEqualTo(worksid);
        criteria.andTitleEqualTo(0);
        List<CommentUser> list=commentService.selectByExample(example);
        return list;
    }
//    根据评论查看回复
    @Timer
    @RequestMapping(value="/reply/{pid}",method = RequestMethod.GET)
    public List<CommentUser> selectByPid(@PathVariable Integer pid){
        CommentUserExample example=new CommentUserExample();
        CommentUserExample.Criteria criteria=example.createCriteria();
        criteria.andPidEqualTo(pid);
        criteria.andTitleEqualTo(1);
        List<CommentUser> list=commentService.selectByExample(example);
        return list;
    }
//    查看所有精品评论

    @RequestMapping(value="/good",method = RequestMethod.GET)
     public List<CommentUser> select(){
        CommentUserExample example=new CommentUserExample();
        CommentUserExample.Criteria criteria=example.createCriteria();
        criteria.andStatusEqualTo(1);
        criteria.andTitleEqualTo(0);
        Long start=System.currentTimeMillis();
        System.out.println("start :"+start+"ms");
        List<CommentUser> list=commentService.selectByExample(example);
        Long end=System.currentTimeMillis();
        System.out.println("end :"+end+"ms");
        Long result=end-start;
        System.out.println("消耗时间："+result+"ms");
        return list;
    }
    }




