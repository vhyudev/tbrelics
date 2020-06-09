package com.lxtech.tbrelics.service;

import com.lxtech.tbrelics.view.ViewShopcart;
import com.lxtech.tbrelics.vo.RelicandresourceAttribute;
import com.lxtech.tbrelics.vo.ResourceCollectionVo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public interface ResourceCollectionService {

    ResourceCollectionVo findAllPage(int start, int end) throws Exception;

    ResourceCollectionVo findBySqlPage(RelicandresourceAttribute relicandresourceAttribute) throws Exception;

    ResourceCollectionVo findByLikePage(String identifier, int start, int end) throws Exception;

    List<ViewShopcart> findShopCart(long userid);

}
