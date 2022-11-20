package com.sa.com.sho.springbootmicroservicegateway.manager;

import com.google.gson.JsonElement;

import java.util.List;

public interface IProductService {
    JsonElement saveProduct(JsonElement requestBody);

    void deleteProduct(Long id);

    List<JsonElement> getAllProducts();
}
