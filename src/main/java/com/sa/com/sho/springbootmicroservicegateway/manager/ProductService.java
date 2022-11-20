package com.sa.com.sho.springbootmicroservicegateway.manager;

import com.google.gson.JsonElement;
import com.sa.com.sho.springbootmicroservicegateway.request.IProductServiceRequest;
import com.sa.com.sho.springbootmicroservicegateway.util.RetrofitUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService implements IProductService{

    @Autowired
    private IProductServiceRequest productServiceRequest;

    @Override
    public JsonElement saveProduct(JsonElement requestBody){

        return RetrofitUtils.executeInUtil(productServiceRequest.saveProduct(requestBody));
    }

    @Override
    public void deleteProduct(Long id){

        RetrofitUtils.executeInUtil(productServiceRequest.deleteProduct(id));
    }

    @Override
    public List<JsonElement> getAllProducts(){

        return RetrofitUtils.executeInUtil(productServiceRequest.getAllProducts());
    }

}
