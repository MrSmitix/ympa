package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.model.GetCategoriesRequest;
import org.openapitools.model.GetCategoriesResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 */
public class CategoriesApiServiceImpl implements CategoriesApi {
    /**
     * Лимит на установку кванта продажи и минимального количества товаров в заказе
     *
     * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     */
    @Override
    public GetCategoriesMaxSaleQuantumResponse getCategoriesMaxSaleQuantum(GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Дерево категорий
     *
     * Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     */
    @Override
    public GetCategoriesResponse getCategoriesTree(GetCategoriesRequest getCategoriesRequest) {
        // TODO: Implement...
        return null;
    }

}
