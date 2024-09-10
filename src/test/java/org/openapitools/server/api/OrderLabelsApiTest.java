/**
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


package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import java.io.File;
import org.openapitools.server.model.GetOrderLabelsDataResponse;
import org.openapitools.server.model.PageFormatType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Партнерский API Маркета Test
 *
 * API tests for OrderLabelsApi
 */
public class OrderLabelsApiTest {

    private OrderLabelsApi client;
    private String baseUrl = "http://localhost:9080";

    @BeforeEach
    public void setup() throws MalformedURLException {
        client = RestClientBuilder.newBuilder()
                        .baseUrl(new URL(baseUrl))
                        .register(ApiException.class)
                        .build(OrderLabelsApi.class);
    }

    
    /**
     * Готовый ярлык‑наклейка для коробки в заказе
     *
     * Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateOrderLabelTest() {
        // TODO: test validations
        Long campaignId = null;
        Long orderId = null;
        Long shipmentId = null;
        Long boxId = null;
        PageFormatType format = null;
        //File response = api.generateOrderLabel(campaignId, orderId, shipmentId, boxId, format);
        //Assertions.assertNotNull(response);


    }
    
    /**
     * Готовые ярлыки‑наклейки на все коробки в одном заказе
     *
     * Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateOrderLabelsTest() {
        // TODO: test validations
        Long campaignId = null;
        Long orderId = null;
        PageFormatType format = null;
        //File response = api.generateOrderLabels(campaignId, orderId, format);
        //Assertions.assertNotNull(response);


    }
    
    /**
     * Данные для самостоятельного изготовления ярлыков
     *
     * Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderLabelsDataTest() {
        // TODO: test validations
        Long campaignId = null;
        Long orderId = null;
        //GetOrderLabelsDataResponse response = api.getOrderLabelsData(campaignId, orderId);
        //Assertions.assertNotNull(response);


    }
    
}
