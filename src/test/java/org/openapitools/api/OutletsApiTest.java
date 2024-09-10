package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.ChangeOutletRequest;
import org.openapitools.model.CreateOutletResponse;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetOutletResponse;
import org.openapitools.model.GetOutletsResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for OutletsApi
 */
@MicronautTest
public class OutletsApiTest {

    @Inject
    OutletsApi api;

    
    /**
     * Создание точки продаж
     *
     * Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void createOutletTest() {
        // given
        Long campaignId = 56L;
        ChangeOutletRequest changeOutletRequest = new ChangeOutletRequest();

        // when
        CreateOutletResponse body = api.createOutlet(campaignId, changeOutletRequest).block();

        // then
        // TODO implement the createOutletTest()
    }

    
    /**
     * Удаление точки продаж
     *
     * Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteOutletTest() {
        // given
        Long campaignId = 56L;
        Long outletId = 56L;

        // when
        EmptyApiResponse body = api.deleteOutlet(campaignId, outletId).block();

        // then
        // TODO implement the deleteOutletTest()
    }

    
    /**
     * Информация об одной точке продаж
     *
     * Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOutletTest() {
        // given
        Long campaignId = 56L;
        Long outletId = 56L;

        // when
        GetOutletResponse body = api.getOutlet(campaignId, outletId).block();

        // then
        // TODO implement the getOutletTest()
    }

    
    /**
     * Информация о нескольких точках продаж
     *
     * Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOutletsTest() {
        // given
        Long campaignId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Long regionId = 56L;
        String shopOutletCode = "example";
        Long regionId2 = 56L;

        // when
        GetOutletsResponse body = api.getOutlets(campaignId, pageToken, regionId, shopOutletCode, regionId2).block();

        // then
        // TODO implement the getOutletsTest()
    }

    
    /**
     * Изменение информации о точке продаж
     *
     * Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updateOutletTest() {
        // given
        Long campaignId = 56L;
        Long outletId = 56L;
        ChangeOutletRequest changeOutletRequest = new ChangeOutletRequest();

        // when
        EmptyApiResponse body = api.updateOutlet(campaignId, outletId, changeOutletRequest).block();

        // then
        // TODO implement the updateOutletTest()
    }

    
}
