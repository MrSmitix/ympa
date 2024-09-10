package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetFulfillmentWarehousesResponse;
import org.openapitools.model.GetWarehousesResponse;
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
 * API tests for WarehousesApi
 */
@MicronautTest
public class WarehousesApiTest {

    @Inject
    WarehousesApi api;

    
    /**
     * Идентификаторы складов Маркета (FBY)
     *
     * Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getFulfillmentWarehousesTest() {
        // given

        // when
        GetFulfillmentWarehousesResponse body = api.getFulfillmentWarehouses().block();

        // then
        // TODO implement the getFulfillmentWarehousesTest()
    }

    
    /**
     * Список складов и групп складов
     *
     * Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getWarehousesTest() {
        // given
        Long businessId = 56L;

        // when
        GetWarehousesResponse body = api.getWarehouses(businessId).block();

        // then
        // TODO implement the getWarehousesTest()
    }

    
}
