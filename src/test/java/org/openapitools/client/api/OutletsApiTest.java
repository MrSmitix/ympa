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


package org.openapitools.client.api;

import org.openapitools.client.model.ApiClientDataErrorResponse;
import org.openapitools.client.model.ApiForbiddenErrorResponse;
import org.openapitools.client.model.ApiLimitErrorResponse;
import org.openapitools.client.model.ApiNotFoundErrorResponse;
import org.openapitools.client.model.ApiServerErrorResponse;
import org.openapitools.client.model.ApiUnauthorizedErrorResponse;
import org.openapitools.client.model.ChangeOutletRequest;
import org.openapitools.client.model.CreateOutletResponse;
import org.openapitools.client.model.EmptyApiResponse;
import org.openapitools.client.model.GetOutletResponse;
import org.openapitools.client.model.GetOutletsResponse;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
 * API tests for OutletsApi
 */
public class OutletsApiTest {

    private static OutletsApi client;
    private static final String baseUrl = "http://localhost:8080";

    @BeforeAll
    public static void setup() throws MalformedURLException {
        client = RestClientBuilder.newBuilder()
                        .baseUrl(new URL(baseUrl))
                        .register(ApiException.class)
                        .build(OutletsApi.class);
    }

    
    /**
     * Создание точки продаж
     *
     * Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOutletTest() throws Exception {
        //CreateOutletResponse response = client.createOutlet(campaignId, changeOutletRequest);
        //assertNotNull(response);
    }
    
    /**
     * Удаление точки продаж
     *
     * Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOutletTest() throws Exception {
        //EmptyApiResponse response = client.deleteOutlet(campaignId, outletId);
        //assertNotNull(response);
    }
    
    /**
     * Информация об одной точке продаж
     *
     * Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOutletTest() throws Exception {
        //GetOutletResponse response = client.getOutlet(campaignId, outletId);
        //assertNotNull(response);
    }
    
    /**
     * Информация о нескольких точках продаж
     *
     * Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOutletsTest() throws Exception {
        //GetOutletsResponse response = client.getOutlets(campaignId, pageToken, regionId, shopOutletCode, regionId2);
        //assertNotNull(response);
    }
    
    /**
     * Изменение информации о точке продаж
     *
     * Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOutletTest() throws Exception {
        //EmptyApiResponse response = client.updateOutlet(campaignId, outletId, changeOutletRequest);
        //assertNotNull(response);
    }
    
}
