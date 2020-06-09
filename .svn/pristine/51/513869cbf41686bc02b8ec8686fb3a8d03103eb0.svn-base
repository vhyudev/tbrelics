package com.lxtech.tbrelics.service;

import com.lxtech.tbrelics.dataacquisition.DResource;
import com.lxtech.tbrelics.util.UpdateBatchStatus;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public interface DResourceService {
    Future<String> insertDResource(File fileDirectory) throws IOException;

    Future<String> insert(List<File> fileList) throws IOException;

    Future<String>  thumbImg(String address) throws IOException, ExecutionException, InterruptedException;

    Future<DResource>  imgAttribute(String address) throws IOException, ExecutionException, InterruptedException;


}
