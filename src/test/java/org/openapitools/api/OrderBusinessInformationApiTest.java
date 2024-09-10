package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetBusinessBuyerInfoResponse;
import org.openapitools.model.GetBusinessDocumentsInfoResponse;
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
 * API tests for OrderBusinessInformationApi
 */
@MicronautTest
public class OrderBusinessInformationApiTest {

    @Inject
    OrderBusinessInformationApi api;

    
    /**
     * Информация о покупателе — юридическом лице
     *
     * Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60;, &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOrderBusinessBuyerInfoTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;

        // when
        GetBusinessBuyerInfoResponse body = api.getOrderBusinessBuyerInfo(campaignId, orderId).block();

        // then
        // TODO implement the getOrderBusinessBuyerInfoTest()
    }

    
    /**
     * Информация о документах
     *
     * Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOrderBusinessDocumentsInfoTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;

        // when
        GetBusinessDocumentsInfoResponse body = api.getOrderBusinessDocumentsInfo(campaignId, orderId).block();

        // then
        // TODO implement the getOrderBusinessDocumentsInfoTest()
    }

    
}
