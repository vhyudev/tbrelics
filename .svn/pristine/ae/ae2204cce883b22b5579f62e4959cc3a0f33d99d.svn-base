package com.lxtech.tbrelics.service.impl;

import com.lxtech.tbrelics.mapper.LCollectionMapper;
import com.lxtech.tbrelics.mapper.ViewResourceCollectionMapper;
import com.lxtech.tbrelics.mapper.ViewShopcartMapper;
import com.lxtech.tbrelics.service.ResourceCollectionService;
import com.lxtech.tbrelics.util.ImageUtil;
import com.lxtech.tbrelics.view.ViewResourceCollection;
import com.lxtech.tbrelics.view.ViewShopcart;
import com.lxtech.tbrelics.vo.RelicandresourceAttribute;
import com.lxtech.tbrelics.vo.ResourceCollectionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;


@Service
public class ResourceCollectionServiceImpl implements ResourceCollectionService {
    @Autowired
    private ViewResourceCollectionMapper viewResourceCollectionMapper;

    @Autowired
    private LCollectionMapper lCollectionMapper;

    @Autowired
    private ViewShopcartMapper viewShopcartMapper;

    @Override
    public ResourceCollectionVo findAllPage(int start, int end) throws Exception {
        List<ViewResourceCollection> wrcList = viewResourceCollectionMapper.findAllPage(start,end);
        int count = viewResourceCollectionMapper.findAllCount();
        ResourceCollectionVo vo =new ResourceCollectionVo();
        vo.setWrcList(wrcList);
        vo.setCount(count);
        return vo;
    }

    @Override
    public ResourceCollectionVo findBySqlPage(RelicandresourceAttribute relicandresourceAttribute) throws Exception {
        List<ViewResourceCollection> wrcList = viewResourceCollectionMapper.findBySqlPage(relicandresourceAttribute);
        int count = viewResourceCollectionMapper.findBySqlPageCount(relicandresourceAttribute);
        System.out.println("count:"+count);
        ResourceCollectionVo vo =new ResourceCollectionVo();
        vo.setWrcList(wrcList);
        vo.setCount(count);
        return vo;
    }

    @Override
    public ResourceCollectionVo findByLikePage(String identifier,int start, int end) throws Exception {
        List<ViewResourceCollection> wrcList = viewResourceCollectionMapper.findByLikePage(identifier,start,end);
        int count = viewResourceCollectionMapper.findByLikeCount(identifier);
        System.out.println("count:"+count);
        ResourceCollectionVo vo =new ResourceCollectionVo();
        vo.setWrcList(wrcList);
        vo.setCount(count);
        return vo;
    }

    @Override
    public List<ViewShopcart> findShopCart(long userid) {
        List<ViewShopcart> list =viewShopcartMapper.selectByViewShop(userid);
        return list;
    }

}
