/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.GetCategoriesMaxSaleQuantumRequest;
import com.prokarma.pkmst.model.GetCategoriesMaxSaleQuantumResponse;
import com.prokarma.pkmst.model.GetCategoriesRequest;
import com.prokarma.pkmst.model.GetCategoriesResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for CategoriesApi
 */
@Ignore
public class CategoriesApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final CategoriesApi api = new CategoriesApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Лимит на установку кванта продажи и минимального количества товаров в заказе
     *
     * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCategoriesMaxSaleQuantumTest() throws Exception {
        GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest = null;
    ResponseEntity<GetCategoriesMaxSaleQuantumResponse> response = api.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest , accept);

        // TODO: test validations
    }
    
    /**
     * Дерево категорий
     *
     * Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCategoriesTreeTest() throws Exception {
        GetCategoriesRequest getCategoriesRequest = null;
    ResponseEntity<GetCategoriesResponse> response = api.getCategoriesTree(getCategoriesRequest , accept);

        // TODO: test validations
    }
    
}