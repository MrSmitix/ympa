package org.openapitools.controller;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetBusinessBuyerInfoResponse;
import org.openapitools.model.GetBusinessDocumentsInfoResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for OrderBusinessInformationController
 */
@MicronautTest
public class OrderBusinessInformationControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    OrderBusinessInformationController controller;

    /**
     * This test is used to validate the implementation of getOrderBusinessBuyerInfo() method
     *
     * The method should: Информация о покупателе — юридическом лице
     *
     * Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60;, &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getOrderBusinessBuyerInfoMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;

        // when
        GetBusinessBuyerInfoResponse result = controller.getOrderBusinessBuyerInfo(campaignId, orderId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/business-buyer' to the features of getOrderBusinessBuyerInfo() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getOrderBusinessBuyerInfoClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/business-buyer").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@517ca63d");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetBusinessBuyerInfoResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getOrderBusinessDocumentsInfo() method
     *
     * The method should: Информация о документах
     *
     * Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getOrderBusinessDocumentsInfoMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;

        // when
        GetBusinessDocumentsInfoResponse result = controller.getOrderBusinessDocumentsInfo(campaignId, orderId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/documents' to the features of getOrderBusinessDocumentsInfo() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getOrderBusinessDocumentsInfoClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/documents").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@479729d3");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetBusinessDocumentsInfoResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
